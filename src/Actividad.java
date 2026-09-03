
//hacemos esto para poder utilizar la lista de insscripciones que pide el ejercicio

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {

    private int id;
    private String titulo;
    private int cupoMaximo;

    //seteo el cupo minimo, para que funcione, ya que actividad reecibe solo 3 valores del evento universitario
    public static final int cupoMinimo = 3;


    //agregamos la lista como atributo de las instancias de activdad, para que cada actividad tenga su lista
    private List<Inscripcion> inscripciones;


    //Constructor
    public Actividad (int id, String titulo, int cupoMaximo){
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;


        //agregamos la lista en el constructor para que se inicialice para cada instancia creada
        this.inscripciones = new ArrayList<>();

    }

    //metodos

    //el metodo de inscripcion de alumno
    public Inscripcion inscribir (Estudiante estudiente) {

            //le pasamos a la clase inscripcion los datos
        Inscripcion inscripcion = new Inscripcion(LocalDate.now(), "activo", estudiente, this);

        //guardamos la la inscricion en la lista
        inscripciones.add(inscripcion);
        return inscripcion; //como defini Inscripcion inscribir (---) debe volver un objeto Inscripcion
    }

    //mostrar inscripciones
    public void mostrarInscripciones() {
        System.out.println("Actividad: "+ titulo);

        if (inscripciones.isEmpty()) {
            System.out.println("Aun no hay inscripciones");
        }

            for (Inscripcion inscripcion : inscripciones) {
                System.out.println("    Estudiante: " + inscripcion.getEstudiante().getNombre());
                System.out.println("    Nro. de Legajo: " + inscripcion.getEstudiante().getLegajo());
                System.out.println("    Fecha de inscripcion: " + inscripcion.getFecha());
                System.out.println("    Estado de Inscripcion: " + inscripcion.getEstado());
                System.out.println("................................");
            }
        if (inscripciones.size() < cupoMinimo) {
            System.out.println("No supera el cupo mínimo");
        }

        System.out.println("-----------------------------------------------------");


    }

    //mostrar Identificación
    public final void mostrarIdentificacion (){
        System.out.println("IDENTIFICACIÓN DE LA ACTIVIDAD: ");
        System.out.println("    ID: " + id);
        System.out.println("    Titulo: " + titulo);
        System.out.println("    Costo total: " + calcularCostoMateriales());
        System.out.println("------------------------------------------------");
    }

    //calcular costo de materiales
    public abstract double calcularCostoMateriales ();


    //gettipo de tipo abstract obligando a toda la clase Actividad a volverse abstract
    public abstract String getTipo ();


    //seters y geters
    public void setTitulo (String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setCupoMaximo (int cupoMaximo){
        this.cupoMaximo = cupoMaximo;
    }
    public int getCupoMaximo(){
        return cupoMaximo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getCupoMinimo() {
        return cupoMinimo;
    }
}
