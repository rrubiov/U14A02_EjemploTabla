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

public class GestorVaciar implements ActionListener
{
    private ModeloTablaAlumno modeloAnagramas;
    private ArrayList<Alumno> alumnos;
    
    public GestorVaciar(ModeloTablaAlumno modeloAnagramas, ArrayList<Alumno> alumnos)
    {
        this.modeloAnagramas=modeloAnagramas;
        this.alumnos = alumnos;
    }
    public void actionPerformed(ActionEvent e) 
    {
        int filas = modeloAnagramas.getRowCount();
        while(filas>0)
        {
            filas--;
            modeloAnagramas.borraAlumno(filas);
        }
    }
}
