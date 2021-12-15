
package Reto2_web.interfaces;


import Reto2_web.modelo.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Jhon Fredy Lizarazo Torres
 */
public interface InterfaceUser extends MongoRepository<User, Integer> {
     Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}
