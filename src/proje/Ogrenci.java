package proje;

public class Ogrenci {
    private String ad;
    private String soyAd;
    private int yas;
    private double diplomaNotu;

    public String getAd() {
        return ad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                ", diplomaNotu=" + diplomaNotu +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getDiplomaNotu() {
        return diplomaNotu;
    }

    public void setDiplomaNotu(double diplomaNotu) {
        this.diplomaNotu = diplomaNotu;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Ogrenci(String ad, String soyAd, int yas, double diplomaNotu, String cinsiyet) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yas = yas;
        this.diplomaNotu = diplomaNotu;
        this.cinsiyet = cinsiyet;
    }

    private String cinsiyet;
    //bir ogrenci listesi olusturun
    //ad soyad yas diplomaNotu cinsiyet
    // toString methodu ile ogrenci bilgilerin yazdirin
    //Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin
    //Öğrencileri yaşlarına göre sıralayark yazdırin
    //Öğrencileri belirli bir yaşa ve cinsiyete göre sıralayarak listeleyin
    //Öğrencileri isimlerine göre yazdırın
    //Öğrencileri soyisimlerine göre yazdır,n
    //Öğrencileri cinsiyetlerine göre yazdıran
    //listeyi yazdırırken içinde veri var mı diye kontrol edin
    //reduce metoduyla ortalama hesaplayin
    // Girilen ogrenci ismini sil
    //Test amaçlı Öğrenci nesneleri oluşturun.
    public static void main(String[] args){

    }
}
