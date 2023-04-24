	package ejemplotabla.modelo;
	
	import javax.swing.table.*;
	import javax.swing.event.*;
	import java.util.LinkedList;
	
	/**
	 * U14A02_EjemploTabla
	 * 
	 * @author Raul Rubio
	 *
	 * @version 1.0
	 *
	 */
	
	public class ModeloTablaAlumno implements TableModel{
	    public static int COLUMNAS=5;
	
	    @SuppressWarnings("rawtypes")
		private LinkedList datos = new LinkedList();
	    @SuppressWarnings("rawtypes")
		private LinkedList listeners = new LinkedList();
	
	
	    /**
	     * Método de acceso para obtener el numero de columnas de la tabla.
	     * @return Valor entero que representa el número de columnas de la tabla.
	     * Se corresponde con el valor de la constante <i>COLUMNAS</i>
	     */
	    public int getColumnCount() { return COLUMNAS; }
	
	    /**
	     * Método de acceso para obtener el número de filas de la tabla.
	     * @return Variable de tipo Entero que corresponde con el número de filas de la tabla.
	     */
	    public int getRowCount() { return datos.size(); }
	
	    /**
	     * Método de acceso para obtener el contenido de la celda cuya posición es
	     * (IndiceFila, IndiceColumna)
	     * @return Objeto que esté en la intersección entre la fila y la columna indicada.
	     * @param IndiceColumna columna de la posición por la que se pregunta el valor.
	     * @param IndiceFila fila de la posición para la que se pregunta el valor.
	     */
	    public Object getValueAt(int IndiceFila, int IndiceColumna){
	        Alumno aux = (Alumno)(datos.get(IndiceFila));
	
	        switch (IndiceColumna)
	        {
	            case 0: return aux.getNombre();
	            case 1: return aux.getApellido1();
	            case 2: return aux.getApellido2();
	            case 3: return aux.getDNI();
	            case 4: return aux.getSel();
	            default: return null;
	        }
	    }
	
	    /**
	     * Método para eliminar una fila de la tabla.
	     * @param fila numero de fila que se desea eliminar.
	     */
	    public void borraAlumno (int fila){
	        datos.remove(fila);
	
	        TableModelEvent evento = new TableModelEvent (this, fila, fila,
	            TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE);
	
	        avisaSuscriptores (evento);
	    }
	
	    /**
	     * Método para añadir una fila a la tabla.
	     * @param nuevoAlumno instancia de la clase Alumno que corresponde con el
	     * que se quiere añadir a la tabla.
	     */
	    @SuppressWarnings("unchecked")
		public void anhadeAlumno (Alumno nuevoAlumno){
	        Alumno n = nuevoAlumno;
	        datos.add (n);
	
	        TableModelEvent evento;
	        evento = new TableModelEvent (this, this.getRowCount()-1,
	            this.getRowCount()-1, TableModelEvent.ALL_COLUMNS,
	            TableModelEvent.INSERT);
	
	        avisaSuscriptores (evento);
	    }
	
	    /**
	     * Método que permite añadir los gestores de eventos de la tabla.
	     */
	    @SuppressWarnings("unchecked")
		public void addTableModelListener(TableModelListener l){
	        listeners.add (l);
	    }
	
	    /**
	     * Método para obtener la clase a la que pertenecen los valores de
	     * la columna indicada como parámetro.
	     * @return Clase a la que corresponden los objetos que se encuentran en la columna indicada.
	     * @param Variable de tipo entero que representa el número de columna del que se
	     * desea obtener la clase de los objetos que contiene.
	     */
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		public Class getColumnClass(int IndiceColumna){
	        switch (IndiceColumna)
	        {
	            case 0: return String.class;
	            case 1: return String.class;
	            case 2: return String.class;
	            case 3: return String.class;
	            case 4: return Boolean.class;
	            default: return Object.class;
	        }
	    }
	
	    
	    /**
	     * Método para obtener el nombre de la columna indicada.
	     * @return variable de tipo cadena que representa el nombre de la columna indicada.
	     * @param IndiceColumna número entero que corresponde con la columna de la que se
	     * desea obtener el nombre.
	     */
	    public String getColumnName(int IndiceColumna){
	        switch (IndiceColumna)
	        {
	            case 0: return "Nombre";
	            case 1: return "Ape 1";
	            case 2: return "Ape 2";
	            case 3: return "DNI";
	            case 4: return "Seleccionar";
	            default: return null;
	        }
	    }
	
	    /**
	     * Método que permite saber si una celda que se encuentra en la intersección entre
	     * la fila y la columna indicadas es editable.
	     * @return Variable de tipo Boolean que representa si la celda es editable o no.
	     * @param IndiceColumna número entero que corresponde con la columna de la celda.
	     * @param IndiceFila número entero que corresponde con la fila de la celda.
	     */
	    public boolean isCellEditable(int IndiceFila, int IndiceColumna){
	        if(IndiceColumna == 4)
	            return true;
	        return false;
	    }
	
	    /**
	     * Método que borra los gestores de eventos.
	     */
	    public void removeTableModelListener(TableModelListener l){
	        listeners.remove(l);
	    }
	
	    /**
	     * Método modificador para cambiar el valor de una celda de la tabla.
	     * @param valor nuevo valor que se quiere dar a la celda.
	     * @param IndiceFila número entero que corresponde a la fila en la que se
	     * encuentra la celda que se desea modificar de la tabla.
	     * @param IndiceColumna número entero que corresponde con la columna en la
	     * que se encuentra la celda que se desea modificar de la tabla.
	     */
	    public void setValueAt(Object valor, int IndiceFila, int IndiceColumna){
	        Alumno aux = (Alumno)(datos.get(IndiceFila));
	
	        switch (IndiceColumna)
	        {
	            case 0: aux.setNombre((String)valor); break;
	            case 1: aux.setApellido1((String)valor); break;
	            case 2: aux.setApellido2((String)valor); break;
	            case 3: aux.setDNI((String)valor); break;
	            case 4: aux.setSel((Boolean)valor); break;
	            default: break;
	        }
	
	        TableModelEvent evento = new TableModelEvent (this, IndiceFila, IndiceFila,
	            IndiceColumna);
	        avisaSuscriptores (evento);
	    }
	
	    /**
	     * Método que avisa a los gestores de que se ha producido un evento.
	     */
	    private void avisaSuscriptores (TableModelEvent evento){
	        int i;
	
	        for (i=0; i<listeners.size(); i++)
	            ((TableModelListener)listeners.get(i)).tableChanged(evento);
	    }
	
	}
	
