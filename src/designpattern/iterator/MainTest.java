package designpattern.iterator;

/**
 * Created by liugang5 on 2016/1/30.
 */
public class MainTest {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the world in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderalla"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        MyIterator mi = bookShelf.iterator();
        while (mi.hasNext()){
            Book book = (Book) mi.next();
            System.out.println(""+book.getName());
        }
    }
}
