package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<Car> carList = initCarList();

    public List<Car> initCarList() {
        carList = new ArrayList<>();

        carList.add(new Car("Audi", "red", (short) 2000));
        carList.add(new Car("Toyota", "green", (short) 1998));
        carList.add(new Car("Lada", "purple", (short) 2007));
        carList.add(new Car("Kia", "silver", (short) 2003));
        carList.add(new Car("Lexus", "carrot", (short) 2010));
        return carList;
    }

    public List<Car> getCarList(Integer count) {
        List<Car> countedCar = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (count >= 5) {
                countedCar = carList;
                break;
            }
            countedCar.add(carList.get(i));
        }
        return countedCar;
    }
}
