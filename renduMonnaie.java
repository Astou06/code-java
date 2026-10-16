import java.util.Scanner;

public class renduMonnaie {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Veuillez entrer le montant à rendre(multiple de 5)");
        long somme = sc.nextLong();
        if( somme % 5 !=0){
            System.out.println("le montant n'est pas un multiple de 5 ");
        }else{
        long reste = somme;
        long nb10mil = reste/10000;
        reste %= 10000; 
        System.out.println(nb10mil + " x 10000");
        long nb5mil = reste/5000;
        reste %= 5000;
        System.out.println(nb5mil + " x 5000");
        long nb2mil = reste/2000;
        reste %= 2000;
        System.out.println(nb2mil + " x2000");
        long nbMil = reste/1000;
        reste %= 1000;
        System.out.println(nbMil + " x 1000");
        long nb5cent = reste/500;
        reste %= 500;
        System.out.println(nb5cent + " x 500");
        long deuxCent50 = reste/250;
        reste %= 250;
        System.out.println(deuxCent50 + " x 250");
        long centF = reste/100;
        reste %= 100;
        System.out.println(centF + " x 100");
        long Cinq0 = reste/50;
        reste %= 50;
        System.out.println(Cinq0 + " x50");
        long vingCinq = reste/25;
        reste %= 25;
        System.out.println(vingCinq + " x 25");
        long dixF = reste/10;
        reste %= 10;
        System.out.println(dixF + " x 10");
        long deureum = reste/5;
        reste %= 5;
        System.out.println(deureum + " x 5");
        System.out.println("somme = "+somme);
        System.out.println("reste ="+reste);
        }

    }
    
}
