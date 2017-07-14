package builder;

public class BuildProduct implements Builder {
	Product p = new Product();
	
	@Override
	public void createProductPart1() {
		// TODO Auto-generated method stub
		p.createP1("组件1");
		System.out.println("构建组件一...");
	}

	@Override
	public void createProductPart2() {
		// TODO Auto-generated method stub
		p.createP2("组件2");
		System.out.println("构建组件二...");
	}

	@Override
	public void createProductPart3() {
		// TODO Auto-generated method stub
		p.createP3("组件3");
		System.out.println("构建组件三...");
	}
	
	public Product composite(){
		System.out.println("融合组件：");
		return this.p;
	}
}
