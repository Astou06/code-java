import java.util.Scanner;

public class compteur_qui_deborde {
    public static void main(String[] args){
        int volumeJour=350000*12500;
        int volumeunmois=volumeJour*30;
        System.out.println("le volume par jour en int = "+volumeJour);
        System.out.println("le volume sur 30 jours en int = "+volumeunmois );
        long volumJour=350000*12500;
        long volumUnmois=volumJour*30;
        System.out.println("le volume par jour en long = "+volumeJour);
        System.out.println("le volume sur 30 jours en long = "+volumUnmois );
        /*quand on utilise int le resultat est negatif on obtient =  -1893986176 et lorsqu'on utilise long
            on obtient un chiffre positif. Alors on obtient ces resutats different car int Un int occupe 32 bits
            et ne peut pas dépasser 2 147 483 647 et cela depasse largement le volume journaliere tandis que le 
            long occupe 64 bits ce qui comble large le debordement*/
        int nbreTransac=350000;
        int  montMoy=12500;
        int  nbreJour=30;
        try {
        int resultat = Math.multiplyExact(Math.multiplyExact(nbreTransac, montMoy), nbreJour);
        System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
        System.out.println("Erreur : compteur en debordement (" + e.getMessage() + ")");
}
/*Math.multiplyExact est une méthode qui multiplie deux nombres comme d'habitude,
 mais qui lance une ArithmeticException (message « integer overflow ») 
 si le résultat ne tient pas dans le type. Au lieu d'un résultat faux silencieux,
  le programme s'arrête avec une erreur claire.Donc si c'est int on affiche un message d'erreur
  si c'est un long il affiche le resultat*/

    }
    
}
