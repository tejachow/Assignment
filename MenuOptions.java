package simplilearn;
public class MenuOptions {

	public static void alloptions(String appName, String developerName) {
		
		String companyName = "                     SUPERLOCK SECURITY PVT LTD\n"
		+ "\n";
		
				
		String appFunction ="                                 this application is used for\n\n" 				
				+ "                             > get all file names in the \"main\" folder\n"
				+ "                                  > modify in files \"main\" folder.\n";					

		System.out.println(companyName + appFunction);
	}

	public static void displayMenu() {
		String menu = "                               \n\n choose any number from below \n\n"
				+                                  "1) get all files inside \"main\" folder\n" 
				+                                         "2) file modifications\n"
				+                                         "3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "                         \n\n select any option from below \n\n"
				+                                 "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
				+                         "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}

}
