public class Taller extends Actividad {

    private boolean requiereNotebook;

    public Taller(int id, String titulo, int cupoMaximo, boolean requiereNotebook) {
        super(id, titulo, cupoMaximo);
        this.requiereNotebook = requiereNotebook;
    }

    //métodos

    @Override
    public double calcularCostoMateriales(){
    if (requiereNotebook){
        return 5000;
    }
    else return 2000;
    }

    @Override
    public String getTipo(){
    return "Taller";
    }

    //setters y getters

    public void setRequiereNotebook(boolean requiereNotebook) {
        this.requiereNotebook = requiereNotebook;
    }
    public boolean getRequiereNotebook(){
        return requiereNotebook;
    }
}
