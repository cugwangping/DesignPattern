package builder;

public class Product {
	private String p1;
	private String p2;
	private String p3;
	
	public void createP1(String p1){
		this.p1 = p1;
	}
	
	public void createP2(String p2){
		this.p2 = p2;
	}
	
	public void createP3(String p3){
		this.p3 = p3;
	}
	
	public void getProduct(){
		System.out.println(p1+p2+p3+"混合体");
	}
}
