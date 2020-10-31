/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan27.hurufbesardankecil;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan27HurufBesardanKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan Kalimat : ");
        kalimat = sc.nextLine();
        
        System.out.println();
        System.out.println("===Hasil Formating===");
        System.out.println("Huruf besar : " + kalimat.toUpperCase());
        System.out.println("Huruf kecil : " + kalimat.toLowerCase());  
    }  
}