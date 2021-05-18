package CollectionFramework.L_49_hashCode_and_equals;

import java.util.Collection;
import java.util.Objects;

class Pen {

    int price;
    String color;

    public Pen(int price, String color) {
        this.price = price;
        this.color = color;
    }

          //Made by intel idea
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return this.price == pen.price && this.color.equals(pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price,color);
    }


          //Made by me
    //Both do same work
//    @Override
//    public boolean equals(Object obj){
//        Pen that=(Pen)obj;
//        boolean isEqual=this.price== that.price && this.color== that.color;
//        return isEqual;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        Pen that = (Pen) obj;
//        boolean isEqual = this.price == that.price && this.color.equals(that.color);
//        return isEqual;
//    }
//
//    @Override
//    public int hashCode() {
//        return price + color.hashCode();
//    }



}
