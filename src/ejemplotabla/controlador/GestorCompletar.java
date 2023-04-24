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

public class GestorCompletar implements ActionListener
{
    private ModeloTablaAlumno modeloAnagramas;
    private ArrayList<Alumno> alumnos;
    
    public GestorCompletar(ModeloTablaAlumno modeloAnagramas, ArrayList<Alumno> alumnos)
    {
        this.modeloAnagramas=modeloAnagramas;
        this.alumnos = alumnos;
    }
    public void actionPerformed(ActionEvent e) 
    {
       /*
         * No haría falta borrar las celdas porque la tabla está vacía. 
         * La forma de vaciar la tabla es eliminando alreves.
         */
        
        //Borro los datos que hay en la tabla
        int filas = modeloAnagramas.getRowCount();
        while(filas>0)
        {
            filas--;
            modeloAnagramas.borraAlumno(filas);
        }
        
        //Añado los datos a la tabla
        for (int i = 0; i < alumnos.size(); i++) {
                modeloAnagramas.anhadeAlumno(alumnos.get(i));
                
        } 
    }
}
