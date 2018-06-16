package Test;
import Container.VehicleList;
import Entities.PassengerCar;
import Entities.Truck;
import Entities.Vehicle;
import logic.VehicleService;

public class Test7 {
    public static void main(String[] args) {

        PassengerCar passengerCar = new PassengerCar((byte) 5, "black", "BMW", 2008, 1928374, 20000, 350);
        Truck truck = new Truck((byte) 2, "white", "FORD", 2012, 17282934, 50000, 20000, 6);

        Vehicle[] vehicles = {passengerCar, truck};

        //test container
        VehicleList vehicleList = new VehicleList();
        vehicleList.add(vehicles);

        System.out.println("Size of vehicle list: " + vehicleList.size());
        System.out.println("Is empty? " + vehicleList.isEmpty());
        vehicleList.clear();
        System.out.println("Is empty after clear? " + vehicleList.isEmpty());
        vehicleList.add(passengerCar);
        vehicleList.add(truck);
        System.out.println("contains truck and passenger car? " + vehicleList.containsAll(vehicles));
        vehicleList.remove(1);
        System.out.println("size after delete: " + vehicleList.size());
        vehicleList.add(vehicles[1]);
        System.out.println();

        //test entities
        //test copy constructor
        PassengerCar copyCar = new PassengerCar(passengerCar);
        System.out.println("copy passenger car: " + copyCar + "\n");

        //test  vehicle service
        VehicleService service = new VehicleService();

        // test total price
        System.out.println("total price: " + service.findTotalPrice(vehicleList) + "\n");

        //test find getVehiclesYoungerThan
        VehicleList youngCars = service.getVehiclesYoungerThan(vehicleList, 2000);
        System.out.println("vehicles younger than 2000 year model");
        System.out.println(youngCars + "\n");

        //test find findVehiclesByModel
        VehicleList vehicleListWithSameModel = service.findVehicleByModel(vehicleList, "BMW");
        System.out.println("vehicles BMW model");
        System.out.println(vehicleListWithSameModel + "\n");
    }
}
