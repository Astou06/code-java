package TerengaShop;
import java.util.Scanner; 
 
public class SaisieCommande { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nom du client : "); 
        String nom = sc.nextLine(); 
        System.out.print("Quantité : "); 
        int quantite = sc.nextInt(); 
        System.out.print("Prix unitaire (FCFA) : "); 
        long prix = sc.nextLong(); 
        long total = quantite * prix; 
        System.out.printf("%n%s doit payer %d FCFA.%n", nom, total); 
    } 
} 
 

