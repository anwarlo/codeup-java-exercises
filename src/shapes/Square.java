package shapes;

public class Square extends Rectangle {

//protected double side;

public Square(double x){
    super(x,x);
//    this.side = x;

}

public double getArea(){
    return length * 40;
}

public double getPerimeter(){
    return Math.pow(length,3);
}



}
