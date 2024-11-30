import controller.InsanController;
import controller.KitapController;
import db.Veritabani;
import entity.Insan;
import service.InsanIsleri;

import java.util.Scanner;

public class Runner {

    // FRONT-END SİM
    public static void main(String[] args) {

        Scanner src= new Scanner(System.in);
        System.out.println("kitap adi:");
        String kitapAdi= src.nextLine();

        System.out.println("yazar adi:");
        String yazarAdi= src.nextLine();

        KitapController kitapController= new KitapController();

        kitapController.kitapEkle(kitapAdi,yazarAdi);


    }

}