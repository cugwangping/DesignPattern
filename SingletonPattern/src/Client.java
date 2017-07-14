import singleton.Teacher;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 5;
		for(int i=0; i < len; i++){
			Teacher teacher = Teacher.getInstance();
			teacher.say();
		}
	}

}
