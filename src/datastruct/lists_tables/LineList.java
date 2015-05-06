package datastruct.lists_tables;

/**
 * Created by Administrator on 2015/5/6.
 */
public class LineList {
    int length = 35;
    Students sdata[] = new Students[];
    int curlen = 0;

    public LineList(){}

    public boolean insert(int i,Students stu){
        if(i<1||i>this.length||curlen>=length){
            return false;
        }

        int n = this.curlen;

        for(;n>=i;n--){
            sdata[n] = sdata[n-1];
        }

        sdata[n] = stu;
        this.curlen++;
        return true;
    }
}
