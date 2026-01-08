package SingletonEncapsulation;

public class Connection {
	private static Connection con=null;//address
	public static Connection getConnection() {
		if(con==null) {
			con=new Connection();
		}
		return con;
	}
	private Connection() {
		
	}

}
