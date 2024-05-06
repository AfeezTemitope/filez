import java.util.*;

public class SevenSegment {	
	public static void main(String... args) {
          Scanner scanner = new Scanner(System.in);
		
		SevenSegment sevenSegement = new SevenSegment ();

		System.out.print("Enter binary of length 8 : ");
		String number = scanner.nextInt();
		sevenSegment.splittingIntoArray(number);
}
	private String[] segments = new String[8];

    public  void splittingIntoArray(String binary) {
        if (binary.length() != 8) {
            throw new IllegalArgumentException("Binary input should be 8 characters long");
        }
        for (int index = 0; index < segments.length; index++) {
            if (binary.charAt(index) != '0'  && binary.charAt(index) != '1') throw new IllegalArgumentException("invalid binary");
            segments[index] = "" + binary.charAt(index);


        }
        displaySeven();
    }


  public void displaySeven() {
            display1(segments[0]);
            display1(segments[5], segments[1]);
            display1(segments[6]);
            display1(segments[4], segments[2]);
            display1(segments[3]);
        } 
    








	}
}

