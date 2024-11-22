package modelo;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBase;
    private String sinopsis;
    private int tiempoDuracionMinutos;

    //GET Y SETS PARA PODER COMUNICARSE CON EL MAIN
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public boolean isIncluidoEnElPlanBase() {
        return incluidoEnElPlanBase;
    }

    public void setIncluidoEnElPlanBase(boolean incluidoEnElPlanBase) {
        this.incluidoEnElPlanBase = incluidoEnElPlanBase;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDuracionMinutos() {
        return tiempoDuracionMinutos;
    }

    public void setTiempoDuracionMinutos(int tiempoDuracionMinutos) {
        this.tiempoDuracionMinutos = tiempoDuracionMinutos;
    }

    //METODO
    public void fichaTecnica(){
        System.out.println("***FICHA TÉCNICA***");
        System.out.println("Nombre de la Titulo: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de duración: " + getTiempoDuracionMinutos() + " minutos");
    }
}
