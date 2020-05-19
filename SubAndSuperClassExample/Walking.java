//package myProject;
package SubAndSuperClassExample;

public class Walking extends Shoe {
	
	public final boolean goreTex;
	
	public Walking(boolean goreTex, String brand, double size) {
		//this will get the values from the super class. Super has to be first over the walking
		//class params. Need the shoe first to do walking
		
		super(brand, size);
		this.goreTex = goreTex;
	}
}
