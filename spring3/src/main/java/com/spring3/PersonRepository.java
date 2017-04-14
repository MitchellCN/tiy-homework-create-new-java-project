package com.spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cmitchell on 4/13/17.
 */
@Component
public class PersonRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Person> listPeople(String search){
        return jdbcTemplate.query("SELECT * FROM person WHERE  (firstname) = lower(?) or lower(lastname) = lower(?)",
                new Object[] {search, search},
                (resultSet, i) -> new Person(
                        resultSet.getInt("personid"),
                        resultSet.getString("title"),
                        resultSet.getString("firstname"),
                        resultSet.getString("middlename"),
                        resultSet.getString("lastname"),
                        resultSet.getString("suffix")
                ));





    }


}