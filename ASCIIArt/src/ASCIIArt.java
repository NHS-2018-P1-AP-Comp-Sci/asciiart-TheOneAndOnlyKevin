/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */
public class ASCIIArt {
	public static void main (String [] args) {
		hair () ;
		System.out.println("       |  O   O  |       /                   \\");
		System.out.println("       ||   d   ||      /Hi, I'm Mr. Rasmussen\\");
		System.out.println("       \\\\\\W^^^W///-----/and I think Kevin Jiang\\");
		System.out.println("        \\\\w M w//      \\should get a A++       /");
		System.out.println("         \\\\WwW//        \\                     /");
		System.out.println("          |   |          \\___________________/");
		longNeck ();
		System.out.println("     ____/|\\ /|\\____");
		System.out.println("    /    \\\\ _ //    \\");
		System.out.println("   /      \\/ \\/      \\");
		System.out.println("  /  /\\           /\\  \\");
		System.out.println("  \\  \\|           |/  /");
		System.out.println("___\\__|___________|__/________");
		beePBooP ();
		System.out.println("In my defense I'm not trying to be rude, the only reason Mr. Rasmussen has a long neck is because I needed to follow the rubric.");
	}
	public static void hair () {
		System.out.println("         mMMMMMm  <-hair is tied back");
		System.out.println("       mMMMMMMMMMm");
		System.out.println("       |MMMMMMMMM|        ___________________");
	}
	public static void neck () {
	System.out.println("          |   |");
}
	public static void longNeck() {
		neck ();
		neck ();
		neck ();
		neck ();
		neck ();
		neck ();
}
	public static void beepBoop () {
		System.out.println("Beep boop beep boop");
	}
	public static void beepBooP () {
		beepBoop ();
		beepBoop ();
		beepBoop ();
		beepBoop ();
		beepBoop ();
	}
}