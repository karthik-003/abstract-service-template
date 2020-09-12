package amk.dev.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import amk.dev.entity.AbstractUser;

@Repository
public interface AbstractRepo extends JpaRepository<AbstractUser, Long>{

}
