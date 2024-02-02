package ru.netology.diplom.repository;

import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class UserRepository {

    String url = "jdbc:postgresql://localhost:5432/postgres";
    String username = "postgres";
    String password = "postgres";

    public User findByUsername(String login) throws SQLException {
        String sql = "select * from users where login = '" + login + "'";

        Connection conn = DriverManager.getConnection(url, username, password);
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            final ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                final User obj = new User();
                obj.setLogin(rs.getString("login"));
                obj.setPassword(rs.getString("password"));
                obj.setData(rs.getString("data"));
                return obj;
            } else {
                return null;
            }
        }
    }
}
