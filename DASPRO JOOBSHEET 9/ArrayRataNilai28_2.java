import java.util.Scanner;

public class ArrayRataNilai28_2 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double totalLulus = 0;
        double totalTdkLulus = 0;
        double rataLulus, rataTdkLulus;
        int jmlMhs = 0;
        int countLulus = 0;
        int countTdkLulus = 0;

        System.out.println("Masukkan jumlah Mahasiswa : ");
        jmlMhs = input28.nextInt();

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input28.nextInt();
            if (nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                countTdkLulus++;
            }
        }

        if (countLulus > 0){
            rataLulus = totalLulus / countLulus;
            System.out.println("Rata-rata nilai yang Tidak Lulus : "+rataLulus);
        } else {
            System.out.println("Tidak ada mahsiswa yang lulus");
        }
        if (countTdkLulus > 0){
            rataTdkLulus = totalTdkLulus / countTdkLulus;
            System.out.println("Rata-rata nilai yang tidak lulus : " +rataTdkLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus");
        }
    }
}