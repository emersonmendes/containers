package br.com.emersonmendes.containers.service;

import br.com.emersonmendes.containers.AbstractTest;
import br.com.emersonmendes.containers.model.Car;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarServiceTest extends AbstractTest {

	@Autowired
	private CarService service;

	@Test
	public void testSomething() {

		Car car = new Car();
		car.setName("Fusca");

		Car newCar = service.save(car);

		assertNotNull(newCar);
		assertNotNull(newCar.getId());
		assertEquals("Fusca", car.getName());

	}

    @Test
    public void testSomething1() {
        Set<Car> cars = service.findAll();
        assertEquals(8, cars.size());
    }

}
