package service;

import entity.Kitap;
import repository.KitapRepository;

import java.util.List;

public class KitapService {


    public void kitapKaydet(String kitapAdi,String kitapYazari){
        Kitap kitap= new Kitap();
        kitap.yazar=kitapYazari;
        kitap.kitapAdi=kitapAdi;
        KitapRepository kitapRepository= new KitapRepository();
        kitapRepository.kitapEkle(kitap);
    }

    public List<Kitap> tumKitaplarıGetir(){
        KitapRepository kitapRepository= new KitapRepository();
        return kitapRepository.tumKitaplariGetir();
    }


}
