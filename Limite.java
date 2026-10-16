public class Limite {
    public static void main(String[] args) { 
        System.out.println("byte  : " + Byte.MIN_VALUE + " à " + Byte.MAX_VALUE); 
        System.out.println("short : " + Short.MIN_VALUE + " à " + Short.MAX_VALUE); 
        System.out.println("int   : " + Integer.MIN_VALUE + " à " + Integer.MAX_VALUE); 
        System.out.println("long  : " + Long.MIN_VALUE + " à " + Long.MAX_VALUE); 
        System.out.println("double max : " + Double.MAX_VALUE); 
        char c = 'A'; 
        System.out.println("Code Unicode de A : " + (int) c); 
        System.out.println("Caractère suivant : " + (char) (c + 1)); 
    }
}
