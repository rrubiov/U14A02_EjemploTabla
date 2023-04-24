package ejemplotabla;

import ejemplotabla.vista.Vista;
import ejemplotabla.modelo.Alumno;
import java.util.ArrayList;

/**
 * U14A02_EjemploTabla
 * 
 * @author Raul Rubio
 *
 * @version 1.0
 *
 */

public class EjemploTabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        
        Alumno a1 = new Alumno("nom1", "ape11", "ape12", "DNI1"); alumnos.add(a1);
        Alumno a2 = new Alumno("nom2", "ape21", "ape22", "DNI2"); alumnos.add(a2);
        Alumno a3 = new Alumno("nom3", "ape31", "ape32", "DNI3"); alumnos.add(a3);
        Alumno a4 = new Alumno("nom4", "ape41", "ape42", "DNI4"); alumnos.add(a4);
        Alumno a5 = new Alumno("nom5", "ape51", "ape52", "DNI5"); alumnos.add(a5);
        Alumno a6 = new Alumno("nom6", "ape61", "ape62", "DNI6"); alumnos.add(a6);
        Alumno a7 = new Alumno("nom7", "ape71", "ape72", "DNI7"); alumnos.add(a7);
        Alumno a8 = new Alumno("nom8", "ape81", "ape82", "DNI8"); alumnos.add(a8);
        Alumno a9 = new Alumno("nom9", "ape91", "ape92", "DNI9"); alumnos.add(a9);
        Alumno a10 = new Alumno("nom10", "ape101", "ape102", "DNI10"); alumnos.add(a10);
        
        Vista v = new Vista(alumnos);
        v.setVisible(true);
    }
}
