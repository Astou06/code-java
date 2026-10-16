package TerengaShop;
public class Ticket { 
    static final int TAUX_TVA = 18;              // en pourcentage 
    static final int TAUX_REMISE = 10; 
    static final long SEUIL_REMISE = 5_000; 
    static final long FRAIS_LIVRAISON = 1_500; 
 
    public static void main(String[] args) { 
        long prixBissap = 1_500, prixThiakry = 1_000; 
        int qteBissap = 3, qteThiakry = 2; 
 
        long sousTotal = prixBissap * qteBissap + prixThiakry * qteThiakry; 
        long remise = sousTotal > SEUIL_REMISE ? sousTotal * TAUX_REMISE / 100 : 0; 
        long totalHT = sousTotal - remise; 
        long tva = Math.round(totalHT * TAUX_TVA / 100.0); 
        long totalTTC = totalHT + tva + FRAIS_LIVRAISON; 
 
        System.out.println("========== TERANGASHOP =========="); 
        System.out.printf("%-20s %3d x %6d%n", "Bissap 1 L", qteBissap, prixBissap); 
        System.out.printf("%-20s %3d x %6d%n", "Thiakry 500 g", qteThiakry, prixThiakry); 
        System.out.println("---------------------------------"); 
        System.out.printf("%-20s %12d%n", "Sous-total", sousTotal); 
        System.out.printf("%-20s %12d%n", "Remise " + TAUX_REMISE + "%", -remise); 
        System.out.printf("%-20s %12d%n", "Total HT", totalHT); 
        System.out.printf("%-20s %12d%n", "TVA " + TAUX_TVA + "%", tva); 
        System.out.printf("%-20s %12d%n", "Livraison", FRAIS_LIVRAISON); 
        System.out.printf("%-20s %12d FCFA%n", "TOTAL TTC", totalTTC); 
    } 
} 
