package com.moayad.tools;

//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CBR {

	public static void main(String[] args) {
		
		int userBloodPressure = 75;
		int userAlbumin = 1;
		int userSugar = 1;
		String userRedBloodCell = "normal";
		String userAnemia = "no";
		
		/*Scanner scanner = new Scanner(System.in);
		userBloodPressure = scanner.nextInt();
		userAlbumin = scanner.nextInt();
		userSugar = scanner.nextInt();
		userRedBloodCell = scanner.nextLine();
		userAnemia = scanner.nextLine();*/
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_scheme","root","root");
			Statement stmt = con.createStatement();
			
			// Check if the problem is exist 'RETRIEVE'
			ResultSet rs = stmt.executeQuery("select * from cbr where "
					+ "Blood_Pressure = "+userBloodPressure+
					" and Albumin = "+userAlbumin+
					" and Sugar = "+userSugar+
					" and Red_Blood_Cell = '"+userRedBloodCell+
					"' and Anaemia = '"+userAnemia+"'");
			if(rs.next())
				System.out.println("Chronic Kidney Disease:" +rs.getString(7)); // REUSE
			else
			{
				// REVISE
				rs = stmt.executeQuery("select min(Blood_Pressure) from cbr");
				rs.next();
				int minBloodPressure = rs.getInt(1);
				rs = stmt.executeQuery("select max(Blood_Pressure) from cbr");
				rs.next();
				int maxBloodPressure = rs.getInt(1);
				int rangeBloodPressure = maxBloodPressure - minBloodPressure;
				
				rs = stmt.executeQuery("select min(Albumin) from cbr");
				rs.next();
				int minAlbumin = rs.getInt(1);
				rs = stmt.executeQuery("select max(Albumin) from cbr");
				rs.next();
				int maxAlbumin = rs.getInt(1);
				int rangeAlbumin = maxAlbumin - minAlbumin;
				
				rs = stmt.executeQuery("select min(Sugar) from cbr");
				rs.next();
				int minSugar = rs.getInt(1);
				rs = stmt.executeQuery("select max(Sugar) from cbr");
				rs.next();
				int maxSugar = rs.getInt(1);
				int rangeSugar = maxSugar - minSugar;
				
				rs = stmt.executeQuery("select * from cbr");
				double gsPatientHighest = 0;
				String result = null;
				while(rs.next())
				{
					double lsBloodPressure = LocalSimilarityContinuous(userBloodPressure, rs.getInt(2), rangeBloodPressure);
					System.out.println(lsBloodPressure);
					double lsAlbumin = LocalSimilarityContinuous(userAlbumin, rs.getInt(3), rangeAlbumin);
					System.out.println(lsAlbumin);
					double lsSugar = LocalSimilarityContinuous(userSugar, rs.getInt(4), rangeSugar);
					System.out.println(lsSugar);
					
					int lsRedBloodCell = LocalSimilarityDiscrete(userRedBloodCell, rs.getString(5));
					System.out.println(lsRedBloodCell);
					int lsAnemia = LocalSimilarityDiscrete(userAnemia, rs.getString(6));
					System.out.println(lsAnemia);
					
					double gsPatient = GlobalSimilarity(lsBloodPressure, lsAlbumin, lsSugar, lsRedBloodCell, lsAnemia);
					System.out.println("______________________");
					System.out.println(gsPatient + "\n");
					
					if (gsPatient > gsPatientHighest)
					{
						gsPatientHighest = gsPatient;
			            result = rs.getString(7);
					}
					
				}
				
				// RETAIN
				stmt.executeUpdate("insert into cbr values ("+null+", "+userBloodPressure+", "+userAlbumin+", "+userSugar+", '"+userRedBloodCell+"', '"+userAnemia+"', '"+result+"');");
				
				System.out.println("Chronic Kidney Disease:" + result);
				
			}
			con.close();
		} 
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	public static double LocalSimilarityContinuous(double userBloodPressure, double bloodPressure, double range)
	{
		double sum = 1 - Math.abs((userBloodPressure - bloodPressure)) / range;
		return sum;
	}
	public static int LocalSimilarityDiscrete(String a, String b)
	{
		if(a.equals(b))
			return 1;
		else
			return 0;
	}
	public static double GlobalSimilarity(double bloodPressure, double Albumin, double Sugar, double redBloodCell, double anemia)
	{
		double sum = 0.2 * ((1 * bloodPressure) + (1 * Albumin) + (1 * Sugar) + (1 * redBloodCell) + (1 * anemia));
		return sum;
	}

}
