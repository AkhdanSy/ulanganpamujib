/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ulangan.pak.mujib;

import javax.swing.JOptionPane;

/**
 *
 * @author PC 17 - LAB R1
 */
public class UlanganPakMujib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlahBaris = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan jumlah baris : ","Jumlah Baris",JOptionPane.INFORMATION_MESSAGE));           
        int baris =5;
            for (int i = 0; i < baris; i+=2) {
            for (int j = i; j < baris; j++) {
                System.out.print("* ");
            }
            
            System.out.println("");
        }
        
        int Baris = 8;
            for (int a = 1; a < Baris; a++) {
            for (int b = 1; b < a; b++) {
            System.out.print(b);
        }
            System.out.println("");
    
            }
        }
}


