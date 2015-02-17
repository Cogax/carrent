package ch.cogax.car;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CarServiceImpl implements CarService {

	private CarRepository carRepository;

	@Autowired
	public CarServiceImpl(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	public List<CarDTO> getCars() {
		List<Car> allCars = this.carRepository.getAll();
		List<CarDTO> carDTOs = new ArrayList<CarDTO>();
		for (Car car : allCars) {
			carDTOs.add(new CarDTO());
		}
		return carDTOs;
	}

}
