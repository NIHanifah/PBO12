/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class gold extends dataMember {
    
    public int jmlcashback;
    
//    Contractor
    int cashback(){
         if ("M002".equals(this.id)){
            this.jmlcashback = 5000;
        } else if ("M003".equals(this.id)){
            this.jmlcashback = 10000;
        } else{
            this.jmlcashback = 0;
        }
        return this.jmlcashback;
    }
}
