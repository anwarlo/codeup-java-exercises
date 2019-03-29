package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public double setLength() {
        return length;
    }


    public double setWidth() {
        return width;
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }


    //set protected variables

//    protected double length;
//
//    protected double width;

    //Constructor to set length and width for class

//    public Rectangle(double a,double b){
//        this.length = a;
//        this.width = b;
//    }
//
//
//
//public double getArea() {
//    return length * width;
//    }
//
//public double getPerimeter(){
//   return (2 * length) + (2 * width);
//    }


//public Rectangle(){} not needed
}
