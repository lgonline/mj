package designpattern.iterator;

/**
 * Created by liugang5 on 2016/1/30.
 */

/*
书架有个books的字段，数组的大小maxsize在一开始建立bookshelf实例时就设定，加private为防止被其它类修改

 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize){
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    //iterator方法是产生并返回bookshelfiterator类的对象实例
    public MyIterator iterator(){
        return new BookShelfIterator(this);
    }
}
