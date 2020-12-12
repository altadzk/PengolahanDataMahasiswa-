/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 *
 * @author alta
 */
public class program {

    ArrayList<String> nim;
    ArrayList<String> nama;
    ArrayList<String> tglLahir;
    ArrayList<Integer> gender;
    Scanner input;
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

    /**
     *
     */
    public program() {
        this.input = new Scanner(System.in);
        this.gender = new ArrayList<>();
        this.tglLahir = new ArrayList<>();
        this.nama = new ArrayList<>();
        this.nim = new ArrayList<>();
    }
    void tambahData() throws ParseException{
        System.out.println(" ===========");
        System.out.println("|Tambah Data|");
        System.out.println(" ===========");
        String ni;
        String na;
        String tgl;
        int gd;
        input.nextLine();
        System.out.print("NIM : ");
            ni = input.nextLine();
            nim.add(ni);
        System.out.print("Nama : ");
            na = input.nextLine();
            nama.add(na);
        System.out.print("Tanggal Lahir(Tanggal-Bulan-Tahun) : ");
            tgl = input.nextLine();
            tglLahir.add(tgl);
            Date dt = df.parse(tgl);
        System.out.print("Gender (0:Laki-laki,1:Perempuan) : ");
            gd = input.nextInt();
            gender.add(gd);

    }
    void hapusData(){
        System.out.println(" ==========");
        System.out.println("|Hapus Data|");
        System.out.println(" ==========");
        if (nim.size() > 0){
            System.out.print("Masukkan NIM yang akan dihapus: ");
            input.nextLine();
            String hapus = input.nextLine();
            input.nextLine();
            int index;
            index = nim.indexOf(hapus);
                nim.remove(index);
                nama.remove(index);
                tglLahir.remove(index);
                gender.remove(index);
                System.out.println("=========================");
                System.out.println("| Data Berhasil Dihapus |");
                System.out.println("=========================");
            }
        
        else{
            System.out.println("==================");
            System.out.println("| Tidak Ada Data |");
            System.out.println("==================");
        }
       
    }
    
    void cariData(){
        System.out.println(" ==============");
        System.out.println("|Pencarian Data|");
        System.out.println(" ==============");
        System.out.println("");
        System.out.println("Pencarian : ");
        System.out.println("");
        System.out.println("1. NIM");
        System.out.println("2. Gender");
        System.out.println("");
        System.out.print("Masukkan Pilihan: ");
        int pilihan;
        pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                input.nextLine();
                System.out.print("Masukkan NIM : ");
                String a;
                a = input.nextLine();
                for(String n: nim){
                    if(nim.contains(a)){
                        int i = nim.indexOf(a);
                        System.out.println("============================");
                        System.out.println("Pencarian Berdasarkan NIM");
                        System.out.println("                   ");
                        System.out.println("NIM : " + nim.get(i));
                        System.out.println("Nama : " + nama.get(i));
                        System.out.println("Tanggal Lahir : " + tglLahir.get(i));
                        System.out.println("Gender : " + gender.get(i));
                        System.out.println("*Keterangan :");
                        System.out.println("0=Laki-laki");
                        System.out.println("1=Perempuan");
                        System.out.println("============================");
                        System.out.println("");
                        break;
                    }
                    else{
                        System.out.println("==================");
                        System.out.println("| Tidak Ada Data |");
                        System.out.println("==================");
                    }
                }
                break;
            case 2:
                input.nextLine();
                System.out.print("Masukkan Gender(0:Laki-laki 1:Perempuan):");
                int b;
                b = input.nextInt();
                for(int n = 0; n < gender.size(); n++){
                    if(gender.get(n) == b){
                        System.out.println("============================");
                        System.out.println("Pencarian Berdasarkan Gender");
                        System.out.println("                   ");
                        System.out.println("NIM : " + nim.get(n));
                        System.out.println("Nama : " + nama.get(n));
                        System.out.println("Tanggal Lahir : " + tglLahir.get(n));
                        System.out.println("Gender : " + gender.get(n));
                        System.out.println("*Keterangan :");
                        System.out.println("0=Laki-laki");
                        System.out.println("1=Perempuan");
                        System.out.println("============================");
                        System.out.println("");
                    break;
                    }
                    else{
                        System.out.println("==================");
                        System.out.println("| Tidak Ada Data |");
                        System.out.println("==================");
                    }
                };
                break;
            default:
                System.out.println("======================");
                System.out.println("Pilihan Anda Tidak Ada");
                System.out.println("======================");
        }
    }
    void tampilData(){
        System.out.println(" =============");
        System.out.println("|Tampilan Data|");
        System.out.println(" =============");
      if(nama.size()>0){
          for(int a = 0; a<nama.size(); a++){
              System.out.println("=====================================");
              System.out.println("          Data Mahasiswa           ");
              System.out.println("NIM           : "+nim.get(a));
              System.out.println("Nama          : "+nama.get(a));
              System.out.println("Tanggal Lahir : "+tglLahir.get(a));
              System.out.println("Gender        : "+gender.get(a));
              System.out.println("0=Laki-laki");
              System.out.println("1=Perempuan");
              System.out.println("Total Mahasiswa : "+nama.size());
              System.out.println("=====================================");
          }
        }
      else{
            System.out.println("==================");
            System.out.println("| Tidak Ada Data |");
            System.out.println("==================");
      }
    }
}

