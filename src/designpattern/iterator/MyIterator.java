package designpattern.iterator;

/**
 * Created by liugang5 on 2016/1/30.
 */

/*
Iterator�ӿ�ִ��Ԫ�ص�������������ѭ�������Ĺ���
hasNext���������û����һ��Ԫ��
next��ȡ����һ��Ԫ��
 */
public interface MyIterator {
    public abstract boolean hasNext();
    public abstract Object next();
}
