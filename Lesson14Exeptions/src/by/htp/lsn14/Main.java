package by.htp.lsn14;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		/*Throwable tr = new Throwable();

		Exception ex = new Exception();
		
		Error er = new Error();
		
		String s = null;
		s.chars();
		
		throw new Throwable("Something gona wrong!");*/
		
		File f = new File(" ");
		String s = null;
		
		//try {
			
			try {
				s = f.getCanonicalPath();
				generateIOProblem(true);
				generateSQLProblem();
			} catch (IOException e) {
				System.out.println("Problem IO exists");
			} catch (SQLException e) {
				System.out.println("Problem SQL exists");
			}
			
		/*} catch(IOException e) {
			System.out.println("Problem exists");
		}*/
		
		System.out.println(s);
	}

	public static void generateIOProblem(boolean value) throws IOException {
		if (!value) {
			throw new IOException();
		}
	}
	
	public static void generateSQLProblem() throws SQLException {
		throw new SQLException();
	}
}
