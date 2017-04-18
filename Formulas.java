/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulas;
import java.util.Scanner;
/**
 *
 * @author Gus
 */
public class Formulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cubo;
        int num1;
        int cuadrado;
        double areaCirculo;
        double PeriCirculo;
        int i =0;
        int a = 0;
        int factorial=1;
        int N;
        int valor;
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        num1 = intro.nextInt();
        
        while (num1 ==0){
               System.out.println("Numero invalido, intentelo otra vez");
        }
        if (num1 > 0){
            cuadrado = num1* num1;
            System.out.println("El cuadrado de "+ num1 + "es " +cuadrado);
            cubo = (num1*num1*num1);
            System.out.println("El cubo del numero "+num1 +"es "+cubo);
            areaCirculo = (cuadrado*3.14);
            System.out.println("El area de un circulo radio "+num1+ "es: " +areaCirculo);
            PeriCirculo = (2*(num1*3.14));
            System.out.println("El perimetro de un circulo radio "+num1+" es "+PeriCirculo);
            
        
        }
        for( i=1 ; i <(num1 + 1);i++){
         if(num1 % i == 0){
             a++;
        }
    }
        if (a!=2){            
            System.out.println("El Número no es primo");  
        }else{
            System.out.println("El Número es primo");
        }
        for ( i = num1; i > 0; i--) {
               factorial = factorial * i;
    }
        System.out.println("Ingrese un número entre 1 y 100");
        N = intro.nextInt();
        System.out.println("ingrese valor que cree que fue el ingresado antesriormente");
        valor = intro.nextInt();
        if (valor > N){
            System.out.println("El numero ingresado es mayor que el numero desconocido");
            
        }
        if (valor < N){
            System.out.println("El numero ingresado en menor que el numero desconocido");
        }
        
            while (valor!= N){
                System.out.println("Ingrese otro valor");
                valor = intro.nextInt();
            if (valor > N){
                System.out.println("El numero ingresado es mayor que el numero desconocido");
            }
            if (valor < N){
                System.out.println("El numero ingresado en menor que el numero desconocido");
            }
            boolean primo = false;
            int rango;
            int registro=0;
            int k;
            int j;
            int Num;
            System.out.println("Introduce el numero desde cual quieres contar los primos: ");
            Num=intro.nextInt();
            System.out.println("Hasta que numero deseas contar los primos?: ");
            rango=intro.nextInt();
            System.out.println();
            for(i=Num;i<=rango;i++)
            primo=true;
            j=2;
            while(j<=i-1 && primo==true)
            {
            if(i%j==0)
            primo=false;
            j++;
            }
            if(primo==true)
            {
            registro++;
            System.out.println(i+(" Es numero primo"));
            }


}
    }
}

            
    
