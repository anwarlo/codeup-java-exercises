public class Cars extends Vehicles {

    public String carString;

    public Cars(){
        this.carString = "four wheels\nsteering wheel\nengine\nneeds fuel\n";
    }
    public void carMethod(){
        System.out.printf("%nCars in addition have:%n%s",this.carString);
    }

    public static void main(String[] args) {
        Cars cars = new Cars();
        cars.vehicleMethod();
        cars.carMethod();
    }

}
