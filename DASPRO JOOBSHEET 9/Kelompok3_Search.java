public class Kelompok3_Search {
    public static void main(String[] args) {

    int[] arrayInt = {1, 2, 3, 4, 5, 6};
    int key = 3;
    int hasil = 0;

    for (int i = 0; i < arrayInt.length; i++){
        if (arrayInt[i] == key ) {
            hasil = i;
            break;
        }
    }
    System.out.println("Silahkan masuk ke studio " +hasil);
    }
}