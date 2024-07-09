public class Main {
    public static void main(String[] args) {

        ShoppingCart sepet = new ShoppingCart();

        // Örnek ürünler
        Item urun1 = new Item("saat", "daniel klein", 1500, 2000);
        Item urun2 = new Item("telefon", "Samsung", 3000, 4000);


        sepet.urunEkle(urun1);
        sepet.urunEkle(urun2);


        sepet.toplamFiyatiYazdir();
    }
}
