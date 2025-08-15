package idiomasistema;
import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        var meuIdioma = idioma.getLanguage();
        
        System.out.print("Meu idioma local e ");
        System.out.println(meuIdioma.toString());
    }
    
}
