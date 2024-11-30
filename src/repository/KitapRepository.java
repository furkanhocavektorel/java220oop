package repository;

import db.Veritabani;
import entity.Kitap;

import java.util.List;

public class KitapRepository {

    public void kitapEkle(Kitap kitap){
        Veritabani.kitaplar.add(kitap);
    }

    public List<Kitap> tumKitaplariGetir(){
        List<Kitap> kitaplarListesi= Veritabani.kitaplar;
        return kitaplarListesi;
    }


}
