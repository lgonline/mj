package designpattern.iterator;

/**
 * Created by liugang5 on 2016/1/30.
 */

/*
Iterator接口执行元素递增，具有类似循环变量的功能
hasNext用来检查有没有下一个元素
next是取得下一个元素
 */
public interface MyIterator {
    public abstract boolean hasNext();
    public abstract Object next();
}
