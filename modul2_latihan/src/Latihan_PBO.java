import java.util.Scanner;

public class Latihan_PBO 
{
    public static void main(String[] args) 
    {
        // inputan pengguna
        System.out.print("Masukkan nama: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan usia: ");
        int age = input.nextInt();
        System.out.print("Masukkan tinggi badan (cm): ");
        double height = input.nextDouble();

        // Output pengguna
        System.out.println("\nData yang Anda Masukkan: ");
        System.out.println("Nama: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + age + " tahun");
        System.out.println("Tinggi Badan: " + height + " cm");

        // NO 1
        int result = (age * 2) + 10 / 5 - 3;
        System.out.println("\nHasil dari (usia * 2) + 10 / 5 - 3: " + result);
        // NO 2
        System.out.println("Apakah usia > 18? " + (age > 18));
        // NO 3
        System.out.println("Apakah usia > 18 dan tinggi badan > 160 cm? " + (age > 18 && height > 160));
        // NO 4
        System.out.println("\nHasil konversi tipe data:");
        System.out.println("---------------------------");
        System.out.println("1. Konversi Usia: " + (double) age);
        System.out.println("2. Knversi Tinggi Badan: " + (int) height);

        input.close();
    }
}