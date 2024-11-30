package controller;

import entity.Insan;
import service.InsanIsleri;

import java.util.List;

public class InsanController {

    public void insanEkle(String ad,String soyad, long tckn){
        InsanIsleri fsadfgasd= new InsanIsleri();
        fsadfgasd.insanEkle(ad,soyad,tckn);
    }

    public List<Insan> insanList(){
        InsanIsleri insanIsleri= new InsanIsleri();
        return insanIsleri.insanList();
    }

}
