package service;

import entity.Insan;
import repository.InsanRepository;

import java.util.List;
import java.util.Scanner;

public class InsanIsleri {

    public void insanEkle(String ad,String soyad, long tckn){
        Insan insan= new Insan();
        insan.ad=ad;
        insan.soyad=soyad;
        insan.TCKN=tckn;
        InsanRepository insanRepository= new InsanRepository();
        insanRepository.insanKaydet(insan);
    }

    public List<Insan> insanList(){
        InsanRepository insanRepository= new InsanRepository();
        List<Insan> insanList= insanRepository.insanList();
        return insanList;
    }


}