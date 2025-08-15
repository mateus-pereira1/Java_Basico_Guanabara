/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificapernas;


import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class VerificaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int pernas = teclado.nextInt();
        String tipo;
        
        switch(pernas){
            case 1:
            tipo = "Saci";
            break;
            case 2:
            tipo = "Bípede";
            break;
            case 4:
            tipo = "Quadrupede";
            break;
            case 6:
            tipo = "Aranha";
            break;
            default:
            tipo = "et";
            break;
        }
        
        System.out.println(tipo);
        
    }
    
}
