public class Estudiante {

    private String legajo;
    private String nombre;

    //Constructor de alumno
    public Estudiante(String legajo, String nombre){
        this.legajo = legajo;
        this.nombre = nombre;

    }
    //seter y geters

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    public String getLegajo(){
        return legajo;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
