public class Recu {
    public static void main(String[] args) { 
        String[] articles = {"Bissap 1 L", "Thiakry 500 g", "Café Touba 250 g"}; 
        long[] prix = {1_500, 1_000, 2_000}; 
 
        StringBuilder sb = new StringBuilder(); 
        sb.append("REÇU TERANGASHOP\n"); 
        for (int i = 0; i < articles.length; i++) { 
            sb.append(i + 1).append(". ") 
            .append(articles[i]) 
            .append(" : ").append(prix[i]).append(" FCFA\n"); 
        } 
        sb.append("=".repeat(16)); 
        System.out.println(sb);                 // println appelle toString() 
 
        StringBuilder code = new StringBuilder("TS2026"); 
        code.insert(2, '-').append("-0042"); 
        System.out.println(code + " / inversé : " + new StringBuilder("bissap").reverse()); 
    } 
    
}
