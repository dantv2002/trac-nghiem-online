package tracnghiemonline.tracnghiembetvd.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import tracnghiemonline.tracnghiembetvd.entities.User;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByEmail(String email);

    @Query(value = "{'email': ?0}")
    Optional<User> getUser(String email);

}
