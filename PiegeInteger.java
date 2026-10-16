public class PiegeInteger {
     public static void main(String[] args) { 
        Integer a = 100, b = 100; 
        Integer c = 1000, d = 1000; 
        System.out.println(a == b);        // true  (valeurs en cache) 
        System.out.println(c == d);        // false (deux objets distincts !) 
        System.out.println(c.equals(d));   // true  (compare les valeurs) 
        Integer inconnu = null; 
        // int x = inconnu;  // NullPointerException à l'unboxing 
    }
    
}
