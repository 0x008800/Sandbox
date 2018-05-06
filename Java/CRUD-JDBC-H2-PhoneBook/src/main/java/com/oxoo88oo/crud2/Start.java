package com.oxoo88oo.crud2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Start {
	static Scanner sc = new Scanner(System.in);
	
	static int id;
	static String name;
	static String phone;
	static String pattern;
	static int select;
	
	static void start() throws SQLException, ClassNotFoundException{
		try(Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "" );
				Statement stmt = con.createStatement();){
				
				Class.forName("org.h2.Driver");
				
				/*stmt.executeUpdate( "CREATE TABLE PERSONS" +
						"(ID INT PRIMARY KEY AUTO_INCREMENT, " +
						"NAME VARCHAR(50), PHONE VARCHAR(20))");
				*/
		
		while(true){
		System.out.println("\t\t\t Select action:      ");
		System.out.println("\t\t\t\t\t 1 - add person      ");
		System.out.println("\t\t\t\t\t 2 - search person   ");
		System.out.println("\t\t\t\t\t 3 - update person   ");
		System.out.println("\t\t\t\t\t 4 - delete person   ");
		System.out.println("\t\t\t\t\t 5 - exit            ");
		try{
		select = Integer.parseInt(sc.nextLine());
		}
		catch(NumberFormatException e){
			System.out.println("\t\t\t\t\t Please, enter number");
			continue;
		}
		
		switch(select){
		case 1: 
			addPerson(stmt);
			break;
		case 2:
			searchPerson(stmt);
			break;
		case 3:			
			updatePerson(stmt);
			break;
		case 4:
			deletePerson(stmt);
			break;
		case 5:
			System.exit(0);
		default:{
			System.out.println("Please, enter correct number");
			continue;
			
		}
		}
		}
		}
		
	}
	
	private static void deletePerson(Statement stmt) throws SQLException {
		System.out.println("enter id");
		id = sc.nextInt();
		stmt.executeUpdate( "DELETE FROM PERSONS WHERE ID=" + id + ";" );
		
		
	}
	private static void updatePerson(Statement stmt) throws SQLException {
		System.out.print("<---\tenter id--->");
		sc.nextLine();
		id = Integer.parseInt(sc.nextLine());
		System.out.print("<---\tenter name--->");
		
		name = sc.nextLine();
		System.out.println("<---\tenter phone--->");
		
		phone = sc.nextLine();
		stmt.executeUpdate( "UPDATE PERSONS SET ID = '"+ id + "', NAME = '" + name + "', PHONE = '" + phone + "' WHERE ID="+ id);
		
	}
	private static void searchPerson(Statement stmt) throws SQLException {
		System.out.println("enter patter or not enter to see all");
		pattern = sc.nextLine();
		
		ResultSet rs;
		
		if(pattern.equals("")) rs = stmt.executeQuery("SELECT * FROM PERSONS");
		else rs = stmt.executeQuery("SELECT * FROM PERSONS WHERE NAME = '" +
								pattern + "' OR PHONE = '" + pattern + "'");
		
		
		
		while(rs.next()){
			String id = rs.getString("ID");
			String name = rs.getString("NAME");
			String phone = rs.getString("PHONE");
			System.out.println("\t\t\t\t\t " + id + " || " + name + " || " + phone );
		}
		
		
	}
	private static void addPerson(Statement stmt) throws SQLException {
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter phone number");
		phone = sc.next();
		stmt.executeUpdate( "INSERT INTO PERSONS VALUES ( NULL, '" + name + "', '"+ phone +"')");
		
	}

}
