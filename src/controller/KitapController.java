package controller;

import entity.Kitap;
import service.KitapService;

import java.util.List;

public class KitapController {
    KitapService kitapService= new KitapService();

    public void kitapEkle(String kitapAdi,String yazar){
        kitapService.kitapKaydet(kitapAdi,yazar);
    }

    public List<Kitap> tümKitaplariGetir(){
        List<Kitap> kitappp= kitapService.tumKitaplarıGetir();
        return kitappp;
    }
    public List<Kitap> adaGoreAra(String kitapAdi){
        return kitapService.adaGoreKitapAra(kitapAdi);
    }


}
