package ejemplotabla.vista;

import ejemplotabla.modelo.Alumno;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 * U14A02_EjemploTabla
 * 
 * @author Raul Rubio
 *
 * @version 1.0
 *
 */

public class Vista extends JFrame
{
    private ArrayList<Alumno> alumnos;
    
    public Vista(ArrayList<Alumno> alumnos)
    {
        this.alumnos = alumnos;
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelDeLaVista pdlv = new PanelDeLaVista(alumnos);
        
        this.add(pdlv);
        this.setSize(500, 230); //Tamaño
        this.setResizable(true); //Redimensionable
        this.setLocationRelativeTo(null); //Centrada en la pantalla
        this.setVisible(true); //Visible
    }
}
