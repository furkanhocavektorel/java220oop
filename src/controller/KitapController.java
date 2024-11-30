package controller;

import entity.Kitap;
import service.KitapService;

import java.util.List;

public class KitapController {


    public void kitapEkle(String kitapAdi,String yazar){

        KitapService kitapService= new KitapService();
        kitapService.kitapKaydet(kitapAdi,yazar);
    }

    public List<Kitap> tümKitaplariGetir(){
        KitapService kitapService = new KitapService();
        List<Kitap> kitappp= kitapService.tumKitaplarıGetir();
        return kitappp;
    }



}
