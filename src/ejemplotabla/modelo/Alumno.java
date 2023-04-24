package ejemplotabla.modelo;

/**
 * U14A02_EjemploTabla
 * 
 * @author Raul Rubio
 *
 * @version 1.0
 *
 */

public class Alumno 
{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String DNI;
    private Boolean sel;
    
    public Alumno()
    {
        this.nombre="";
        this.apellido1="";
        this.apellido2="";
        this.DNI="";
        this.sel=false;
    }
    
    public Alumno(String nombre, String apellido1, String apellido2, String DNI)
    {
        this.DNI=DNI;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.sel=false;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param apellido1 the apellido1 to set
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * @return the apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @param apellido2 the apellido2 to set
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the sel
     */
    public Boolean getSel() {
        return sel;
    }

    /**
     * @param sel the sel to set
     */
    public void setSel(Boolean sel) {
        this.sel = sel;
    }
}
