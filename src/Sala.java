
public class Sala {

    //atributos de las estancias
    private int id;
    private String nombre;

    //Constructor
    public Sala (int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    //seters y geters

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

}
