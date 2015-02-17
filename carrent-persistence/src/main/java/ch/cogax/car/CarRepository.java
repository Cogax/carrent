package ch.cogax.car;

import java.util.List;

public interface CarRepository {

	List<Car> getUnreservedCars();

	List<Car> getAll();

	List<Car> getAvailable();
}
