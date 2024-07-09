public class Main {
    public static void main(String[] args) {
        // Örnek bir alışveriş sepeti oluşturalım
        ShoppingCart sepet = new ShoppingCart();

        // Örnek ürünler oluşturalım
        Item urun1 = new Item("saat", "daniel klein", 1500, 2000);
        Item urun2 = new Item("telefon", "Samsung", 3000, 4000);

        // Ürünleri sepete ekleyelim
        sepet.urunEkle(urun1);
        sepet.urunEkle(urun2);

        // Sepetteki ürünlerin toplam fiyatını yazdıralım
        sepet.toplamFiyatiYazdir();
    }
}
