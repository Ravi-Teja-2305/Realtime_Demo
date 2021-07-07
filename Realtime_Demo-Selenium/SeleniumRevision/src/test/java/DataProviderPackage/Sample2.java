package DataProviderPackage;

import org.testng.annotations.Test;

public class Sample2 extends DataProviderClass2{
	
	@Test(dataProvider = "Demo1")
	public void Test(String name1){
		
		System.out.println(name1);
		
	}
	
	@Test(dataProvider = "Demo2")
public void Test(String name1, String name2){
		
		System.out.println(name1 + name2);
		
	}

	@Test(dataProvider = "Demo3")
public void Test(String name1, String name2, String name3){
	
	System.out.println(name1 + name2 + name3);
	
}

	@Test(dataProvider = "Demo4")
public void Test(String name1, String name2,  String name3,  String name4){
	
	System.out.println(name1 + name2 + name3 + name4);
	
}

	@Test(dataProvider = "Demo5")
public void Test(String name1, String name2,  String name3,  String name4,  String name5){
	
	System.out.println(name1 + name2 + name3 + name4 + name5);
	
}

}
