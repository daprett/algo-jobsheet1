import java.util.Scanner;

public class PraktikumPerulangan21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        
        int nimDigitTerakhir = Integer.parseInt(nim.substring(nim.length() - 2));

        int n = nimDigitTerakhir;
        if (n < 10) {
            n += 10;
        }
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " "); 
                }
            }
        }

        
        
    }
}