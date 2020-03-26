/**
 *
 * @author Juan Marroquin
 */
public class Paciente implements Comparable<Paciente> {
    private String Nombre;
    private String Sintoma;
    private String Prioridad;
    /**
     * Constructor de la clase paciente
     * @param Nombre
     * @param Sintoma
     * @param Prioridad 
     */
    public Paciente(String Nombre, String Sintoma, String Prioridad) {
        this.Nombre = Nombre;
        this.Sintoma = Sintoma;
        this.Prioridad = Prioridad;
    }
    // getters y setter nombre
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    // getters y setters sintoma
    public String getSintoma() {
        return Sintoma;
    }
    public void setSintoma(String Sintoma) {
        this.Sintoma = Sintoma;
    }
    // getters y setters prioridad
    public String getPrioridad() {
        return Prioridad;
    }
    public void setPrioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }
    /**
     * override compareto
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Paciente o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
