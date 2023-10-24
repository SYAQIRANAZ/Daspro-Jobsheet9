import java.util.Scanner;

public class LinierSearch28_1 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int hasil =  0;
        int jml = 0;
        System.out.println("Masukkan jumlah elemen array");
        jml = input28.nextInt();

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = input28.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari: ");
        key = input28.nextInt();
        for (int i = 0; i < jml; i++){
            if (arrayInt[i] == key){
                hasil = i;
                System.out.println("Key ada di posisi indeks ke-" +i);
                break;
            }
        }
        System.out.println("Key ada dalam array pada posisi indeks ke-" +hasil);
    }
}