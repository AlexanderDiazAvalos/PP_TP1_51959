public class App {
    public static void main(String[] args) {
        //creamos eventos
        EventoUniversitario eventouni1 = new EventoUniversitario("1", "clase jueves", 500.0, false);
        EventoUniversitario eventouni2 = new EventoUniversitario("2" , "clase sabado" , 250.0, false );
        EventoUniversitario eventouni3 = new EventoUniversitario("4", "clase domingo", 00.0 , true);
        //evento copia
        EventoUniversitario eventouni4 = new EventoUniversitario(eventouni1);

        //creamos salas
        Sala sala1 =  new Sala(01, "pequeña");
        Sala sala2 =  new Sala(02, "mediana");
        Sala sala3 =  new Sala(03, "grande");
        Sala sala4 =  new Sala(04, "mediana");

        //asiganmos las salas
        eventouni1.asignarSala(sala1);
        eventouni2.asignarSala(sala2);
        eventouni3.asignarSala(sala3);
        eventouni4.asignarSala(sala1);


        //asignamos y creamos las actividades de cada evento
        eventouni1.crearActividad(01, "Taller Java", 20, "Taller", true);
        eventouni2.crearActividad(02, "Charla de JavaScript", 30, "Charla", false);
        eventouni3.crearActividad(03, "Taller JavaII", 50, "Taller", true);
        eventouni4.crearActividad(01, "Taller Java", 20, "Taller", true);

        //cramos a los estudiantes
        Estudiante estudiante1 = new Estudiante("51959", "Alexander");
        Estudiante estudiante2 = new Estudiante("51960", "Franco");
        Estudiante estudiante3 = new Estudiante("51961", "Santiago");
        Estudiante estudiante4 = new Estudiante("51962", "Mauro");
        Estudiante estudiante5 = new Estudiante("51963", "Valen");
        Estudiante estudiante6 = new Estudiante("51964", "Martin");
        Estudiante estudiante7 = new Estudiante("51965", "Josefina");
        Estudiante estudiante8 = new Estudiante("51966", "Martina");
        Estudiante estudiante9 = new Estudiante("51967", "Camila");
        Estudiante estudiante10 = new Estudiante("51968", "Andres");

        //ahora pasamos a inscribirlos en las actividades
        //los getters para obtener la primera actividad asociada al evento
        Actividad actividad1 = eventouni1.getActividades().get(0);
        Actividad actividad2 = eventouni2.getActividades().get(0);
        Actividad actividad3 = eventouni3.getActividades().get(0);
        Actividad actividad4 = eventouni4.getActividades().get(0);

        //la inscripcion
        actividad1.inscribir(estudiante1);
        actividad1.inscribir(estudiante2);
        actividad1.inscribir(estudiante3);
        actividad1.inscribir(estudiante4);

        actividad2.inscribir(estudiante5);
        actividad2.inscribir(estudiante6);
        actividad2.inscribir(estudiante7);
        actividad2.inscribir(estudiante8);
        actividad2.inscribir(estudiante9);
        actividad2.inscribir(estudiante1);

        actividad3.inscribir(estudiante1);
        actividad3.inscribir(estudiante3);
        actividad3.inscribir(estudiante2);
        actividad3.inscribir(estudiante7);
        actividad3.inscribir(estudiante10);

        actividad4.inscribir(estudiante1);
        actividad4.inscribir(estudiante10);


        //mostramos datos
        System.out.println("DATOS DEL EVENTO 1");
        eventouni1.mostrarDatos();
        for (Actividad actividad : eventouni1.getActividades()) {
            actividad1.mostrarIdentificacion();
        }

        System.out.println("DATOS DEL EVENTO 2");
        eventouni2.mostrarDatos();
        for (Actividad actividad : eventouni2.getActividades()){
            actividad2.mostrarIdentificacion();
        }

        System.out.println("DATOS DEL EVENTO 3");
        eventouni3.mostrarDatos();
        for (Actividad actividad : eventouni3.getActividades()){
            actividad3.mostrarIdentificacion();
        }

        System.out.println("DATOS DEL EVENTO 4");
        eventouni4.mostrarDatos();
        for (Actividad actividad : eventouni4.getActividades()){
            actividad4.mostrarIdentificacion();
        }

        System.out.println("Cantidad total de eventos: " + EventoUniversitario.getCantidadEventos());

        //mostramos
        System.out.println("Lista de Inscripciones: ");

        actividad1.mostrarInscripciones();
        actividad2.mostrarInscripciones();
        actividad3.mostrarInscripciones();
        actividad4.mostrarInscripciones();


    }
}