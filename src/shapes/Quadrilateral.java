package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

        protected double length;

        protected double width;

    public Quadrilateral(double length,double width) {
        this.length = length;
        this.width = width;

    }

    public abstract double setLength();



    public abstract double setWidth();



    public double getArea() {

            return length * width;

    }

    public double getPerimeter(){

            return (2 * length) + (2 * width);

    }



}
