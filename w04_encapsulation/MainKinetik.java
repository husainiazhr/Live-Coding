/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_encapsulation;

/**
 *
 * @author hiyer
 */

import java.util.Scanner;

public class MainKinetik {
    
    public double massa,kecepatan;

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getMassa() {
        return massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public double hitungEnergiKinetik() {
        return 0.5 * massa * kecepatan * kecepatan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainKinetik mainKinetik = new MainKinetik();

        System.out.print("Masukkan massa sepeda Andhika(KG): ");
        double massa = scanner.nextDouble();
        mainKinetik.setMassa(massa);

        System.out.print("Masukkan kecepatan sepeda Andhika(M/s): ");
        double kecepatan = scanner.nextDouble();
        mainKinetik.setKecepatan(kecepatan);

        double energiKinetik = mainKinetik.hitungEnergiKinetik();
        System.out.println("Energi kinetik sepeda: " + energiKinetik + " J");
    }
}

