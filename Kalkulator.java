
import java.util.*;

public class Kalkulator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1,angka2;

        System.out.println("Pilih Operasi : ");
        System.out.println("1 pengurangan");
        System.out.println("2 penjumlahan");
        System.out.print  ("Masukkan pilihan 1/2 ");
        int pilihan = scanner.nextInt();
        
        System.out.print("Angka pertama : ");
        angka1=scanner.nextInt();
        System.out.print("Angka kedua     : ");
        angka2=scanner.nextInt();

        if (pilihan == 1){
            System.out.println("Hasil Pengurangan "+angka1+" - "+angka2+" = " + (angka1-angka2));

    }
}
}