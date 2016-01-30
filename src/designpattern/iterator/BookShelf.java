package designpattern.iterator;

/**
 * Created by liugang5 on 2016/1/30.
 */

/*
����и�books���ֶΣ�����Ĵ�Сmaxsize��һ��ʼ����bookshelfʵ��ʱ���趨����privateΪ��ֹ���������޸�

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

    //iterator�����ǲ���������bookshelfiterator��Ķ���ʵ��
    public MyIterator iterator(){
        return new BookShelfIterator(this);
    }
}
