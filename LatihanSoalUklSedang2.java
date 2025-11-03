import java.util.Scanner;

public class LatihanSoalUklSedang2 {
     // Fungsi untuk menghitung volume tabung
    public static double hitungVolume(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input dari pengguna
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();
        
        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();
        
        // Pemanggilan fungsi
        double volume = hitungVolume(r, t);
        
        // Output hasil
        System.out.println("Volume tabung adalah: " + volume + " cm^3");
        
        input.close();
    }
}

