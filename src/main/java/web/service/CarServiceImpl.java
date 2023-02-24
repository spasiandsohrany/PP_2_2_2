package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2021));
        cars.add(new Car("Tesla", "Model 3", 2022));
        cars.add(new Car("Ford", "Mustang", 2019));
        cars.add(new Car("Chevrolet", "Corvette", 2018));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}