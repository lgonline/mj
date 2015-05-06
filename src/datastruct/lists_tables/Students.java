package datastruct.lists_tables;

/**
 * Created by Administrator on 2015/5/6.
 */
public class Students {
    private int sno;
    private String sname;

    public int getSno() {
        return sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void Display(){
        System.out.println("The no is "+sno+" and name is "+sname);
    }

    public static void main(String[] args){
//        int lenght = 35;
//        Student sdata[] = new Student[lenght];
        Students stu = new Students();
        stu.setSno(120010131);
        stu.setSname("sili");
        LineList ll = new LineList();
        ll.insert(1,stu);
        System.out.println(ll.sdata[0].sno+" "+ll.sdata[0].sname);
    }
}
