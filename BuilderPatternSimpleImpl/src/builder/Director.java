package builder;

public class Director {
	private Builder build;
	
	public Director(Builder build){
		this.build = build;
	}
	
	public Product create(){
		build.createProductPart1();
		build.createProductPart2();
		build.createProductPart3();
		return build.composite();
	}
}
