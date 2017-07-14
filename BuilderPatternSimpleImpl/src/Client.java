import builder.*;

public class Client {
	public static void main(String[] args){
        Builder build = new BuildProduct();
        Director director = new Director(build);
        Product p = director.create();  
        System.out.println("最终产品为：");
        p.getProduct();
  }
}
