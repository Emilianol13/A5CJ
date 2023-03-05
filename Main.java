import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nombreA;
        int [] calificaciones = new int[5];

        nombreA= JOptionPane.showInputDialog("Favor de ingresar el nombre del alumno: ");

        for(int E=0; E<5; E++){
            calificaciones[E] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación del alumno en el parámetro del 0 al 100: "));
        }

        CalificacionesS calificaciones1 = new CalificacionesS(nombreA, calificaciones);

        int Prom = calificaciones1.Promedio(calificaciones1.calificaciones);
        Character Calif = calificaciones1.CalificacionP(Prom);
        calificaciones1.infoGeneral(nombreA, Prom, Calif);

    }
}