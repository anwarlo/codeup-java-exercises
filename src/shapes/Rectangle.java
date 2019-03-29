package shapes;

public class Rectangle {

    //set protected variables

    protected double length;

    protected double width;

    //Constructor to set length and width for class

    public Rectangle(double a,double b){
        this.length = a;
        this.width = b;
    }



public double getArea() {
    return length * width;
    }

public double getPerimeter(){
   return (2 * length) + (2 * width);
    }


//public Rectangle(){}
}
