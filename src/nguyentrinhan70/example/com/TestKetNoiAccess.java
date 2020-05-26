package nguyentrinhan70.example.com;

import java.sql.Connection;
import java.sql.DriverManager;

//import java.sql.Connection;
//import java.sql.DriverManager;

public class TestKetNoiAccess {   
	//--------------------------
	public static void main(String[]args){


		try{ String dataPath = "D://Java_2016\\Bai26\\csdlmau1.accdb"; 
		String strConnection ="jdbc:ucanaccess://" + dataPath; 
		Connection conn =	DriverManager.getConnection(strConnection); 
		if(conn!=null)
					System.out.println("Kết nối thành công zui quá"); 
		else
					System.out.println("kết nối thất bại"); 
		}catch(Exception ex){
							ex.printStackTrace(); }
	}
}
