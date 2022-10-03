package patterns.creational.protoype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.print.attribute.HashDocAttributeSet;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class BookShop implements Cloneable{
    private String shopName;
    private List<Book> books = new ArrayList<>();

    //This is the costly operation which is loading data in object
    public void loadData() {
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setBookName("Book " + i);
            book.setBookId(i);
            books.add(book);
        }
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
       // return super.clone();
        BookShop shop = new BookShop();
        for(Book b : this.getBooks()){
            shop.getBooks().add(b);
        }
        return shop;
    }
}


