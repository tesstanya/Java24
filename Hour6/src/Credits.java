class Credits {
	public static void main(String[] args) {
		// set up film information
		String title = "The Piano";
		int year = 1993;
		String director = "Jane Campion";
		String role1 = "Ada";
		String actor1 = "Holly Hunter";
		String role2 = "Baines";
		String actor2 = "Harvey Keital";
		String role3 = "Stewart";
		String actor3 = "Sam Neill";
		String role4 = "Flora";
		String actor4 = "Anna Paquin";
		/* display information in Upper Case without creating new String 
		variables to hold the value */
		System.out.println(title + " (" + year + ")\n" + 
				"A " + director.toUpperCase() + " film.\n\n" + 
				role1.toUpperCase() + "\t\t" + actor1.toUpperCase() + "\n" + 
				role2.toUpperCase() + "\t\t" + actor2.toUpperCase() + "\n" + 
				role3.toUpperCase() + "\t\t" + actor3.toUpperCase() + "\n" + 
				role4.toUpperCase() + "\t\t" + actor4.toUpperCase());
	}
}