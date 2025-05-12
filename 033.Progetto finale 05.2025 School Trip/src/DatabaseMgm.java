import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseMgm {
	
	public static boolean read(ArrayList<Student> St, ArrayList<Teacher> tc, ArrayList<Activity> act, ArrayList<Trip> tr)
	{
		
		return true;
	}
	
	public static void test1()
	{
		String url = "jdbc:mysql://localhost:3306/scuola";
        String user = "root";
        String password = "";

        try {
            // 1. Connessione al database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connessione riuscita!");

            // 2. Creazione di uno Statement
            Statement stmt = conn.createStatement();

            // 3. Esecuzione di una query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            

            // 4. Lettura dei risultati
            while (rs.next()) {
                System.out.println("Utente: " + rs.getString("name"));
            }

            // 5. Chiusura della connessione
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
