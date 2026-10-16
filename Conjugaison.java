import java.util.*;

public class Conjugaison {
    static String[] pronom = {"je", "tu", "il/elle", "nous", "vous", "ils/elles"};

    // colle le radical devant chaque terminaison
    static String[] avec(String base, String[] fin) {
        String[] r = new String[6];
        for (int i = 0; i < 6; i++) r[i] = base + fin[i];
        return r;
    }

    static void afficher(String temps, String[] f) {
        System.out.println("\n== " + temps + " ==");
        for (int i = 0; i < 6; i++) {
            // je -> j' devant une voyelle ou un h
            if (i == 0 && "aeiouyhé".indexOf(f[0].charAt(0)) >= 0)
                System.out.println("j'" + f[0]);
            else
                System.out.println(pron[i] + " " + f[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Verbe à l'infinitif : ");
        String v = sc.nextLine().trim().toLowerCase();

        String rad = v.substring(0, v.length() - 2); // radical
        String fin = v.substring(v.length() - 2);    // er / ir / re

        String[] present, imparfait;
        String baseFutur = v, participe;

        if (fin.equals("er")) {            // groupe 1
            present = avec(rad, new String[]{"e","es","e","ons","ez","ent"});
            imparfait = avec(rad, new String[]{"ais","ais","ait","ions","iez","aient"});
            participe = rad + "é";
        } else if (fin.equals("ir")) {     // groupe 2
            present = avec(rad, new String[]{"is","is","it","issons","issez","issent"});
            imparfait = avec(rad + "iss", new String[]{"ais","ais","ait","ions","iez","aient"});
            participe = rad + "i";
        } else if (fin.equals("re")) {     // groupe 3 (-re)
            present = avec(rad, new String[]{"s","s","","ons","ez","ent"});
            imparfait = avec(rad, new String[]{"ais","ais","ait","ions","iez","aient"});
            baseFutur = rad + "r";         // rendre -> rendr
            participe = rad + "u";
        } else {
            System.out.println("Verbe non géré.");
            return;
        }

        String[] futur = avec(baseFutur, new String[]{"ai","as","a","ons","ez","ont"});
        String[] cond = avec(baseFutur, new String[]{"ais","ais","ait","ions","iez","aient"});
        String[] avoir = {"ai","as","a","avons","avez","ont"};
        String[] passeCompose = new String[6];
        for (int i = 0; i < 6; i++) passeCompose[i] = avoir[i] + " " + participe;

        afficher("Présent", present);
        afficher("Imparfait", imparfait);
        afficher("Futur simple", futur);
        afficher("Conditionnel présent", cond);
        afficher("Passé composé", passeCompose);
    }
}
