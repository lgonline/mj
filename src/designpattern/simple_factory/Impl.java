package designpattern.simple_factory;

/**
 * Created by root on 4/20/16.
 */
public class Impl implements Api{
    public void operation(String str){
        System.out.println("Now, it's Impl. the input is : "+str);
    }
}
