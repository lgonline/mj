package designpattern.iterator;

/**
 * Created by liugang5 on 2016/1/30.
 */

/*
实现MyIterator接口可已将BookShelfIterator使用Ierator进行处理
 */
public class BookShelfIterator implements MyIterator{
    //bookShelf是BookShelfIterator所扫描的书架
    private BookShelf bookShelf;
    //index指向目前该书的下标
    private int index;

    //构造函数把传过来的bookshelf对象实例存储在bookshelf字段，将index设为0
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    //实现接口所声明的方法，检查是否有下一本书，有则返回true，否则为false。
    public boolean hasNext(){
        if(index < bookShelf.getLength()){
            return true;
        }else{
            return false;
        }
    }

    //返回目前该书（book的对象实例），并进入到下一个的方法
    public Object next(){
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
