package designpattern.iterator;

/**
 * Created by liugang5 on 2016/1/30.
 */

/*
����һ���ɶ�Ӧ�ۺϵ�iterator��Ҫ��������������һ���ĳ���ۺ�ʱ������iterator�������Խ���һ��ʵ��Iterator�ӿڵ������ʵ��
 */
public interface Aggregate {
    public abstract MyIterator iterator();
}
