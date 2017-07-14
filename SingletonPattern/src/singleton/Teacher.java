package singleton;

public class Teacher {
	private static final Teacher teacher = new Teacher();
	
	private Teacher(){
		// ...
	}
	
	public static Teacher getInstance(){
		return teacher;
	}
	
	public static void say(){
		System.out.println("你好，这是设计模式老师Mr Shang");
	}
}
