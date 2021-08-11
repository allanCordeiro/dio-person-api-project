package one.digitalinnovation.peopleapi.repositories;

import one.digitalinnovation.peopleapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
