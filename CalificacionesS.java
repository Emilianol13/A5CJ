import javax.swing.*;

public class CalificacionesS {
    //DEFINICIÓN DE LAS VARIABLES DE USO DEL PROGRAMA
    public String nombreA;
    public int[] calificaciones;
    public int promedio = 0, promedioF = 0, inicio = 0;

    //DEFINICIÓN DEL CONSTRUCTOR PARA EL PROGRAMA
    public CalificacionesS(String nombre, int[] calificaciones) {
        this.nombreA = nombre;
        this.calificaciones = calificaciones;
    }

    //MÉTODOS DENTRO DEL PROGRAMA
    public int Promedio (int [] calificaciones){
        for (int i = 0; i < calificaciones.length; i++) {
            promedio += calificaciones[i];
        }
        promedioF = promedio / 5;
        return promedioF;
        }
    public Character CalificacionP(int promedio){
        Character promedioJ = 'P';
        if(promedio>90){
            promedioJ = 'A';
        } else if (promedio>80) {
            promedioJ = 'B';
        }
        else if (promedio>70) {
            promedioJ = 'C';
        }
        else if (promedio>60) {
            promedioJ = 'D';
        }
        else if (promedio>50) {
            promedioJ = 'E';
        }
        else if (promedio<=50) {
            promedioJ = 'F';
        }
        return promedioJ;
    }
    public void infoGeneral(String nombreA, int promedio, Character calificacion) {
        System.out.println("El nombre del alumno, es: " + nombreA);
        System.out.println("Las calificaciones del alumno, son: ");
        int inicio = 1;

        for (int E = 0; E <5; E++) {
            System.out.println("Calificación " + inicio + " :"+" "+calificaciones[E]);
            inicio= inicio + 1;
        }
        System.out.println("El promedio obtenido del alumno, es de: "+promedio);
        System.out.println("La calificación obtenida del alumno, es de: "+calificacion);
    }



}
