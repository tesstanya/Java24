class IfGrade {
	public static void main(String[] args) {
		int grade = 90;
		
		//if conditions can be written in a single line if there's only one statement
		if (grade < 60) System.out.println("You got an F. You're a Failure.");
		else if (grade < 70) System.out.println("You got a D. You're Below Average.");
		else if (grade < 80) System.out.println("You got a C. You're Average.");
		else if (grade < 90) System.out.println("You got a B. Study Harder!");
		else System.out.println("You got an A. Excellent work!");
	}
}