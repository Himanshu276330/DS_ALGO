package HARRY_2021;

public class CWH_31_METHOD_IN_JAVA {
    //CREATING A LOGIC FOR ALL  FUNCTION at a time
    static int logic(int x , int y){
        int z;
        if (x>y){
            z=x+y;
        }else z=(x+y)*5;
        return z;
    }
    ////CREATING A LOGIC FOR  FUNCTION SEPARATED ,means we call it when required
     int logic1(int x1 , int y1){
        int z1;
        if (x1>y1){
            z1=x1+y1;
        }else z1=(x1+y1)*5;
        return z1;
    }
    //DIFFERENT TYPES OF LOGICS
    int logic2(int x2 , int y2){
        int z2;
        if (x2>y2){
            z2=(x2+y2)*5;
        }else z2=(x2*y2)*5;
        return z2;
    }

    public static void main(String[] args){
        int a=5;
        int b=7;
        int c;
        c=logic(a,b);
        System.out.println(c);

        int a1=2;
        int b1=1;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c1);

        int r=5;
        int s=7;
        int t;
        CWH_31_METHOD_IN_JAVA obj= new CWH_31_METHOD_IN_JAVA();
        t=obj.logic1(r,s);
        System.out.println(t);

        int r1=5;
        int s1=7;
        int t1;
        CWH_31_METHOD_IN_JAVA obj2= new CWH_31_METHOD_IN_JAVA();
        t1=obj.logic2(r,s);
        System.out.println(t1);




    }
}
