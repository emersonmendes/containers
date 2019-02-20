package br.com.digitro.containers.service;

import br.com.digitro.containers.model.Car;
import br.com.digitro.containers.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
