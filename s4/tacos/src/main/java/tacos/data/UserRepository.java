package tacos.data;
import org.springframework.data.repository.CrudRepository;
import tacos.User;

/**
 * @author dell
 */
public interface UserRepository extends CrudRepository<User, Long> {

  User findByUsername(String username);
  
}
