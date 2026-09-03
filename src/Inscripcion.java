import java.time.LocalDate;

public class Inscripcion {

    private LocalDate fecha;
    private String estado;

    //relacion con estudiante y actividad
    private Estudiante estudiante;
    private Actividad actividad;

    //Constructor
    public Inscripcion (LocalDate fecha, String estado, Estudiante estudiante, Actividad actividad){
        this.fecha = fecha;
        this.estado = estado;
        this.estudiante = estudiante;
        this.actividad = actividad;

    }



    //setters y getters

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalDate getFecha() {
        return fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getEstado() {
        return estado;
    }

//agregamos los seter y geters de estudiante y actividad

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }
    public Actividad getActividad() {
        return actividad;
    }

}
