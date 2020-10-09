import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCDemo {

		public static void main(String[] args)
		{
			Connection conn=null;
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver class loaded & Registered");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=afsaralam15");
				System.out.println("Connection Estalished with DB server");
			}catch(ClassNotFoundException|SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(conn!=null)
				{
					try {
						conn.close();
					}catch(SQLException e)
					{
						e.printStackTrace();
					}
					System.out.println("Closed All costly Resources");
				}
			}
		}

}
