public class Item {
    private String urunadi;
    private String tedarikciadi;
    private int satisfiyat;
    private int alisfiyat;

    public Item(String urunadi, String tedarikciadi, int alisfiyat, int satisfiyat) {
        this.urunadi = urunadi;
        this.tedarikciadi = tedarikciadi;
        this.alisfiyat = alisfiyat;
        this.satisfiyat = satisfiyat;
    }

    // Getter ve Setter metotları (aynı şekilde kalabilir)
    public String getUrunadi() {
        return urunadi;
    }

    public void setUrunadi(String urunadi) {
        this.urunadi = urunadi;
    }

    public String getTedarikciadi() {
        return tedarikciadi;
    }

    public void setTedarikciadi(String tedarikciadi) {
        this.tedarikciadi = tedarikciadi;
    }

    public int getSatisfiyat() {
        return satisfiyat;
    }

    public void setSatisfiyat(int satisfiyat) {
        this.satisfiyat = satisfiyat;
    }

    public int getAlisfiyat() {
        return alisfiyat;
    }

    public void setAlisfiyat(int alisfiyat) {
        this.alisfiyat = alisfiyat;
    }

    // Satış fiyatını %20 arttıran metod
    public void artisYap() {
        double yeniSatisFiyati = this.satisfiyat * 1.20;
        System.out.println("%20 zamli fiyat : " + yeniSatisFiyati);
    }

    // Ürünün elde ettiği kârı hesaplayan metod
    public void karHesapla() {
        int kar = this.satisfiyat - this.alisfiyat;
        System.out.println("Ürünün elde ettiği kar : " + kar);
    }
}
