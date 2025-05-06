package multiplejava;

import java.util.ArrayList;
import java.util.List;

public class Method_Test1 {
    // 숫자를 넣을 변수
	public int number_1 = 0;
	// String 값을 넣을 변수
	public String str = "";
	// String 값을 넣을 List
	public List<String> strList = new ArrayList<>();
	
	//public으로 해야 호출이 가능함
	public void methodTest() {// 각 각의 변수에 값을 담기 위해 method 생성

		// int
		number_1 = 10;
		// str
		str = "str_TEST";
		// List
		strList.add("list1");
		strList.add("list2");
		strList.add("list3");
    
    }
}
