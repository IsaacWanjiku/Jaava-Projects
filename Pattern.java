package hello;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 7; // Height of the letters
        int width = 5; // Width of the letters

        // Print letters 'O' and 'P' side by side
        for (int i = 0; i < height; i++) {
            // Letter 'O'
            for (int j = 0; j < width; j++) {
                if ((i == 0 || i == height - 1) && (j != 0 && j != width - 1)) {
                    System.out.print("*");
                } else if ((j == 0 || j == width - 1) && (i != 0 && i != height - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Space between letters
            System.out.print("   ");

            // Letter 'P'
            for (int j = 0; j < width; j++) {
                if (j == 0 || (i == 0 && j < width - 1) || (i == height / 2 && j < width - 1) || (i > 0 && i < height / 2 && j == width - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line
            System.out.println();
        }
    }

}
