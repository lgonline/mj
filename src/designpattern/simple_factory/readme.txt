简单工厂模式
1、Java程序中，非常讲究层的划分和模块的划分：
表现层（UI组件、UI模块）---逻辑层接口--->逻辑层（逻辑层组件、业务模块）---数据层接口--->数据层（数据处理组件、数据存储组件）

2、在每个层内部的各个模块间交互要通过接口

3、不用模式的解决方案
public interface api{
    public void test1(String str);
}
public class impl implements api{
    public void test(String str){
        System.out.println("now, in impl. the input is : "+str);
    }
}
public class client{
    public static void main(String[] args){
        api apis = new impl();
        api.test("just a test!");
    }
}

问题：客户端调用时不但知道了接口而且知道了具体实现。接口的思想是封装隔离，客户端根本不应知道具体的实现类。拿掉impl则无法得到api接口对象。

4、简单工厂的定义：
提供一个创建对象实例的功能，无须关心具体实现。被创建的实例的类型可以是接口、抽象类或具体的类
client                  -\  interface               -\  impla
main(String[] args)     -/  operation(s:String)     -/  operation(s:String)
 |                          ^       ^                           ^
 |  ------------------------|       |                           |
 v  |                               |                           |
factory                     -\  implb                           |
createapi(condition:int)    -/  operation(s:String)             |
      |                                                         |
      -----------------------------------------------------------

5、思考简单工厂
简单工厂的目的在于为客户端来选择具体的实现，本质是选择实现，它能帮助封装和客户端与实现之间的解偶，但可能增加客户端的复杂度且不方便扩展子工厂
在完全封装隔离具体实现、吧对外创建的对象的职责集中管理时，可以选择简单工厂