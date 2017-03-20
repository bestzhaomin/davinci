package app.domain;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long>{
	
	Person findByAccount(String account);
	Person findByName(String name);

}
