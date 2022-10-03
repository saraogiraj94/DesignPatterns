package patterns.creational.protoype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop abcBookShop = new BookShop();
        abcBookShop.setShopName("ABC Bookshop");
        abcBookShop.loadData();
        System.out.println(abcBookShop);

        BookShop defBookshop = (BookShop) abcBookShop.clone();
        System.out.println(defBookshop);
        defBookshop.getBooks().remove(1);
        System.out.println(abcBookShop);

    }
}
