/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remuneracion;
import java.util.Scanner;
import java.util.*;


public class Remuneracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner intro = new Scanner(System.in);
    int grado;
    int Sueldo;
    int Isapre;
    int Hextra;
    int horas;
    int sueldo_base =0 ;
    int sueldobase1;
    int ExTotal= 0;
    int tipo;
    int i;
    double sueldo_isapre;
    
 
        do{
            System.out.println("Ingrese el grado del trabajador");
            System.out.println("1: 450.000   -  2: 550.000   -  3 700.000" );
            grado= intro.nextInt();        
            switch (grado){
                case 1: 
                    sueldo_base = 450000; break; 
                case 2: 
                    sueldo_base = 550000; break;              
                case 3: 
                    sueldo_base = 700000; break;
                default: System.out.println("Tiene que ser un grado correspondiente ( 1-2-3");
            }        
        }while((grado<1) || (grado>3));
        
        
        System.out.println("Ingrese cantidad de horas trabajadas ");{
        horas = intro.nextInt();
        Hextra= (horas - 40);    
        if (Hextra >= 1 && Hextra <=3)
            ExTotal = (2000*Hextra);
            sueldobase1= (sueldo_base+ExTotal);
        if (Hextra >=4 && Hextra <=7)
            ExTotal = (3000*Hextra);
            sueldobase1= (sueldo_base+ExTotal);
        if (Hextra >=7)
            ExTotal = (3500*Hextra);
             sueldobase1= (sueldo_base+ExTotal);
        System.out.println("La cantidad de horas extra son " +Hextra);
        
        
 
                
                
        }  
        System.out.println("Ingrese si es tipo Isapre o AFP");
        tipo = intro.nextInt();
        if ((tipo>=2) && (tipo <3));
                System.out.println("Ingrese el tipo de Isapre a la que pertenece el trabajador");
                System.out.println("1.-  Colmena " );
                System.out.println("2.-  Ban Medica " );
                System.out.println("3.-  Vida 3 " );
                System.out.println("4.-  Fonasa");
                Isapre = intro.nextInt();
                 switch (Isapre){
                        case 1: 
                            sueldo_isapre = sueldobase1*0.065;
                            sueldobase1 = sueldobase1 - (int)(sueldo_isapre);
                            break;
                        case 2: 
                            sueldo_isapre = sueldobase1*0.073;
                            sueldobase1 = sueldobase1 - (int)(sueldo_isapre);
                            break;    
                        case 3: 
                            sueldo_isapre = sueldobase1*0.07;
                            sueldobase1 = sueldobase1 - (int)(sueldo_isapre);
                            break;
                        case 4: 
                            sueldo_isapre = sueldobase1*0.07;
                            sueldobase1 = sueldobase1 - (int)(sueldo_isapre);
                            break;
                 }
        }
        if ((tipo >= 2) && (tipo<3)); 
                System.out.println("Ingrese el tipo de Isapre a la que pertenece el trabajador");
                System.out.println("1.-  BanSander " );
                System.out.println("2.-  Geometrica SA " );
                System.out.println("3.-  Cumprum " );
                System.out.println("4.-  Provida");
                Isapre = intro.nextInt();
                 switch (Isapre){
                        case 1: 
                            sueldo_isapre = sueldobase1*0.12;
                            sueldobase1 = sueldobase1 - (int)(sueldo_isapre);
                            break;
                        case 2: 
                            sueldo_isapre = sueldobase1*0.134;
                            sueldobase1 = sueldobase1 - (int)(sueldo_isapre);
                            break;    
                        case 3: 
                            sueldo_isapre = sueldobase1*0.123;
                            sueldobase1 = sueldobase1 - (int)(sueldo_isapre);
                            break;
                        case 4: 
                            sueldo_isapre = sueldobase1*0.129;
                            sueldobase1 = sueldobase1 - (int)(sueldo_isapre);
                            break;       
                 }     
               
          
}
    

