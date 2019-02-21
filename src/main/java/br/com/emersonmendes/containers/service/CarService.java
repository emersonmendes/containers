package br.com.emersonmendes.containers.service;


import br.com.emersonmendes.containers.model.Car;

import java.util.Set;

public interface CarService {

    Car save(Car car);

    Set<Car> findByName(String name);

    Set<Car> findAll();

}
