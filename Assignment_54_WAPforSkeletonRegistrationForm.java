package Assignments_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_54_WAPforSkeletonRegistrationForm {
	
	
	@Test(dataProvider = "register" )	
	public void Registration(String fname, String lname, String DOB, String Gender, String email)
	{
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(DOB);
		System.out.println(Gender);
		System.out.println(email);
		
	}

	@DataProvider (name = "register")
	public Object[][]  method1()
	{
		Object data1[][] = new Object[10][5];
		data1[0][0] = "Ram 1";
		data1[0][1] = "Sharma 1";
		data1[0][2] = "01/01/2000";
		data1[0][3] = "M";
		data1[0][4] = "ram@gmail.com";
		
		
		data1[1][0] = "Ram 2";
		data1[1][1] = "Sharma 2";
		data1[1][2] = "02/01/2000";
		data1[1][3] = "M";
		data1[1][4] = "ram1@gmail.com";
		data1[0][0] = "Ram 1";
		data1[0][1] = "Sharma 1";
		data1[0][2] = "01/01/2000";
		data1[0][3] = "M";
		data1[0][4] = "ram@gmail.com";
		
		
		data1[1][0] = "Ram 2";
		data1[1][1] = "Sharma 2";
		data1[1][2] = "02/01/2000";
		data1[1][3] = "M";
		data1[1][4] = "ram1@gmail.com";
		
		data1[2][0] = "Ram 3";
		data1[2][1] = "Sharma 3";
		data1[2][2] = "03/01/2000";
		data1[2][3] = "f";
		data1[2][4] = "ram3@gmail.com";
		
		
		data1[3][0] = "Ram 4";
		data1[3][1] = "Sharma 4";
		data1[3][2] = "04/01/2000";
		data1[3][3] = "M";
		data1[3][4] = "ram4@gmail.com";
		data1[2][0] = "Ram 3";
		data1[2][1] = "Sharma 3";
		data1[2][2] = "03/01/2000";
		data1[2][3] = "f";
		data1[2][4] = "ram3@gmail.com";
		
		
		data1[3][0] = "Ram 4";
		data1[3][1] = "Sharma 4";
		data1[3][2] = "04/01/2000";
		data1[3][3] = "M";
		data1[3][4] = "ram4@gmail.com";
		
		
		data1[4][0] = "Ram 5";
		data1[4][1] = "Sharma 5";
		data1[4][2] = "05/01/2000";
		data1[4][3] = "F";
		data1[4][4] = "ram5@gmail.com";
		
		
		data1[5][0] = "Ram 6";
		data1[5][1] = "Sharma 6";
		data1[5][2] = "06/01/2000";
		data1[5][3] = "M";
		data1[5][4] = "ram6@gmail.com";
		
		data1[6][0] = "Ram 7";
		data1[6][1] = "Sharma 7";
		data1[6][2] = "07/01/2000";
		data1[6][3] = "f";
		data1[6][4] = "ram7@gmail.com";
		
		
		data1[7][0] = "Ram 8";
		data1[7][1] = "Sharma 8";
		data1[7][2] = "08/01/2000";
		data1[7][3] = "M";
		data1[7][4] = "ram8@gmail.com";
		
		
		data1[8][0] = "Ram 9";
		data1[8][1] = "Sharma 9";
		data1[8][2] = "09/01/2000";
		data1[8][3] = "M";
		data1[8][4] = "ram9@gmail.com";
		
		data1[9][0] = "Ram 10";
		data1[9][1] = "Sharma 10";
		data1[9][2] = "10/01/2000";
		data1[9][3] = "M";
		data1[9][4] = "ram10@gmail.com";
		
		
		
		return data1;
		
	}

}
