import controller.InsanController;
import controller.KitapController;
import db.Veritabani;
import entity.Insan;
import service.InsanIsleri;

import java.util.Scanner;

public class Runner {

    // FRONT-END SİM
    public static void main(String[] args) {

        insanEkle();
        // KULLANICI ADINA GORE KULLANICILARI GETIRME
        Scanner src= new Scanner(System.in);
        System.out.println("arama adini giriniz");
        String aramakIstediginizIsim= src.nextLine();

        InsanController insanController= new InsanController();

        for (Insan insan: insanController.isimeGoreKullaniciGetir(aramakIstediginizIsim)){
            System.out.println(insan.ad+","+insan.soyad);
        }

    }

    public static void insanEkle(){

        Insan insan = new Insan();
        insan.ad="buse";
        insan.soyad="leyla";
        insan.TCKN=12354l;

        Insan insan2 = new Insan();
        insan2.ad="furkan";
        insan2.soyad="türkmen";
        insan2.TCKN=1234l;

        Insan insan3 = new Insan();
        insan3.ad="furkan";
        insan3.soyad="kılıc";
        insan3.TCKN=56565l;

        Veritabani.insanlar.add(insan);
        Veritabani.insanlar.add(insan2);
        Veritabani.insanlar.add(insan3);

    }


}