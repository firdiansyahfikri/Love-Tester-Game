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
public class ByZodiac extends LoveTester {
    private String ZodiacAnda;
    private String ZodiacPasangan;
    
    public void setZodiacAnda(String tanggal1, String bulan1) {
        TanggalKelahiranAnda = bulan1+tanggal1;
    }
    
    public void setZodiacPasangan(String tanggal2, String bulan2) {
        TanggalKelahiranPasangan = bulan2+tanggal2;
    }
    
    private int getZodiacAnda() {
        return Integer.parseInt(TanggalKelahiranAnda);
    }
    
    private int getZodiacPasangan() {
        return Integer.parseInt(TanggalKelahiranPasangan);
    }
    
    
    
    @Override
    public void Calculate() {
        int temp1 = getZodiacAnda();
        int temp2 = getZodiacPasangan();
        
        if ( temp1 >= 120 && temp1 <= 218) {
            ZodiacAnda = "Aquarius";
        }
        
        if ( temp2 >= 120 && temp2 <= 218) {
            ZodiacPasangan = "Aquarius";
        }
        
        if ( temp1 >= 219 && temp1 <= 320) {
            ZodiacAnda = "Pisces";
        }
        
        if ( temp2 >= 219 && temp2 <= 320) {
            ZodiacPasangan = "Pisces";
        }
        
        if ( temp1 >= 321 && temp1 <= 419) {
            ZodiacAnda = "Aries";
        }
        
        if ( temp2 >= 321 && temp2 <= 419) {
            ZodiacPasangan = "Aries";
        }
        
        if ( temp1 >= 420 && temp1 <= 520) {
            ZodiacAnda = "Taurus";
        }
        
        if ( temp2 >= 420 && temp2 <= 520) {
            ZodiacPasangan = "Taurus";
        }
        
        if ( temp1 >= 521 && temp1 <= 620) {
            ZodiacAnda = "Gemini";
        }
        
        if ( temp2 >= 521 && temp2 <= 620) {
            ZodiacPasangan = "Gemini";
        }
        
        if ( temp1 >= 621 && temp1 <= 722) {
            ZodiacAnda = "Cancer";
        }
        
        if ( temp2 >= 621 && temp2 <= 722) {
            ZodiacPasangan = "Cancer";
        }
        
        if ( temp1 >= 723 && temp1 <= 822) {
            ZodiacAnda = "Leo";
        }
        
        if ( temp2 >= 723 && temp2 <= 822) {
            ZodiacPasangan = "Leo";
        }
        
        if ( temp1 >= 823 && temp1 <= 922) {
            ZodiacAnda = "Virgo";
        }
        
        if ( temp2 >= 823 && temp2 <= 922) {
            ZodiacPasangan = "Virgo";
        }
        
        if ( temp1 >= 923 && temp1 <= 1022) {
            ZodiacAnda = "Libra";
        }
        
        if ( temp2 >= 923 && temp2 <= 1022) {
            ZodiacPasangan = "Libra";
        }
        
        if ( temp1 >= 1023 && temp1 <= 1121) {
            ZodiacAnda = "Scorpio";
        }
        
        if ( temp2 >= 1023 && temp2 <= 1121) {
            ZodiacPasangan = "Scorpio";
        }
        
        if ( temp1 >= 1122 && temp1 <= 1221) {
            ZodiacAnda = "Sagittarius";
        }
        
        if ( temp2 >= 1122 && temp2 <= 1221) {
            ZodiacPasangan = "Sagittarius";
        }
        
        if ( temp1 >= 1222 || temp1 <= 119) {
            ZodiacAnda = "Capricon";
        }
        
        if ( temp2 >= 1222 || temp2 <= 119) {
            ZodiacPasangan = "Capricon";
        }
        

       char[] huruf = {'t', 'r', 'u', 'e', 'l', 'o', 'v', 'e'};
//        String[] huruf = {"t", "r", "u", "e", "l", "o", "v", "e"};
        int[] frek = new int[huruf.length];
        
        for (int i = 0; i < ZodiacAnda.length(); i++) {
            for (int j = 0; j < huruf.length; j++) {
                if (ZodiacAnda.charAt(i) == huruf[j]) {
                    frek[j]++;
                }
            }
        }
        
        for (int i = 0; i < ZodiacPasangan.length(); i++) {
            for (int j = 0; j < huruf.length; j++) {
                if (ZodiacPasangan.charAt(i) == huruf[j]) {
                    frek[j]++;
                }
            }
        }
        
        int Cinta = (frek[0] + (6*frek[1]) + (15*frek[2]) + (20*frek[3]) + (15*frek[4]) + (6*frek[5]) + (frek[6]))%10;
        int Sejati = (frek[1] + (6*frek[2]) + (15*frek[3]) + (20*frek[4]) + (15*frek[5]) + (6*frek[6]) + (frek[7]))%10;
        
        JOptionPane.showMessageDialog(null, "Tingkat Kecocokan Zodiac "+ ZodiacAnda +" dan Zodiac "+ZodiacPasangan+" adalah " + Cinta + Sejati+ "%");
    }
    
}
