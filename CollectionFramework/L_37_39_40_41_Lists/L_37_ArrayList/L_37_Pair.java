package CollectionFramework.L_37_39_40_41_Lists.L_37_ArrayList;

//Creating generic class
public class L_37_Pair<X,Y> {
    X x;
    Y y;
    public L_37_Pair(X x, Y y){
        this.x=x;
        this.y=y;
    }
    public void getDescription(){
        System.out.println(x+" and "+y);
    }
}
