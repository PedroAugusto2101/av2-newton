package newtonpaiva.arqweb.av2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import newtonpaiva.arqweb.av2.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
