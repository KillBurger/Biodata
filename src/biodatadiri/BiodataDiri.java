/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodatadiri;

/**
 *
 * @author WINDOWS 10
 */
public class BiodataDiri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama, tl, bulan, alamat, motto, jnskel;
        int NIS, NIS2,NIS3, tgll, thn;
        
    nama = "Muhammad Yusuf Ragil Syah An Naas";
    NIS = 5986;
    NIS2 = 2243;
    NIS3 = 70;
    tl = "Tuban";
    tgll = 13;
    bulan = "Oktober";
    thn = 2002;
    jnskel = "Laki-laki";
    alamat = "Jl. Danau Towuti II";
    motto = "Sak apik-apik e uwong, yen \n                  aweh pitulungan kanthi dedemithan";
    
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("Nama            : "+nama);
        System.out.println("NIS             : "+NIS+"/"+NIS2+"."+NIS3);
        System.out.println("Tempat Lahir    : "+tl);
        System.out.println("Tanggal Lahir   : " + tgll + bulan + thn);
        System.out.println("Jenis Kelamin   : "+jnskel);
        System.out.println("Alamat di Malang: "+alamat);
        System.out.println("Motto Hidup     : "+motto); 
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
    }
    
}
