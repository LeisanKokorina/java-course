package ru.itpark.jdbc.template;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.lang.Nullable;
import ru.itpark.dao.CarDao;
import ru.itpark.models.Car;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CarJdbcTemplateDaoImpl implements CarDao {
    //language=SQL
    private static final String SQL_INSERT_CAR = "INSERT INTO car(number, model, color, owner_id)" +
            "VALUES (?, ?, ?, ?)";

    //language=SQL
    private static final String SQL_SELECT_CAR_BY_ID = "SELECT * FROM car WHERE " +
            "id = ?";

    //language=SQL
    private static final String SQL_SELECT_CARS = "SELECT * FROM car";

    //language=SQL
    private static final String SQL_SELECT_CARS_BY_COLOR = "SELECT * FROM car WHERE color = ?";

    //language=SQL
    private static final String SQL_UPDATE_CAR = "UPDATE car SET number = ?, model = ?, color = ?, owner_id = ? " +
            "WHERE id = ?;";

    //language=SQL
    private static final String SQL_CHECK_IS_EXIST = "SELECT id FROM car WHERE id = ?;";

    //language=SQL
    private static final String SQL_DELETE_CAR = "DELETE FROM car WHERE id = ?;";

    private JdbcTemplate template;

    public CarJdbcTemplateDaoImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    private RowMapper<Car> carRowMapper = new RowMapper<Car>() {

        @Override
        public Car mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Car(resultSet.getInt("id"),
                    resultSet.getString("number"),
                    resultSet.getString("model"),
                    resultSet.getString("color"),
                    resultSet.getInt("owner_id"));
        }
    };


    @Override
    public List<Car> findAllByColor(String color) {
        return template.query(SQL_SELECT_CARS_BY_COLOR, carRowMapper, color);
    }

    @Override
    public void save(Car model) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        template.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps =
                                connection.prepareStatement(SQL_INSERT_CAR, new String[]{"id"});
                        ps.setString(1, model.getNumber());
                        ps.setString(2, model.getModel());
                        ps.setString(3, model.getColor());
                        ps.setInt(4, model.getOwnerId());
                        return ps;
                    }
                }, keyHolder);
        model.setId(keyHolder.getKey().intValue());
        System.out.println("Машина добавлена");
    }


    @Override
    public Car find(int id) {
        return template.queryForObject(SQL_SELECT_CAR_BY_ID, carRowMapper, id);
    }

    @Override
    public void update(Car model) {
        template.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps =
                        connection.prepareStatement(SQL_UPDATE_CAR);
                ps.setString(1, model.getNumber());
                ps.setString(2, model.getModel());
                ps.setString(3, model.getColor());
                ps.setInt(4, model.getOwnerId());
                ps.setInt(5, model.getId());
                System.out.println("Машина № " + model.getId() + " изменена.");
                return ps;
            }
        });
    }

    @Override
    public void delete(int id) {
        template.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps =
                        connection.prepareStatement(SQL_DELETE_CAR);
                ps.setInt(1, id);
                System.out.println("Машина № "+ id + " удалена.");
                return ps;
            }
        });
    }

    @Override
    public List<Car> findAll() {
        return null;
    }
}
