package DataProviderPackage;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name = "Demo1")
	public Object[][] DataProviders1(){
		
		return new Object[][] {{"Single"}};
		
	}
	
	@DataProvider(name = "Demo2")
	public Object[][] DataProviders2(){
		
		return new Object[][] {{"Double1@","Double2"}};
		
	}
	
	@DataProvider(name = "Demo3")
	public Object[][] DataProviders3(){
		
		return new Object[][] {{"Thrice1@","Thrice2","Thrice3"}};
		
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
