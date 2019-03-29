package shapes;

public class Square extends Quadrilateral {

    public Square(double length) {
        super(length, length);
    }


    public double setLength() {
        return length;
    }

    public double setWidth() {
        return width;
    }

    //protected double side;

//public Square(double x){
//    super(x,x);
//    this.side = x; not needed

//}
//
//public double getArea(){
//    return length * 40;
//}
//
//public double getPerimeter(){
//    return Math.pow(length,3);
//}



}
