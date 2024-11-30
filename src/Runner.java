import controller.InsanController;
import controller.KitapController;
import db.Veritabani;
import entity.Insan;
import entity.Kitap;
import service.InsanIsleri;

import java.util.Scanner;

public class Runner {

    // FRONT-END SİM
    public static void main(String[] args) {

        Scanner src= new Scanner(System.in);
        kitapEkle();

        System.out.println("kitap adi giriniz");
        String  kitapAdi= src.nextLine();

        KitapController kitapController = new KitapController();

        for (Kitap k: kitapController.adaGoreAra(kitapAdi)){
            System.out.println(k.kitapAdi+","+k.basimYili);
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

    public static void kitapEkle(){
        Kitap kitap= new Kitap();
        kitap.kitapAdi="lotr";
        kitap.yazar="tolkien";
        kitap.basimYili=1970;

        Kitap kitap2= new Kitap();
        kitap2.kitapAdi="lotr";
        kitap2.yazar="tolkien";
        kitap2.basimYili=1975;

        Kitap kitap3= new Kitap();
        kitap3.kitapAdi="melekler ve seytanlar";
        kitap3.yazar="dan brown";
        kitap3.basimYili=2008;

        Veritabani.kitaplar.add(kitap);
        Veritabani.kitaplar.add(kitap2);
        Veritabani.kitaplar.add(kitap3);
    }

}