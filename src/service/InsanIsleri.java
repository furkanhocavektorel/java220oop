package service;

import entity.Insan;
import repository.InsanRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsanIsleri {

    InsanRepository insanRepository= new InsanRepository();

    public void insanEkle(String ad,String soyad, long tckn){
        Insan insan= new Insan();
        insan.ad=ad;
        insan.soyad=soyad;
        insan.TCKN=tckn;
        insanRepository.insanKaydet(insan);
    }

    public List<Insan> insanList(){
        List<Insan> insanList= insanRepository.insanList();
        return insanList;
    }

    public List<Insan> adaGoreInsanGetir(String aramakIstediginizIsim) {

        List<Insan> insanlar= insanRepository.insanList();
        List<Insan> adaGoreFiltreliInsanlar= new ArrayList<>();
        for (Insan i : insanlar ){
            if (i.ad.equals(aramakIstediginizIsim)){
               adaGoreFiltreliInsanlar.add(i);
            }
        }
        return adaGoreFiltreliInsanlar;
    }

    // TCKN ye göre insan arama
    public Insan tcknyeGoreInsanGetir(long TCKN){
        List<Insan> insanlar= insanRepository.insanList();

        Insan insan= new Insan();

        for (Insan i : insanlar){

            if (i.TCKN== TCKN){
                insan.ad=i.ad;
                insan.soyad=i.soyad;
                insan.TCKN=i.TCKN;
                insan.boy=i.boy;
                insan.kilo=i.kilo;
            }
        }
        return insan;
    }




}
