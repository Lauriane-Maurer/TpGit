import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int choix = 0;

        Anglais vAnglais = new Anglais();
        vAnglais.addDico("Bonjour", "Hello");
        Breton vBreton = new Breton();
        vBreton.addDico("Bonjour", "Demat");

        System.out.println("Choisir votre langue pour dire bonjour ");
        System.out.println("1 : Anglais");
        System.out.println("2 : Breton");

        while (choix!=1 && choix !=2) {
            choix = scan.nextInt();
        if (choix != 1 && choix != 2) {
            System.out.println("Veuillez saisir une valeur valide (1 ou 2) :");
        }
    }
            if (choix == 1) {
                System.out.println(vAnglais.getTraduction("Bonjour"));
            } else if (choix == 2) {
            System.out.println(vBreton.getTraduction("Bonjour"));
            }
    }
        //Fenetre f = new Fenetre();
        //f.setVisible(true);
}