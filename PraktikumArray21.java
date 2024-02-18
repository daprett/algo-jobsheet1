import java.util.Scanner;
import java.util.Arrays;
public class PraktikumArray21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []MK= {"Agama","Konsep TI","CTPS","Matematika Dasar","Bahasa Inggris"
    ,"Dasar Pemrograman","Praktikum Daspro","PAMB"};//array nama mata kuliah 
        int []sks = {2,2,2,2,2,2,2,3,2};
        String[]huruf = new String[MK.length];
        double[]nilaisetara = new double[MK.length];
        double[]nilai = new double[MK.length];

        for (int i = 0; i < MK.length; i++) {
            System.out.print("Masukkan nilai "+MK[i]+" : ");
             nilai[i] = sc.nextInt();

            if (nilai[i] >= 80 && nilai[i] <= 100) {
                huruf[i] = "A";
                nilaisetara[i] = 4.0;
            } else if (nilai[i] >= 73 && nilai[i] < 80) {
                huruf[i] = "B+";
                nilaisetara[i] = 3.5;
            } else if (nilai[i] >= 65 && nilai[i] < 73) {
                huruf[i] = "B";
                nilaisetara[i] = 3.0;
            } else if (nilai[i] >= 60 && nilai[i] < 65) {
                huruf[i] = "C+";
                nilaisetara[i] = 2.5;
            } else if (nilai[i] >= 50 && nilai[i] < 60) {
                huruf[i] = "C";
                nilaisetara[i] = 2.0;
            } else if (nilai[i] >= 39 && nilai[i] < 50) {
                huruf[i] = "D";
                nilaisetara[i] = 1.0;
            } else {
                huruf[i] = "E";
                nilaisetara[i] = 0.0;
            }
        }
        
        System.out.printf("%-20s %-20s %-10s %-10s %n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Nilai Setara");
        double totalNilaiSetara = 0;
        double totalsks = 0;
        for (int i = 0; i < MK.length; i++) {
            System.out.printf("%-20s %-20s %-10s %-10.2f%n", MK[i],nilai[i], huruf[i], nilaisetara[i]);
            totalNilaiSetara += nilaisetara[i] * sks[i];
            totalsks += sks[i];
        }

        double ipSemester = totalNilaiSetara / totalsks;
        System.out.printf("%nIP Semester: %.2f%n", ipSemester);
    }
}
