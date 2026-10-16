public class MethodesString {
    public static void main(String[] args) { 
        String saisie = "   Sac en cuir de Ngaye Mékhé   "; 
        String produit = saisie.strip(); 
        System.out.println("[" + produit + "] : " + produit.length() + " caractères"); 
        System.out.println("Majuscules : " + produit.toUpperCase()); 
        System.out.println("Premier mot : " + produit.substring(0, produit.indexOf(' '))); 
        System.out.println("Contient 'cuir' ? " + produit.contains("cuir")); 
        System.out.println("Dernier caractère : " + produit.charAt(produit.length() - 1)); 
 
        String ligneCsv = "PRD-014;Pagne wax 6 yards;7500;42"; 
        String[] champs = ligneCsv.split(";"); 
        System.out.println("Référence = " + champs[0] + ", prix = " + champs[2]); 
        int stock = Integer.parseInt(champs[3]); 
        System.out.println("Stock après vente de 2 : " + (stock - 2)); 
 
        System.out.println(String.join(" | ", "Wave", "Orange Money", "Espèces")); 
        System.out.println("-".repeat(30)); 
        System.out.println("Commande n°%05d : %s".formatted(42, "validée")); 
    }
    
}
