package ejemplotabla.vista;

import ejemplotabla.controlador.GestorCompletar;
import ejemplotabla.controlador.GestorEliminar;
import ejemplotabla.controlador.GestorVaciar;
import ejemplotabla.modelo.Alumno;
import ejemplotabla.modelo.ModeloTablaAlumno;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * U14A02_EjemploTabla
 * 
 * @author Raul Rubio
 *
 * @version 1.0
 *
 */

public class PanelDeLaVista extends JPanel
{
    private ArrayList<Alumno> alumnos;
    
    public PanelDeLaVista(ArrayList<Alumno> alumnos)
    {
        this.alumnos = alumnos;
        
        ModeloTablaAlumno modeloAlumnos = new ModeloTablaAlumno();
        JTable tabla = new JTable(modeloAlumnos);
        JScrollPane scroll = new JScrollPane();
        scroll.setViewportView(tabla);
        scroll.setColumnHeaderView(tabla.getTableHeader());
		scroll.setBounds(20, 10, 460, 150);
		this.add(scroll);
		
        JButton b_completar = new JButton("Completar");
        JButton b_limpiar = new JButton("Vaciar");
        JButton b_eliminar = new JButton("Eliminar");
        
        b_completar.addActionListener(new GestorCompletar(modeloAlumnos, alumnos));
        b_limpiar.addActionListener(new GestorVaciar(modeloAlumnos, alumnos));
        b_eliminar.addActionListener(new GestorEliminar(modeloAlumnos, alumnos));
        
        
        b_completar.setBounds(90,170,100,30);
        b_limpiar.setBounds(200,170,100,30);
        b_eliminar.setBounds(310,170,100,30);
        
        this.setLayout(null);
        
        
        this.add(b_completar);
        this.add(b_limpiar);
        this.add(b_eliminar);
        
    }
}
