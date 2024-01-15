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
public class ByName extends LoveTester {
    
    public void setNamaAnda(String nama1) {
        NamaAnda = nama1;
    }
    
    public void setNamaPasangan(String nama2 ) {
        NamaPasangan = nama2;
    }
    
    private String getNamaAnda() {
        return NamaAnda;
    }
    
    private String getNamaPasangan() {
        return NamaPasangan;
    }
    
    
    
    @Override
    public void Calculate() {
        
        NamaAnda = getNamaAnda().toLowerCase();
        NamaPasangan = getNamaPasangan().toLowerCase();
        
        char[] huruf = {'t', 'r', 'u', 'e', 'l', 'o', 'v', 'e'};
//        String[] huruf = {"t", "r", "u", "e", "l", "o", "v", "e"};
        int[] frek = new int[huruf.length];
        
        for (int i = 0; i < NamaAnda.length(); i++) {
            for (int j = 0; j < huruf.length; j++) {
                if (NamaAnda.charAt(i) == huruf[j]) {
                    frek[j]++;
                }
            }
        }
        
        for (int i = 0; i < NamaPasangan.length(); i++) {
            for (int j = 0; j < huruf.length; j++) {
                if (NamaPasangan.charAt(i) == huruf[j]) {
                    frek[j]++;
                }
            }
        }
        
        int Cinta = (frek[0] + (6*frek[1]) + (15*frek[2]) + (20*frek[3]) + (15*frek[4]) + (6*frek[5]) + (frek[6]))%10;
        int Sejati = (frek[1] + (6*frek[2]) + (15*frek[3]) + (20*frek[4]) + (15*frek[5]) + (6*frek[6]) + (frek[7]))%10;
        
        JOptionPane.showMessageDialog(null, "Tingkat Kecocokan anda adalah " + Cinta + Sejati+ "%");
        
    }
    
}
