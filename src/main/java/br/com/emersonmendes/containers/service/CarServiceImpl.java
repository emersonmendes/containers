package br.com.emersonmendes.containers.service;

import br.com.emersonmendes.containers.model.Car;
import br.com.emersonmendes.containers.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository repository;

    public Car getOne(Long id){
        return repository.getOne(id);
    }

    @Override
    public Car save(Car car) {
        return repository.save(car);
    }

    @Override
    public Set<Car> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Set<Car> findAll() {
        return repository.findAll().stream().collect(Collectors.toSet());
    }

}
