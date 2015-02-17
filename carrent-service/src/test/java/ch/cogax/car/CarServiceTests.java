package ch.cogax.car;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CarServiceTests {

	private CarRepository carRepository;
	private CarService carService;

	@Before
	public void setUp() {
		this.carRepository = mock(CarRepository.class);

		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car());
		cars.add(new Car());
		cars.add(new Car());
		cars.add(new Car());

		when(this.carRepository.getAll()).thenReturn(cars);

		carService = new CarServiceImpl(this.carRepository);
	}

	@Test
	public void whenGetCars_ThenReturnAllCars() {
		List<CarDTO> carDTOs = carService.getCars();
		assertEquals(4, carDTOs.size());
	}

}
