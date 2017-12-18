package ru.itpark.jdbc.template;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import ru.itpark.dao.PersonDao;
import ru.itpark.models.Person;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.*;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonJdbcTemplateDaoImpl implements PersonDao {
    //language=SQL
    private static final String SQL_INSERT_USER = "INSERT  INTO person(first_name, middle_name, last_name) VALUES (?,?,?)";

    //language=SQL
    private static final String SQL_SELECT_USER_BY_ID = "SELECT * FROM person WHERE " +
            "id = ?";

    //language=SQL
    private static final String SQL_SELECT_USERS = "SELECT * FROM person";

    //language=SQL
    private static final String SQL_UPDATE_USER = "UPDATE person SET first_name = (?),middle_name = (?), last_name = (?)"+
            "WHERE id = (?)";

    //language=SQL
    private static final String SQL_DELETE_USER = "DELETE FROM person WHERE id = (?)";



    private JdbcTemplate template;
    private Map<Integer, Person> humansMap;

    public PersonJdbcTemplateDaoImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
        humansMap = new HashMap<>();
    }

    private RowMapper<Person> personRowMapper = (resultSet, rowNum) -> Person.builder()
            .id(resultSet.getInt("id"))
            .firstName(resultSet.getString("first_name"))
            .middleName(resultSet.getString("middle_name"))
            .lastName(resultSet.getString("last_name"))
            .build();

    @Override
    public List<Person> findAll(String firstName, String middleName, String lastName) {
        template.query(SQL_SELECT_USERS, personRowMapper);

        // получим все значения из map
        Collection<Person> humanCollection = humansMap.values();
        List<Person> result = new ArrayList<>(humanCollection);
        // теперь нужно сконвертировать Collection в ArrayList и вернуть
        humansMap.clear();
        return result;
    }


    @Override
    public void save(Person model) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        // посылаем запрос на создание пользователя
        template.update(
                // передаем PreparedStatement и KeyHolder
                new PreparedStatementCreator() {
                    // передаете ему connection к БД
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        // Непосредственно создаете PreparedStatement
                        // и говорите, что вам нужен будет id в результате
                        PreparedStatement ps =
                                connection.prepareStatement(SQL_INSERT_USER, new String[] {"id"});
                        // задаете параметры запроса
                        ps.setString(1, model.getFirstName());
                        ps.setString(2, model.getMiddleName());
                        ps.setString(3, model.getLastName());
                        return ps;
                    }
                }, keyHolder);
        // вытащили сгенерированный id из keyHolder и засунули в модель
        model.setId(keyHolder.getKey().intValue());
    }

    @Override
    public Person find(int id) {
        try {
            return template.queryForObject(SQL_SELECT_USER_BY_ID, personRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            // выбрасываем новое исключение с комментарием
            throw new IllegalArgumentException("Person with id <" + id + "> not found");
        }
    }

    @Override
    public void update(Person model) {
        template.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {

                        PreparedStatement ps =
                                connection.prepareStatement(SQL_UPDATE_USER);

                        ps.setString(1, model.getFirstName());
                        ps.setString(2, model.getMiddleName());
                        ps.setString(3, model.getLastName());
                        ps.setInt(3, model.getId());
                        System.out.println("Пользователь изменен");
                        return ps;
                    }
                });
    }

    @Override
    public void delete(int id) {
        template.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps =
                                connection.prepareStatement(SQL_DELETE_USER);

                        ps.setInt(1, id);
                        System.out.println("Пользователь изменен");
                        return ps;
                    }
                });
    }
}
