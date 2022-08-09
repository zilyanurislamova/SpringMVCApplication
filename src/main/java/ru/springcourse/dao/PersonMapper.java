package ru.springcourse.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.springcourse.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

// BeanPropertyRowMapper<>(Person.class) used instead

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Person person = new Person();

        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("name"));
        person.setAge(resultSet.getInt("age"));
        person.setEmail(resultSet.getString("email"));

        return person;
    }
}
