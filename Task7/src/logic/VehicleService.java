package logic;
import Container.VehicleList;
public class VehicleService {

        public VehicleList getVehiclesYoungerThan(VehicleList vehicleList, int year) {
            VehicleList youngVehicles = new VehicleList();

            for (int i = 0; i < vehicleList.size(); i++) {
                if (vehicleList.get(i).getYearOfIssue() > year) {
                    youngVehicles.add(vehicleList.get(i));
                }
            }

            return youngVehicles;
        }

        public int findTotalPrice(VehicleList vehicleList) {
            int totalPrice = 0;

            for (int i = 0; i < vehicleList.size(); i++) {
                totalPrice += vehicleList.get(i).getPrice();
            }

            return totalPrice;
        }

        public VehicleList findVehicleByModel(VehicleList vehicleList, String model) {
            VehicleList vehicleListWithSameModel = new VehicleList();

            for (int i = 0; i < vehicleList.size(); i++) {
                if (vehicleList.get(i).getModel().equals(model)) {
                    vehicleListWithSameModel.add(vehicleList.get(i));
                }
            }

            return vehicleListWithSameModel;
        }
    }
