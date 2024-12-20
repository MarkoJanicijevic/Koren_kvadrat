import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Koren_kvadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki broj: ");
        int x = sc.nextInt();
        kvadrat_koren(x);
        
    }
    public static void kvadrat_koren (int x){
        int kvadrat = x * x;
        double koren = sqrt(x);
        System.out.println("X na kvadrat je " + kvadrat);
        System.out.println("Kvadratni koren od x je: " + koren);
    }

}
