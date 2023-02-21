package ACTIVIDADES;

import java.util.Scanner;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emiliano
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DEFINICIÓN DE LAS VARIABLES DE USO 
        int numU1, numU2;
        float sumaT, restaT, multT, divT, resT;
        
        //INGRESO DE NÚMEROS AL SISTEMA 
        numU1 = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar el primer número: "));
        numU2 = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar el segundo número: "));
        
        //OPREACIONES CON LOS NÚMEROS
        sumaT = numU1 + numU2;
        restaT = numU1 - numU2;
        multT = numU1 * numU2;
        divT = numU1 / numU2;
        resT = numU1 % numU2;
        
        //IMPRESIÓN DEL RESULTADO DE LAS OPERACIONES
        System.out.println("El resultado de la suma es: "+sumaT);
        System.out.println("El resultado de la resta es: "+restaT);
        System.out.println("El resultado de la multiplicación es: "+sumaT);
        System.out.println("El resultado de la división es: "+divT);
        System.out.println("El resultado del residuo es: "+resT);
    }
    
}
