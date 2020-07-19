package tacos.data;
import org.springframework.data.repository.CrudRepository;
import tacos.User;

/**
 * 继承自CrudRepository，得到crud操作
 *
 * @author dell
 */
public interface UserRepository extends CrudRepository<User, Long> {

  /**
   *  额外定义一个根据用户名查询用户的方法
   * @param username 用户名
   * @return 查询到的用户
   */
  User findByUsername(String username);
  
}
