
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM :   
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        Penggajian Gaji= new Penggajian();
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda per bulan?\t: Rp. ");
        Gaji.gajiPokok= masuk.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        Gaji.status = masuk.next();

        Gaji.hasilHitung(Gaji.status, Gaji.gajiPokok);
    }

}
