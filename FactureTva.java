import java.util.Scanner;

public class FactureTva {
    public static void main(String[] args){
        final double TAUX_TVA = 0.18;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer le nom du produit");
        String nom=sc.nextLine();
        System.out.println("Veuiller entrer le prix unitaire hors taxe");
        long prixUni=sc.nextLong();
        System.out.println("Veuiller entrer la quantite du produit");
        long quantite=sc.nextLong();
        long montantHT=prixUni*quantite;
        long tva = Math.round(montantHT * TAUX_TVA);
        long montantTTC=montantHT+tva;
        System.out.printf("%n%-30s %s%n", "Produit :", nom);
        System.out.printf("%-20s %12d FCFA%n", "Montant HT :", montantHT);
        System.out.printf("%-20s %12d FCFA%n", "Montant TTC :", montantTTC);

        sc.close();
    }
    
}
