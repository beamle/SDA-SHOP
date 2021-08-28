package persistence;

import util.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

    private Connection connection;

    public DatabaseManager() {
        DBUtil.createDatabase();
        connection = DBUtil.getDBConnection();
    }

    private void createTableCustomer() {
        String sql = "CREATE TABLE IF NOT EXISTS customer (\n"
                + "	customer_id int NOT NULL AUTO_INCREMENT,\n"
                        + "	account_status int DEFAULT NULL,\n"
                        + "	email varchar(255) DEFAULT NULL,\n"
                        + "	first_name varchar(255) DEFAULT NULL,\n"
                        + "	last_name varchar(255) DEFAULT NULL,\n"
                        + "	middle_name varchar(255) DEFAULT NULL,\n"
                        + "	password varchar(255) DEFAULT NULL,\n"
                        + "	phone_number varchar(255) DEFAULT NULL,\n"
                        + "	profile_image varchar(255) DEFAULT NULL,\n"
                        + "	username varchar(255) DEFAULT NULL,\n"
                        + "	 PRIMARY KEY (customer_id)\n"
                + ");";
        
        try {
             Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void initTables() {
        createTableCustomer();
    }
}
