package multiplejava;

public class multiplejavatest {
    public static void main(String[] args) {
		// 해당 클래스의 Method를 실행하기 위해서 객체를 만들어 준다.
		
		Method_Test1 aa = new Method_Test1();
		
		// 미리 한 번 실행을 해서 list의 값이 찍히게 되고, 주석이나 Method를 실행한 것이 아니기 때문에 빈 리스의 값이 출력된다.
		System.out.println("aa.strList.toString()  : " + aa.strList.toString());
		System.out.println("aa.number_1 : " + aa.number_1);
		System.out.println("aa.str : " + aa.str);
		
		System.out.println("---------------------------------------------------------------");
		// 호출을 해야 해당 Method에서 값을 넣은게 출력이 된다.
		aa.methodTest();
		
		System.out.println("aa.strList.toString()  : " + aa.strList.toString());
		System.out.println("aa.number_1 : " + aa.number_1);
		System.out.println("aa.str : " + aa.str);
		
	}
    
}
