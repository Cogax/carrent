package ch.cogax.car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

	private CarRepository carRepository;

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
