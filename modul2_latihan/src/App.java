
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int umur = 20;
        double ipk = 4.0;
        char inisial = 'F';
        String nama = "Rendy";
        System.out.println("Nama :" + nama + "Umur :" + umur + "IPK :" + ipk + "inisial :" + inisial);
    
        byte nomorByte = -128;
        short nomorShort = 32767;
        long nomorLong = 1000000000;
        float phi = 3_14f;
    
        boolean isJavaFun = true;
        
        System.err.println(isJavaFun);

        char var1 = 65;

        System.out.println(var1);

        String firstName = "Umran";
        String lastName = "Zuhdy";

        String fullName = firstName + " " + lastName;

        System.err.println(fullName);

        System.out.print("Masukkan nama Anda: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Masukkan umur Anda: ");
        int age = input.nextInt();
        System.out.print("Masukkan tinggi badan anda: ");
        double height = input.nextDouble();

        System.out.println("\nData yang anda masukkan: ");
        System.out.println("Nama anda: " + name);
        System.out.println("Umur anda: " + age);
        System.out.println("Tinggi badan anda: " + height);

        input.close();
    }
}
