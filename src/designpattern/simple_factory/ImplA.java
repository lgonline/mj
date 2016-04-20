package designpattern.simple_factory;

/**
 * Created by root on 4/19/16.
 */
public class ImplA implements Api{
    public void operation(String str){
        System.out.println("Impl A s == "+str);
    }
}
