package designpattern.adapter;

/**
 * Created by liugang5 on 2016/1/30.
 */
public class Banner {
    private String str;

    public Banner(String str){
        this.str = str;
    }

    public void showWithParen(){
        System.out.println("("+str+")");
    }

    public void showWithAster(){
        System.out.println("*"+str+"*");
    }
}
