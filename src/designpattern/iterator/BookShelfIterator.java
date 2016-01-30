package designpattern.iterator;

/**
 * Created by liugang5 on 2016/1/30.
 */

/*
ʵ��MyIterator�ӿڿ��ѽ�BookShelfIteratorʹ��Ierator���д���
 */
public class BookShelfIterator implements MyIterator{
    //bookShelf��BookShelfIterator��ɨ������
    private BookShelf bookShelf;
    //indexָ��Ŀǰ������±�
    private int index;

    //���캯���Ѵ�������bookshelf����ʵ���洢��bookshelf�ֶΣ���index��Ϊ0
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    //ʵ�ֽӿ��������ķ���������Ƿ�����һ���飬���򷵻�true������Ϊfalse��
    public boolean hasNext(){
        if(index < bookShelf.getLength()){
            return true;
        }else{
            return false;
        }
    }

    //����Ŀǰ���飨book�Ķ���ʵ�����������뵽��һ���ķ���
    public Object next(){
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
