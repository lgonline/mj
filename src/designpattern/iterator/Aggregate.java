package designpattern.iterator;

/**
 * Created by liugang5 on 2016/1/30.
 */

/*
建立一个可对应聚合的iterator，要递增、遍历或逐一检查某个聚合时，利用iterator方法可以建立一个实现Iterator接口的类对象实例
 */
public interface Aggregate {
    public abstract MyIterator iterator();
}
