import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {

    //Atributos de cada instancia de eventouniversitario

    public final String id;
    private String titulo;
    private Double costoBase;
    private Boolean gratuito;

    //agregar lo nuevo
    private Sala sala;
    private List<Actividad> actividades;

    //Atributo de la clase, compartido por todas las instancias

    private static int cantidadEventos;

    //contador para cantidad de eventos estatico
    static {
        cantidadEventos = 0;
    }

    //Constructor de evento
    public EventoUniversitario(String id, String titulo, Double costoBase, Boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        ++cantidadEventos;
        //Agragamos la lista para las actividades
        this.actividades = new ArrayList<>();
    }

    //Constructor copia evento
    public EventoUniversitario(EventoUniversitario otroeventoUniversitario) {
        this.id = otroeventoUniversitario.id;
        this.titulo = otroeventoUniversitario.titulo;
        this.costoBase = otroeventoUniversitario.costoBase;
        this.gratuito = otroeventoUniversitario.gratuito;
        ++cantidadEventos;
        this.sala = otroeventoUniversitario.sala;
        this.actividades = new ArrayList<>(otroeventoUniversitario.actividades);
    }

    //METODOS

    //calcular el costo estimado
    public double calcularCostoEstimado() {
        if (gratuito) {
            return 0;
        }

        double costoTotal = costoBase;

        for (Actividad actividad : actividades) {
            costoTotal += actividad.calcularCostoMateriales();
        }

        return costoTotal * 1.21;
    }
    //asignar sala
    public void asignarSala (Sala sala){
        this.sala = sala;
    }


    //crear actividad
    public void crearActividad(int id, String titulo, int cupo, String tipo, boolean requiereNotebook) {

        Actividad actividad;
        //dependiendo del tipo de activdad:
        if (tipo.equals("Charla")) {
            actividad = new Charla(id, titulo, cupo);
        } else if (tipo.equals("Taller")) {
            actividad = new Taller(id, titulo, cupo, requiereNotebook);
        }
        else {
            System.out.println("Actividad no válida");
            return;
        }
        actividades.add(actividad);

    }


    //mostrar datos
    void mostrarDatos () {
        System.out.println("    Id: " + id);
        System.out.println("    Titulo: " + titulo);
        System.out.println("    Costo estimado: " + calcularCostoEstimado());
        System.out.println("    Gratuito: " + gratuito);

        //agregamos las salas a los datos mostrados, pero como puede no tener valor, hay que tenerlo en cuenta
        if (sala != null) {
            System.out.println("    Sala para el evento: " + getSala().getId() + " - " + getSala().getNombre());
        } else {
            System.out.println("    Aun no hay sala asignada");
        }

        System.out.println("-------------------------------------");

    }
        //setters y getters

    //id
    public String getId(){
        return id;
    }

    //titulo
    public void setTitulo (String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    //costo base
    public void setCostoBase (Double costoBase){
        this.costoBase = costoBase;
    }
    public Double getCostoBase(){
        return costoBase;
    }

    //gratuito
    public void setGratuito(Boolean gratuito) {
        this.gratuito = gratuito;
    }
    public Boolean getGratuito(){
        return gratuito;
    }
    public static int getCantidadEventos(){
        return cantidadEventos;
    }

    //para las salas
    public Sala getSala() {
        return sala;
    }

    //para la lista de actividades
    public List<Actividad> getActividades() {
        return actividades;
    }

}


