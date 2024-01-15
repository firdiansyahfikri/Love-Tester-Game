/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Akhir;
import javax.swing.*;
/**
 *
 * @author acer
 */
public class ByJavanese extends LoveTester {
    private String HariPasaranAnda;
    private String HariPasaranPasangan;
    
    public void setHariPasaranAnda(String tanggal1, String bulan1, String tahun1) {
        TanggalKelahiranAnda = tahun1+bulan1+tanggal1;
    }
    
    public void setHariPasaranPasangan(String tanggal2, String bulan2, String tahun2) {
        TanggalKelahiranPasangan = tahun2+bulan2+tanggal2;
    }
    
    private int getHariAnda() {
        return Integer.parseInt(TanggalKelahiranAnda);
    }
    
    private int getHariPasangan() {
        return Integer.parseInt(TanggalKelahiranPasangan);
    }
    
    
    
    @Override
    public void Calculate() {
        int dateAnda = getHariAnda();
        int datePasangan = getHariPasangan();
        
        String[] hari = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        String[] pasaran = {"Pahing", "Pon", "Wage", "Kliwon", "Legi"};
        
        int date = 190011;
        int bedaAnda = dateAnda - date;
        int bedaPasangan = datePasangan - date;
        
        int hariAnda = bedaAnda % 7;
        int hariPasangan = bedaPasangan % 7;
        
        int pasaranAnda = bedaAnda % 5;
        int pasaranPasangan = bedaPasangan % 5;
        
        HariPasaranAnda = hari[hariAnda]+pasaran[pasaranAnda];
        HariPasaranPasangan = hari[hariPasangan] + pasaran[pasaranPasangan];
        
        HariPasaranAnda = HariPasaranAnda.toLowerCase();
        HariPasaranPasangan = HariPasaranPasangan.toLowerCase();
        
        char[] huruf = {'t', 'r', 'u', 'e', 'l', 'o', 'v', 'e'};
//        String[] huruf = {"t", "r", "u", "e", "l", "o", "v", "e"};
        int[] frek = new int[huruf.length];
        
        for (int i = 0; i < HariPasaranAnda.length(); i++) {
            for (int j = 0; j < huruf.length; j++) {
                if (HariPasaranAnda.charAt(i) == huruf[j]) {
                    frek[j]++;
                }
            }
        }
        
        for (int i = 0; i < HariPasaranPasangan.length(); i++) {
            for (int j = 0; j < huruf.length; j++) {
                if (HariPasaranPasangan.charAt(i) == huruf[j]) {
                    frek[j]++;
                }
            }
        }
        
        int Cinta = (frek[0] + (6*frek[1]) + (15*frek[2]) + (20*frek[3]) + (15*frek[4]) + (6*frek[5]) + (frek[6]))%10;
        int Sejati = (frek[1] + (6*frek[2]) + (15*frek[3]) + (20*frek[4]) + (15*frek[5]) + (6*frek[6]) + (frek[7]))%10;
        
        JOptionPane.showMessageDialog(null, "Tingkat Kecocokan Hari Pasaran "+ hari[hariAnda]+ " "+ pasaran[pasaranAnda] +" dan Hari Pasaran "+hari[hariPasangan]+ " "+ pasaran[pasaranPasangan]+" adalah " + Cinta + Sejati+ "%");
        
        
//        for (int i = 0; i < hari1; i++) {
//            hariAnda = hari[jumlah];
//            jumlah = jumlah+1;
//            if (hari.length == jumlah) {
//                jumlah = 0;
//            }
//        }
//        
//        for (int i = 0; i < hari2; i++) {
//            hariPasangan = hari[jumlah];
//            jumlah = jumlah+1;
//            if (hari.length == jumlah) {
//                jumlah = 0;
//            }
//        }
    }
    
    
    
}
