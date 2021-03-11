package aurora.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import aurora.app.model.Food;

@Repository
public interface FoodAddRepository extends CrudRepository<Food, Long> {

}
