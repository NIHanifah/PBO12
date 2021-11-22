/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class Rental{
//  private String modelName = "Mustang";
    
    Scanner idinput = new Scanner(System.in);
    Scanner data = new Scanner(System.in);

    public String jenisMember;
    public String nama;
    public String id;
    public int biayaSewa;
    public double diskon;
    public int poin;
    public int cashback;
    public int bonusPulsa;
    public int tglPinjam;
    public int blnPinjam;
    public int thnPinjam;
    public int tglKembali;
    public int blnKembali;
    public int thnKembali;
    public int jmlhpoin;
    public int totalSewa;
    

    //    Contractor
    Rental(){
        System.out.print("Masukkan ID Member             : ");
        this.id = idinput.nextLine();
        System.out.print("Masukkan Tanggal Pinjam(1-31)  : ");
        this.tglPinjam = data.nextInt();
        System.out.print("Masukkan Bulan Pinjam(1-12)    : ");
        this.blnPinjam = data.nextInt();
        System.out.print("Masukkan Tahun Pinjam(1-12)    : ");
        this.thnPinjam = data.nextInt();
        System.out.print("Masukkan Tanggal Kembali(1-31) : ");
        this.tglKembali = data.nextInt();
        System.out.print("Masukkan Bulan Kembali(1-12)   : ");
        this.blnKembali = data.nextInt();
        System.out.print("Masukkan Tahun Kembali(1-12)   : ");
        this.thnKembali = data.nextInt();
    }
    
  public static void main(String[] args) {
      premium z = new premium();
      z.printMember();
  }
  
}
