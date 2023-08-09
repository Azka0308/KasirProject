
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author relya
 */
public class kasir {

    public static void main(String[] args) {
        System.out.println("Menu Makanan: ");
        System.out.println("1. Soto Ayam (15.000)");
        System.out.println("2. Sate Kambing (20.000)");
        System.out.println("3. Tahu Telor (8.000)");
        System.out.println("4. Rawon Daging (17.000)");
        System.out.println("5. Mie Goreng (5.000)");

        int Soto  = 15000;
        int Sate  = 20000;
        int Tahu  = 8000;
        int Rawon = 17000;
        int Mie   = 5000;

        int JumlahBeli, total, bayar, kembali;
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Beli Soto: ");
        int JumlahSoto = input.nextInt();
        int totalsoto = JumlahSoto*Soto;
        System.out.println("Jumlah Beli Sate");
        int jumlahsate = input.nextInt();
        int totalsate = jumlahsate*Sate;
        total=totalsate+totalsoto;
        
       

        System.out.println(total + "Total Pembelian: ");
        System.out.println("Masukkan Pembayaran: ");
        bayar = input.nextInt();
        kembali = bayar - total;
        System.out.println("Jumlah Kembalian: " + kembali);
    }

}
