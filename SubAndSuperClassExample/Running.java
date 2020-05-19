//package myProject;
package SubAndSuperClassExample;

public class Running extends Shoe {
	
	public final double weight;
	
	public Running(double weight, String brand, double size) {
		//this super goes first and creates the shoe
		super(brand, size);
		this.weight = weight;
	}
}
