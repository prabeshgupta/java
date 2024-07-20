import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RegistrationModel {
    public static boolean saveRegistration(String name, String gender, int age, String address,
            boolean isStudent) throws ClassNotFoundException, SQLException {

        String strQry = "insert into user(name, gender, age, address, isStudent) values (?, ?, ?, ?, ?);";

        try (Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(strQry)) {
            statement.setString(1, name);
            statement.setString(2, gender);
            statement.setInt(3, age);
            statement.setString(4, address);
            statement.setBoolean(5, isStudent);

            return statement.executeUpdate() > 0;
        }
    }

    public static List<Object[]> displayRegistration() throws ClassNotFoundException, SQLException {
        List<Object[]> registeredData = new ArrayList<>();
        String strQry = "SELECT * FROM user";
        try (Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(strQry);
                ResultSet resultSet = preparedStatement.executeQuery();) {
            while (resultSet.next()) {
                Object[] row = {
                        resultSet.getString("name"),
                        resultSet.getBoolean("isStudent"),
                        resultSet.getString("gender"),
                        resultSet.getInt("age"),
                        resultSet.getString("address")
                };
                registeredData.add(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return registeredData;
    }
}
