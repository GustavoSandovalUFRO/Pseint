/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero1;

import java.util.Scanner;

/**
 *
 * @author Gus
 */
public class Cajero1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner intro  = new Scanner(System.in); 
        int max = 0;
        int cant = 0;
        int numero = 0;
        int min = 0;
        System.out.println("ingres la cantida de numeros");
        cant = intro.nextInt();
        for (int i = 0; i < cant; i++) { /* compara el numero ingresado con el contador cantidad para asi buscar el maximo valor que se le puede dar a la variable max*/
            System.out.println("ingrese un numero");
            numero = intro.nextInt();
            if(i ==0){
              max = numero;
              min = numero;
        }
            if (numero > max){
               max = numero;  
           }
            if (numero <min){
               min = numero;
           }
        
    
        System.out.println("el maximo de los numeros es: "+max);
        System.out.println("El numero menor es: "+min);
}  