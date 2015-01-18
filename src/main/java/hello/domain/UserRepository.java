package hello.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by wshino on 15/01/18.
 */
public interface UserRepository extends JpaRepository<User, Long> {

//    Page<User> findAll(Pageable pageable);
}
