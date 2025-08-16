/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s=0, p = 0, i = 0, maior = 0, incremento = 0;
        double media = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(Valor Zero Imterrompe)</em></html>"));
            //Verifica garante que o zero não seja considerado
            if(n != 0){
            //Soma o total de valores
            incremento ++;
            
            //Mostra se os números são Ímpares ou Pares
            if(n % 2 == 0){
                p++;
            } else{
                i++;
            }
            //Mostra os números Maiores que 100
            if(n > 100){
                maior++;
            }
            
            //Faz a média dos valores
            s +=n;
            media = s/incremento;
            
            
            }
            
            
        } while(n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <br>_______________"+"<br>Total de Valores: "+incremento+"<br>Total de pares: "+p+"<br>Total de Ímpares: "+i+"<br>Acima de 100: "+maior+"<br>Media dos valores: "+media);
    }
    
}
