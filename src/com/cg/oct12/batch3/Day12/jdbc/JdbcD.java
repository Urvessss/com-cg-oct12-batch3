package com.cg.oct12.batch3.Day12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JdbcD {

    private final String url = "jdbc:postgresql://localhost/cg12oct";
    private final String user = "postgres";
    private final String password = "root";

  
    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    
    public int deleteActor(int id) {
        String SQL = "DELETE FROM emp WHERE eid = ?";

        int affectedrows = 0;

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, id);

            affectedrows = pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JdbcD main = new JdbcD();
        main.deleteActor(101);

    }
}