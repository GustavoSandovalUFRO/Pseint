/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibionacci;
import java.util.Scanner;
/**
 *
 * @author Gus
 */
public class Fibionacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int cont1 = 0;
        int cont2 = 1;
        int extra;            
        int limite = 1000;
        
        System.out.println(cont1);
        System.out.println(cont2);
        
        
       while (cont2 + cont1 <= limite){
             extra = cont1;
             cont1 = cont2;
             cont2 = extra + cont1;
             System.out.println(cont2);
    
        
       
       
    }
    }
}

