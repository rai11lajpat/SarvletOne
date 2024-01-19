package projectOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

class InsertInDb{
	String name;
	String fName;
	String rollNo;
	String email;
	String gender;
	String adr;
	String depart;
	void update(){
		
		try{
            Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "");
            Statement stat=con.createStatement();
            PreparedStatement ps=con.prepareStatement("insert into studentdetails(name,fName,rollNo,email,gender,adress,depart) values(?,?,?,?,?,?,?);");
            Scanner sc=new Scanner(System.in);
            
            ps.setString(1,name);
            ps.setString(2,fName);
            ps.setString(3,rollNo);
            ps.setString(4,email);
            ps.setString(5,gender);
           // ps.setString(6,request.getParameter("image"));
            ps.setString(6,adr);
            ps.setString(7,depart);
            
            ps.executeUpdate();
            stat.close();
            if(con.isClosed()){
                System.out.println("connection is closed");
            }else{
                System.out.println("connection is not closed");
            }
            
         }catch(Exception e){
            e.printStackTrace(); 		                }
		
	}
}

public class DbManager {
	
}
