import java.io.IOException;
import java.util.Scanner;

public class V_MenggunakanMethodBawaanKelasScanner {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nama : ");
        String nama = input.nextLine();
        System.out.println("masukkan umur : ");
        String age = input.nextLine();
        System.out.println("masukkan tinggi badan : ");
        String height = input.nextLine();
        System.out.println("sudah menikah(true/false) : ");
        String married = input.nextLine();
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + age);
        System.out.println("Tinggi Badan : " + height);
        System.out.println("Sudah Menikah : " + married);

    }
}