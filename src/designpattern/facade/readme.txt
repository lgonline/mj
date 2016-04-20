1、外观模式
例子：买电脑有两种方式，一种是自己去电子市场买全部配件，另一种是找个装机公司。装机公司相当于外观模式
系统有多个模块，客户端无需知晓所有模块的细节，由一个总代来完成与各个模块的交互

2、不使用模式
public class ConfigModel{
    private boolean needGenPresentation = true;//生成表现层
    private boolean needGenBusiness = true;//生成逻辑层
    private boolean needGenDAO = true
    public boolean setNeedGenPresentation{
        return needGenPresentation;
    }
    public void setNeedGenPresentation(boolean needGenPresentation){
        this.needGenPresentation = needGenPresentation;
    }
    public boolean isNeedGenBusiness(){
        return needGenBusiness;
    }
    public void setNeedGenBusiness(boolean needGenBusiness){
        this.needGenBusiness = needGenBusiness;
    }
    public boolean isNeedDAO(){
        return needGenDAO;
    }
    public void sestNeedGenDAO(boolean needGenDAO){
        this.needGenDAO = needGenDAO;
    }
}
public class configManager{//读取配置文件，并把配置文件的内容设置到配置model中
    private static ConfigManager manager = null;
    private static CoinfigModel cm = null;
    private CoinfigManager(){}
    public static COnfigManager getInstance(){
        if(manage == null){
            manager = new CoinfigManager();
            cm = new ConfigModel();
        }
        return manager;
    }
    public ConfigModel getConfigData(){//获取配置的数据
        return cm;
    }
}
public class Presentataion{
    public void generate(){
        ConfigModel cm = ConfigManager.agetInstance().getConfigData();//从配置文件获取配置信息
        if(cm.isNeedGenPresentation()){}
    }
}