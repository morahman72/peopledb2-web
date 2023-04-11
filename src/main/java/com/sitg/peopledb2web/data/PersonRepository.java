package com.sitg.peopledb2web.data;

import com.sitg.peopledb2web.biz.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
