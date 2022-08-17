
package bai2;

import java.util.ArrayList;
import java.util.List;

public class ManagerVehicle {
    private List<Vehicle> vehicles;

    public ManagerVehicle() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void showListInforVehicle() {
        this.vehicles.forEach(o -> System.out.println(o.toString()));
    }

    public void sortGiam() {
        vehicles.sort(((o1, o2) -> Double.compare(o2.tinhThue(), o1.tinhThue())));
        vehicles.forEach(vehicle -> System.out.println(vehicle.toString()));
    }

    public void sortTang() {
        vehicles.sort(((o1, o2) -> Double.compare(o1.getTriGia(), o2.getTriGia())));
        vehicles.forEach(vehicle -> System.out.println(vehicle.toString()));
    }
}