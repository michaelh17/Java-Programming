/**
 * input
 */
import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        //scan nama
        Scanner Strnama = new Scanner(System.in);
        System.out.println("Masukkan Nama Mu : ");
        String Nama = Strnama.nextLine();

        //scan umur
        Scanner Intumur = new Scanner(System.in);
        System.out.println("Masukkan Umur Mu : ");
        int Umur = Intumur.nextInt();

        //close scan agar memory tidak leak
        Strnama.close();
        Intumur.close();

        //printout
        System.out.println("\nNama kamu adalah  : " +Nama);
        
        System.out.println("Umur kamu adalah : " +Umur);
    
    }

}