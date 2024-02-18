import java.util.Scanner;

/**
 * PraktikumPemilihan21
 */
public class PraktikumPemilihan21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas, kuis, uts, uas;

        while (true) {
            System.out.print("Masukkan nilai tugas : ");
            tugas = sc.nextInt();
            System.out.print("Masukkan nilai kuis : ");
            kuis = sc.nextInt();
            System.out.print("Masukkan nilai UTS : ");
            uts = sc.nextInt();
            System.out.print("Masukkan nilai UAS : ");
            uas = sc.nextInt();
            if (tugas >= 0 && tugas <= 100 && kuis >= 0 && kuis <= 100 && uts >= 0 && uts <= 100 && uas >= 0
                    && uas <= 100) {
                break;
            } else {
                System.out.println("Nilai harus berada di range 0-100");
            }

        }
        double persen = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);

        if (persen > 80) {
            System.out.println("Nilai Huruf A");
        } else if (persen >= 80) {
            System.out.println("Nilai Huruf B+");
        } else if (persen >= 73) {
            System.out.println("Nilai Huruf B");
        } else if (persen >= 65) {
            System.out.println("Nilai Huruf C+");
        } else if (persen >= 60) {
            System.out.println("Nilai Huruf C");
        } else if (persen >= 50) {
            System.out.println("Nilai Huruf D");
        } else if (persen <= 39) {
            System.out.println("Nilai Huruf E");
        }
        String message = persen <= 50 ? "tidak lulus" : "lulus";
        System.out.println("nilai akhir " + persen);
        System.out.println(message);

    }

}
