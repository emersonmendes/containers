package br.com.digitro.containers.service;

import br.com.digitro.containers.AbstractTest;
import br.com.digitro.containers.model.Car;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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

}
