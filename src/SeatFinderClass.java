import java.util.Scanner;

public class SeatFinderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initiate Scanner
		Scanner myScanner = new Scanner(System.in);
		
		//Initiate variable
		int rowNum = 0;
		int colNum = 0;
		boolean isFound = false;
		
		String[][] names = {
				{"KEVIN", "ALVIN", "JEZRA", "MANNY"},
				{"M", "JOLO", "RAF", "GERREL"},
				{"BRIAN", "ALMIE", "AYEN", "SWIL"},
				{"JC", "EMMAN", "SHEILA", "JAY"}
		};
		
		System.out.print("Enter name: ");
		String targetName = myScanner.next();
		
		for(String[] rowNames: names){
			
			rowNum = rowNum + 1;
			colNum = 0;
			for(String foundName: rowNames){
				colNum = colNum + 1;
				if (foundName.equalsIgnoreCase(targetName)){
					isFound = true;
					for (int x = 0; x < 4; x++) {
						System.out.println("\n-------------------------");
						for (int y = 0; y < 4; y++) {
							//System.out.print("| |");
							System.out.print("|");
							if ((x == (rowNum-1)) && (y == (colNum-1))) {
								System.out.print("  *  ");
							}
							else {
								System.out.print("     ");
							}
						}
						System.out.print("|");
					}
					System.out.print("\n-------------------------");
					//System.out.println(foundName);
					System.out.println("\nThe person is seated on row " + rowNum + ", column " + colNum);
					break;
				}
				
			}
			
			
			
		}
		
		if (!isFound) {
			System.out.println("Name is not found in the seatplan.");
		}
		
		
		
		
		
		
		//System.out.print(x  y);
		myScanner.close();
	}

}
