package controller;

import entity.Insan;
import service.InsanIsleri;

import java.util.List;

public class InsanController {
    InsanIsleri insanIsleri= new InsanIsleri();

    public List<Insan> isimeGoreKullaniciGetir(String aramakIstediginizIsim) {
        return insanIsleri.adaGoreInsanGetir(aramakIstediginizIsim);
    }

    public void insanEkle(String ad,String soyad, long tckn){
        insanIsleri.insanEkle(ad,soyad,tckn);
    }

    public List<Insan> insanList(){
        return insanIsleri.insanList();
    }

    public Insan tcknyeGoreArama(long tckn){
        return insanIsleri.tcknyeGoreInsanGetir(tckn);
    }

}
