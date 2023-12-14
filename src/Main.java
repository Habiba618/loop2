import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /** //C(n,r) = n! / (r! * (n-r)!)
        int n, r;
        double nF = 1, rF = 1, nRF = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("n'i girin: ");
        n = sc.nextInt();
        System.out.print("r'yi girin: ");
        r = sc.nextInt();
        // n!
        for (int i = 1; i <= n; i++) {
            nF *= i;
        }
        // r!
        for (int j = 1; j <= r; j++) {
            rF *= j;
        }
        // (n-r)!
        for (int k = 1; k <= (n - r); k++) {
            nRF *= k;
        }
        // C(n, r) hesapla
        double C = nF / (rF * nRF);
        System.out.println("C(" + n + ", " + r + ") = " + C);
        sc.close();*/

       /*int n, r;
       int a=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("ededi girin: ");
        n = sc.nextInt();
        System.out.print("ustu girin: ");
        r = sc.nextInt();
        for(int i=1; i<=r;i++){
            a=a*n;
        }
        System.out.println("n^r = "+ a); */
        int n;
        int a=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        n = sc.nextInt();
        while (n != 0) {

           int qaliq= n%10;
           a=a+qaliq;
           n=n/10;
        }
        System.out.println("ededin reqemleri cemi: " + a);

    }
}
