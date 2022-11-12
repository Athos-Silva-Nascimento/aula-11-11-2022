import java.sql.Connection;
import java.sql.DriverManager;

public class Acessos {

	private static final String USERNAME = "root";
	private static final String PASSWORD = "etec";
	private static final String  DATABASE_URL= "jdbc:mysql://localhost:3306/banco_alunos?useSSL=false";
	
	public static Connection createConnectionToMySQL() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception{
		
		Connection con = createConnectionToMySQL();
		
		con.close();

	}

}
