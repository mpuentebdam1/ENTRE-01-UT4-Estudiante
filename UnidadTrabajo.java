/**
 * Un objeto de esta clase guarda informaci�n de una unidad
 * de trabajo
 * Toda UT adem�s del nombre,  fecha de finalizaci�n,
 * y peso en la evaluaci�n tiene asociado un objeto ponderaci�n
 * que incluye las ponderaciones usadas para cada instrumento de evaluaci�n
 */
public class UnidadTrabajo {
    private String nombre;
    private Fecha fechaFin;
    private int pesoUnidad;
    private PonderacionInstrumentos ponderacion;

    /**
     * Constructor 1
     */
    public UnidadTrabajo(String nombre, int dia, int mes, int year, int peso,
                         int controles, int actividades, int proyectos) {
       this.nombre = nombre;
       this.pesoUnidad = peso;
       this.fechaFin = new Fecha(dia, mes, year);
       controles = controles;
       actividades = 0;
       proyectos = 0;
       
       
    }

    /**
     * Accesor nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Mutador nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Accesor fecha de fin de UT
     */
    public Fecha getFechaFin() {
        return fechaFin;
    }

    /**
     * Mutador fecha de fin de UT
     */
    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Accesor peso de la UT en la evaluaci�n
     */
    public double getPesoUnidad() {
        return this.pesoUnidad;
    }

    /**
     * Accesor para el peso de la UT
     */
    public void setPesoUnidad(int pesoUnidad) {
        this.pesoUnidad = pesoUnidad;
    }

    /**
     * Accesor ponderaci�n
     */
    public PonderacionInstrumentos getPonderacion() {
        return ponderacion;
    }

    /**
     * Mutador ponderaci�n
     */
    public void setPonderacion(PonderacionInstrumentos ponderacion) {
        this.ponderacion = ponderacion;
    }

    /**
     * Devuelve true si la UT actual ha finalizado antes
     * que la recibida como par�metro
     */
    public boolean anteriorA(UnidadTrabajo unidad) {
        return fechaFin.antesQue(unidad.getFechaFin());
    }

    /**
     * Devuelve una copia (clon) de la unidad de trabajo actual con el nombre
     * "Copia de " + nombre de la UT actual
     * Se clonan tambi�n los objetos que incluya
     */
    public UnidadTrabajo clonar(UnidadTrabajo unidadActual) {
        UnidadTrabajo unidadClon = new UnidadTrabajo;
        return unidadClon;
    }

    /**
     * Representaci�n textual de la UT
     */
    public String toString() {
        String str = "Unidad de trabajo - " + this.nombre +
                "\n\tFecha finalizaci�n: " + this.getFechaFin().toString() +
                " | Peso UT: " + this.pesoUnidad + "%\n";
        str += this.ponderacion;
        return str;
    }

    /**
     * Este m�todo se ha incluido solo para testear la clase m�s f�cilmente
     */
    public void print() {
        System.out.println(this.toString());

    }


     
}
