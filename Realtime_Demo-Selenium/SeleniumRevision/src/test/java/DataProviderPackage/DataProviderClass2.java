package DataProviderPackage;

import org.testng.annotations.DataProvider;

public class DataProviderClass2 {
	
	@DataProvider(name = "Demo1")
	public Object[][] DataProviders1(){
		
		Object[][] data = new Object[1][1];
		data[0][0] = "Single##";
		return data;
		
	}
	
	@DataProvider(name = "Demo2")
	public Object[][] DataProviders2(){
		
		Object[][] data = new Object[1][2];
		
		data[0][0] = "Double1#";
		data[0][1] = "Double2#";
		return data;
		
	}
	
	@DataProvider(name = "Demo3")
	public Object[][] DataProviders3(){
		
		Object[][] data = new Object[1][3];
		data[0][0] = "Thrice1#";
		data[0][1] = "Thrice2#";
		data[0][2] = "Thrice3#";
		
		return data;
		
	}
	
	@DataProvider(name = "Demo4")
	public Object[][] DataProviders4(){
		
		return new Object[][] {{"fourlet1@","fourlet2","fourlet3","fourlet4"}};
		
	}
	
	@DataProvider(name = "Demo5")
	public Object[][] DataProviders5(){
		
		return new Object[][] {{"Fivelet1@","Fivelet2","Fivelet3","Fivelet4","Fivelet5"}};
		
	}

}
