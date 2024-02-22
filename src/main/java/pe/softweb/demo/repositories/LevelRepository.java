package pe.softweb.demo.repositories;

import java.util.List;
import pe.softweb.demo.entities.Level;
import org.springframework.data.repository.CrudRepository;

public interface LevelRepository extends CrudRepository<Level, Long> {

  List<Level> findByName(String name);

  Level findById(long id);
}