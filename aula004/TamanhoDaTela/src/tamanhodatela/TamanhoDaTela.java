package tamanhodatela;
import java.awt.Toolkit;

public class TamanhoDaTela {

    public static void main(String[] args) {
        Toolkit dimensao = Toolkit.getDefaultToolkit();
        var altura = dimensao.getScreenSize().height;
        var largura = dimensao.getScreenSize().width;
        
        System.out.println("O tamanho do meu monitor e "+altura+" x "+largura);
       
    }
    
}
