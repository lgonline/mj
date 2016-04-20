package designpattern.simple_factory;

/**
 * Created by root on 4/19/16.
 * 客户端，使用api接口
 */
public class client {
    public static void main(String[] args){
        //get a object via simple factory
        Api api = Factory.createApi(1);
        api.operation("using factory now");

        System.out.println("--------------using configuration file to get api--------------");
        Api api2 = Factory.configToCreateApi();
        api2.operation("just a test!");
    }
}
