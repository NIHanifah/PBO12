/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;
import java.util.*;
import java.time.*;
/**
 *
 * @author ASUS
 */
public class dataMember extends Rental {
    
    ArrayList<String> Member = new ArrayList<>();
    ArrayList<String> NamaMember = new ArrayList<>();
    ArrayList<String> jnisMember = new ArrayList<>();
    
    //Method menghitung lama hari
    int lamaHari(){
        int x = this.thnKembali;
        int y = this.blnKembali;
        int z = this.tglKembali;
        int a = this.thnPinjam;
        int b = this.blnPinjam;
        int c = this.tglPinjam;
        LocalDate from = LocalDate.of(a, b, c);
        LocalDate to = LocalDate.of(x, y, z);
        Period selisih = Period.between(from, to);
        
        int bulan = selisih.getMonths();
        int hari = selisih.getDays();
        int tahun = selisih.getYears();
        
        int total =(tahun * 365) + (bulan * 30) + hari;
        
        return total;
    }
    
    int totalSewa(){
        if ("M001".equals(this.id)){
            this.totalSewa = (lamaHari() * 25000) - ((lamaHari() * 25000) * 1/100);
        } else if ("M002".equals(this.id)){
            this.totalSewa = (lamaHari() * 30000) - ((lamaHari() * 30000) * 2/100);
        } else if ("M003".equals(this.id)){
            this.totalSewa = (lamaHari() * 45000) - ((lamaHari() * 45000) * 3/100);
        }
        return this.totalSewa;
    }
    
    ArrayList anggota(){
        this.Member.add("M001");
        this.Member.add("M002");
        this.Member.add("M003");
        return this.Member;
    }
    
    ArrayList namaAnggota(){
        this.NamaMember.add("Mr.X");
        this.NamaMember.add("Mr.Y");
        this.NamaMember.add("Mr.Z");
        return this.Member;
    }
    
    ArrayList JenisMember(){
        this.jnisMember.add("Mr.X");
        this.jnisMember.add("Mr.Y");
        this.jnisMember.add("Mr.Z");
        return this.Member;
    }

    String namaMember(){
        if ("M001".equals(this.id)){
            this.nama = "Mr.X";
        } else if ("M002".equals(this.id)){
            this.nama = "Mr.Y";
        } else if ("M003".equals(this.id)){
            this.nama = "Mr.Z";
        }
        return this.nama;
    }
    
    String jenis(){
        if ("M001".equals(this.id)){
            this.jenisMember = "Silver";
        } else if ("M002".equals(this.id)){
            this.jenisMember = "Gold";
        } else if ("M003".equals(this.id)){
            this.jenisMember = "Platinum";
        }
        return this.jenisMember;
    }
    
    int poin(){
        if ("M001".equals(this.id)){
            this.jmlhpoin = lamaHari() * 1;
        } else if ("M002".equals(this.id)){
            this.jmlhpoin = lamaHari() * 5;
        } else if ("M003".equals(this.id)){
            this.jmlhpoin = lamaHari() * 10;
        } else{
            this.jmlhpoin = 0;
        }
        return this.jmlhpoin;
    }
    
  }



