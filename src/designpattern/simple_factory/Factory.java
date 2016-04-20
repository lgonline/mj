package designpattern.simple_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by root on 4/19/16.
 * factory class to create a object of Api
 */
public class Factory {
    /*
    具体创建api对象的方法
    condition是从外部传入的选择条件
     */
    public static Api createApi(int condition){
        /*
        应该根据某些条件去选择究竟创建那一个具体的实现对象，这些条件可以从外部传入，也可以从其他途径获取，如果只有一个实现，可以省略
         */
        Api api = null;
        if(condition == 1){
            api = new ImplA();
        }else if(condition == 2){
            api = new ImplB();
        }/*
        如果新增一个实现类，简单修改源码即可，如果实现不需修改代码的加载，见下方
        */
        //else if(condition == 3){
        //  api = new ImplC();
        // }
        return api;
    }

    /*
    使用反射机制，加上配置文件，实现添加新的实现类后无需修改代码就能把这个新的实现类加入应用中
     */
    public static Api configToCreateApi(){
        Properties p = new Properties();
        InputStream in = null;
        try{
            in = Factory.class.getResourceAsStream("Factory.properties");
            p.load(in);
        }catch (IOException e){
            System.out.println("error was apprence when load the configration file of factory, detailed infor as " +
                    "follows : ");
        }finally {
            try{
                in.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        Api api = null;
        try{
            api = (Api)Class.forName(p.getProperty("ImplClass")).newInstance();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return api;
    }
}
