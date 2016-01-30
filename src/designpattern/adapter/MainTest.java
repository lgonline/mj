package designpattern.adapter;

/**
 * Created by liugang5 on 2016/1/30.
 */
public class MainTest {
    public static void main(String[] args){
        MyPrint mp = new PrintBanner("Hello");
        mp.printWeak();
        mp.printStrong();
    }
}
