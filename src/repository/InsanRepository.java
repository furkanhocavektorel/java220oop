package repository;

import db.Veritabani;
import entity.Insan;

import java.util.List;

public class InsanRepository {


    public void insanKaydet(Insan insan){
        Veritabani.insanlar.add(insan);
    }


    public List<Insan> insanList(){
        return Veritabani.insanlar;
    }
}
