package hibernateAnnotationDAO.personHbm;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface Person1Dao {
	Person1 createCustomer(Person1 person) throws SQLException, IOException;
	List<Person1> displayAllPersons() throws SQLException;
	Person1 findById(String id) throws SQLException;
	Person1 findByLname(String lname) throws SQLException;
	Person1 updateCustomer(String id) throws SQLException, IOException;
	Person1 deleteCustomer(String id) throws SQLException;
}
