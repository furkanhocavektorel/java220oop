package service;

import entity.Kitap;
import repository.KitapRepository;

import java.util.ArrayList;
import java.util.List;

public class KitapService {
    KitapRepository kitapRepository= new KitapRepository();

    public void kitapKaydet(String kitapAdi,String kitapYazari){
        Kitap kitap= new Kitap();
        kitap.yazar=kitapYazari;
        kitap.kitapAdi=kitapAdi;
        kitapRepository.kitapEkle(kitap);
    }

    public List<Kitap> tumKitaplarıGetir(){
        return kitapRepository.tumKitaplariGetir();
    }

    public List<Kitap> adaGoreKitapAra(String kitapAdi){
        List<Kitap> kitapList= kitapRepository.tumKitaplariGetir();

        List<Kitap> adaGoreFiltreliList= new ArrayList<>();

        for (Kitap kitap: kitapList){

            if (kitap.kitapAdi.equals(kitapAdi)){
                adaGoreFiltreliList.add(kitap);
            }

        }
        return adaGoreFiltreliList;
    }

}
