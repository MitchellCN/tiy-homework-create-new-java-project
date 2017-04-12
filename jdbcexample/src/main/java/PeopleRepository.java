import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by cmitchell on 3/30/17.
 */
public class PeopleRepository {


    private final Connection conn;

    public PeopleRepository(String jdbcUrl) throws SQLException {
        this.conn = DriverManager.getConnection(jdbcUrl);
    }

    public void listPeople(){
        Statement stmt = conn.createStatement();
        return.stmt.executeQuery("SELECT * FROM person");
    }


}
