package SubAndSuperClassExample;
// need the package name to be the same as the folder its in. For visual studio code.
//package myProject;

public class Main {

	public static void main(String[] args) {
		//Shoe s = new Shoe("Addidas", 10);
		//Walking w = new Walking(true, "Addidas", 10);
		Running r = new Running(190, "Addidas", 10);
		System.out.println(r.weight);

	}

}
