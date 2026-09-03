## PP_TP1_51959
#Trabajo Practico 1 Programación Orientada a Objetos en Java Unidad 1 - Fundamentos de la POO e implementación básica en Java

## Descripción del proyecto

El proyecto consiste en la implementación de un sistema para gestionar eventos universitarios.

El sistema permite:

- Crear eventos universitarios.
- Asignar salas a los eventos.
- Crear actividades asociadas a los eventos.
- Gestionar distintos tipos de actividades.
- Registrar estudiantes.
- Realizar inscripciones de estudiantes a las actividades.
- Mostrar la información de los eventos y sus actividades.
- Calcular el costo estimado de los eventos.
- Mostrar las inscripciones realizadas.

## Clases principales

### EventoUniversitario

Representa un evento universitario 

Permite calcular el costo estimado, asignar salas y crear actividades.

### Actividad

Es una clase abstracta que representa una actividad de un evento.

Además, define métodos abstractos para calcular el costo de los materiales y obtener el tipo de actividad.

### Charla

Especialización de `Actividad`.

Las charlas no tienen costo de materiales.

### Taller

Especialización de `Actividad`.

El costo de materiales depende de si requiere notebook:

- Con notebook: $5000
- Sin notebook: $2000

### Estudiante

Representa a un estudiante 

### Inscripción

Representa la inscripción de un estudiante a una actividad.

### Sala

Representa una sala donde puede realizarse un evento.
