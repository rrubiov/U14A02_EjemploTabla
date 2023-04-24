package ejemplotabla.controlador;

import ejemplotabla.modelo.Alumno;
import ejemplotabla.modelo.ModeloTablaAlumno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * U14A02_EjemploTabla
 * 
 * @author Raul Rubio
 *
 * @version 1.0
 *
 */

public class GestorEliminar implements ActionListener
{
    private ModeloTablaAlumno modeloAnagramas;
    private ArrayList<Alumno> alumnos;
    
    public GestorEliminar(ModeloTablaAlumno modeloAnagramas, ArrayList<Alumno> alumnos)
    {
        this.modeloAnagramas=modeloAnagramas;
        this.alumnos = alumnos;
    }
    public void actionPerformed(ActionEvent e) 
    {
        //Eliminar todos los datos
        int filas = modeloAnagramas.getRowCount();
        while(filas>0)
        {
            filas--;
            modeloAnagramas.borraAlumno(filas);
        }
        
        //Obtengo los datos que no he seleccionado para eliminarlos
        ArrayList<Alumno> alumnos2 = new ArrayList<Alumno>();
        
        for (int i = 0; i < alumnos.size(); i++) {
            if(alumnos.get(i).getSel() == false)
                alumnos2.add(alumnos.get(i));
        }
        
        //Añadir los datos que corresponden
        for (int i = 0; i < alumnos2.size(); i++) {
                modeloAnagramas.anhadeAlumno(alumnos2.get(i));
        } 
    }
}
