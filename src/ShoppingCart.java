import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void urunEkle(Item urun) {
        items.add(urun);
        System.out.println(urun.getUrunadi() + " sepete eklendi.");
    }

    public void toplamFiyatiYazdir() {
        int toplamFiyat = 0;
        for (Item item : items) {
            toplamFiyat += item.getSatisfiyat();
        }
        System.out.println("Sepetteki ürünlerin toplam fiyatı: " + toplamFiyat);
    }
}
