package designpattern.iterator;

/**
 * Created by liugang5 on 2016/1/30.
 */

/*
��ʾ����࣬��������getName�������
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
