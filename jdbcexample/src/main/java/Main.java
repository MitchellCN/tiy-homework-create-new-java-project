import java.sql.SQLException;

/**
 * Created by cmitchell on 3/30/17.
 */
public class Main {



    public class Main {
        public static void main(String[] args) throws SQLException {
            String jdbcUrl = "jdbc:postgresql://localhost/people";
            PeopleRepository repository = new PeopleRepository(jdbcUrl);
            PeopleService service = new PeopleService(repository);


        }
    }

}
