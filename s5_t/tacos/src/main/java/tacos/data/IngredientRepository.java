package tacos.data;

import org.springframework.data.repository.CrudRepository;

import tacos.Ingredient;

/**
 * @author dell
 */
public interface IngredientRepository
         extends CrudRepository<Ingredient, String> {

}
