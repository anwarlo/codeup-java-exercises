public class Vehicles {

    public String vehicleString;

    public Vehicles(){
        this.vehicleString = "\nan operator\nlocomotion";
    }

    public void vehicleMethod(){
        System.out.printf("Vehicles have:%s",this.vehicleString);
    }

    public static void main(String[] args) {
        Vehicles vehicle = new Vehicles();
        vehicle.vehicleMethod();
    }
}
