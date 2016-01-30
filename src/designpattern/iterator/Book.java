package designpattern.iterator;

/**
 * Created by liugang5 on 2016/1/30.
 */

/*
表示书的类，可以利用getName获得书名
 */
public class Book {
    private String name = "";

    public Book(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
