package br.com.emersonmendes.containers.repository;

import br.com.emersonmendes.containers.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    Set<Car> findByName(String name);

}
