import java.util.Scanner;

public class InsanIsleri {


    public void insanEkle(){
        Scanner src= new Scanner(System.in);

        System.out.println("isim giriniz");
        String isim= src.nextLine();

        System.out.println("soyisim giriniz");
        String soyisim= src.nextLine();

        System.out.println("TCKN giriniz");
        long TCKN= src.nextLong();

        Insan insan= new Insan();
        insan.ad=isim;
        insan.soyad=soyisim;
        insan.TCKN=TCKN;

        Veritabani.insanlar.add(insan);

    }

    public void insanlariEkranaBastir(){
        for (int i=0;i<=Veritabani.insanlar.size()-1;i++){
            System.out.println(
                    "ad-> "+Veritabani.insanlar.get(i).ad+
                    "\nsoyad-> "+Veritabani.insanlar.get(i).soyad+
                    "\ntckn-> "+Veritabani.insanlar.get(i).TCKN);

        }
    }

    public void insanSil(int index){
        // silinmek istenen index var mı

        Insan insan=Veritabani.insanlar.remove(index);
        System.out.println("silinen kisi bilgileri -> "+insan.ad + insan.soyad);
    }

    public void isimDegistir(Insan insan999,String yeniIsim){
        insan999.ad=yeniIsim;
    }

}
