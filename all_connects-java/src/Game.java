import java.util.Arrays;
import java.util.Scanner;

public class Game {
	public Game() {
		
	}
	public static void main(String[] args) {
		
	}
}

class Team {
	// Variable instantiation
	// Should not be used outside of this class
	private String name;
	private int score;
	
	private Team(String teamName) {
		name = teamName;
		score = 0;
	}
	
	// Setters and getters
	private void setName(String teamName) {
		name = teamName;
	}
	
	private void setScore(int newScore) {
		score = newScore;
	}
	
	private String getName() {
		return name;
	}
	
	private int getScore() {
		return score;
	}
	
	// Methods
	private void addScore(int points) {
		score += points;
	}
	
	private void addOne() {
		score += 1;
	}
	
	public static void main(String[] args) {
		assert true;
	}
}

// Making a subclass of Game to create the structure of a question in the first round
class R1Question {
	// Variable instantiation
	private int state;
	private String hint1;
	private String hint2;
	private String hint3;
	private String hint4;
	private String[] hints;
	private String answer;
	
	// Constructor
	private R1Question(String h1, String h2, String h3, String h4, String ans) {
		state = 1;
		hint1 = h1;
		hint2 = h2;
		hint3 = h3;
		hint4 = h4;
		hints = new String[] {h1, h2, h3, h4};
		answer = ans;
	}
	
	// Getters and setters
	private void setState(int newState) {
		state = newState;
	}
	
	private void setHint1(String h1) {
		hint1 = h1;
	}
	
	private void setHint2(String h2) {
		hint2 = h2;
	}
	
	private void setHint3(String h3) {
		hint3 = h3;
	}
	
	private void setHint4(String h4) {
		hint4 = h4;
	}
	
	private void setAnswer(String ans) {
		answer = ans;
	}
	
	private int getState() {
		return state;
	}
	
	private String getHint1() {
		return hint1;
	}
	
	private String getHint2() {
		return hint2;
	}
	
	private String getHint3() {
		return hint3;
	}
	
	private String getHint4() {
		return hint4;
	}
	
	private String getAnswer() {
		return answer;
	}
	
	// Methods
	private void contin() {
		// contin() short for continue(), since continue is a keyword
		state += 1;
	}
	
	private void start() {
		while(true) {
			System.out.print(Arrays.copyOfRange(hints, 0, state));
			Scanner scanner = new Scanner(System.in);
			String thing = scanner.nextLine();
			scanner.close();
			if(thing == "") {
				contin();
			} else if (thing == " ") {
				break;
			}
		System.out.print("DONE");
		}
	}
}
