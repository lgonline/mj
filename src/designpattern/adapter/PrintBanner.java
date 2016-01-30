package designpattern.adapter;

/**
 * Created by liugang5 on 2016/1/30.
 */
public class PrintBanner extends Banner implements MyPrint {
    public PrintBanner(String str){
        super(str);
    }

    public void printStrong(){
        showWithParen();
    }

    public void printWeak(){
        showWithAster();
    }
}
