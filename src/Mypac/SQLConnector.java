package Mypac;



import  java.sql.Connection;		
import  java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;

				@Test
public class  SQLConnector {	
	
    	public  void  SQL_connector(String id,String name,String age,String country,String gender) throws  Exception {	
    		
				//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
                String dbUrl = "jdbc:mysql://sql6.freesqldatabase.com:3306/sql6510361";					

				//Database Username		
				String username = "sql6510361";	
                
				//Database Password		
				String password = "ESEQBiH6Rw";				

				//Query to Execute		
				String query = "select * from Emp;";	
				String query1 ="SELECT * FROM Emp WHERE Name='"+name.trim()+"';";
				String query2 ="SELECT * FROM Emp WHERE Name='Henry' AND Age ='25';";
				System.out.println(query1);
				
         	    //Load mysql jdbc driver		
//           	    Class.forName("com.mysql.jdbc.Driver");			
           
           		//Create Connection to DB		
            	Connection con = DriverManager.getConnection(dbUrl,username,password);
          
          		//Create Statement Object		
        	   Statement stmt = con.createStatement();					
       
       			// Execute the SQL Query. Store results in ResultSet		
         		ResultSet rs= stmt.executeQuery(query);	

         		// While Loop to iterate through all data and print results		
				while (rs.next()){
			        		String Id = rs.getString("Id");								        
                            String Name = rs.getString("Name");	
                            String Age = rs.getString("Age");								        
                            String Country = rs.getString("Country");
                            String Gender = rs.getString("Gender");								        
//                            String myAge = rs.getString(2);
                            System. out.println(Id+" "+Name+" "+Age+" "+Country+" "+Gender);		
                    }		
				
				ResultSet rs2= stmt.executeQuery(query1);
				while (rs2.next()){
	        		String Id = rs2.getString("Id");								        
                    String Name = rs2.getString("Name");	
                    String Age = rs2.getString("Age");								        
                    String Country = rs2.getString("Country");
                    String Gender = rs2.getString("Gender");								        
//                    String myAge = rs.getString(2);
//                    System. out.println(Id+" "+Name+" "+Age+" "+Country+" "+Gender);
                    Assert.assertEquals(Name.toUpperCase(), name.toUpperCase(),"Name not in the DB");
                    Assert.assertEquals(Age.toUpperCase(), age.toUpperCase(),"Age not in the DB");
                    Assert.assertEquals(Id.toUpperCase(), id.toUpperCase(),"id not in the DB");
                    Assert.assertEquals(Country.toUpperCase(), country.toUpperCase(),"Country not in the DB");
                    Assert.assertEquals(Gender.toUpperCase(), gender.toUpperCase(),"Gender not in the DB");
                    System.out.println(Name+" is validated successfully");
            }
				
      			 // closing DB Connection		
      			con.close();			
		}
}


//INSERT INTO `Emp` (`Id`, `Name`, `Age`, `Country`, `Gender`) VALUES ('11', 'Henry', '25', 'India', 'Male');
//11 Henry 25 India Male
//12 James 45 USA Male
//13 Eliz 22 UK Female
//14 Jean 50 India Female
//15 Cathy 24 USA Female
//16 Rose 30 UK Female

