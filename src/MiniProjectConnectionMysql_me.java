import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Java_Mysql_countty_me {
    public static void main(String[] args) {
        // VS code에서 폴더 만들기, Class 파일 만들기
        // Connect to database
            // Access to SQL server --> Mysql-connector J (Already done)
            // Check host name
            // Check user
            // Check Schema
            // Check password
            // Connection Method -jdbc (java DB connection)
            final String DB_URL = "jdbc:mysql://localhost/country";
            final String USER = "localhost";
            final String PASS = "tbrs00002b";
            try {
                // Connect to the 'world' database
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                
                // Open a statement (Edit window)
                Statement stmt = conn.createStatement();
                
                // Input Query on statement
                String QUERY = "select Code, Name, Continent, Capital "+
                "from country "+
                "Where 1 = 1 "+
                "and Name like \"%an&\";";

                // Insert the output from the execution into the 'rs' variable
                ResultSet rs = stmt.executeQuery(QUERY);
            
                // Chekc the grid (line by line) and the result & action output
                while (rs.next()){
                    // Retrieve by column name
                    System.out.print("Code: " + rs.getInt("Code"));
                    System.out.print(", NAME: " + rs.getString("NAME"));
                    System.out.print(", Continent: " + rs.getString("Continent"));
                    System.out.print(", Capital: " + rs.getString("Capital"));
                    
                }
            // Get result from Query by row (Top-Down way)
            } catch (SQLexception e){
                e.printStackTrace();
            }
            return;
        // Make Statments
        
        

    }
}