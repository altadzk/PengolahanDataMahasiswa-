/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author alta
 */
public class DataMahasiswa {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner input;
        input = new Scanner(System.in);
        program play;
        play = new program();
        boolean benar = true;
        int menu;
        
        
        while(benar){
            System.out.println("=====================");
            System.out.println("|   Data Mahasiswa  |");
            System.out.println("|                   |");
            System.out.println("|   Menu Program:   |");
            System.out.println("|[1] Tambah Data    |");
            System.out.println("|[2] Hapus Data     |");
            System.out.println("|[3] Cari Data      |");
            System.out.println("|[4] Tampilkan Data |");
            System.out.println("|[5] Keluar         |");
            System.out.println("=====================");
            System.out.print("    Masukan Pilihan: ");
            
            menu = input.nextInt();
            switch(menu){
                case 1:
                    char ulang = 'y';
                    while(ulang == 'y'){
                        play.tambahData();
                        System.out.print("Menambhkan Data Lagi? [y/n]: ");
                        ulang = input.next().charAt(0);
                    }
                    break;
                case 2:
                    play.hapusData();
                    break;
                case 3:
                    play.cariData();
                    break;
                case 4:
                    play.tampilData();
                    break;
                case 5:
                    System.out.println(" ============");
                    System.out.println("|Sampai Jumpa|");
                    System.out.println(" ============");
                    benar = false;
                    break;
                default:
                    System.out.println(" ======================");
                    System.out.println(" |Menu Tidak Ditemukan|");
                    System.out.println(" ======================");
                    System.out.println(" Masukkan Menu yang Tersedia dalam Pilihan Diatas");
            }
                    
        }
    }
}



