package ro.sit.homework.homework03_JavaMethods;

public class DrawShapeCorners {
    public static void drawShapeCorners(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                //if the current position is a corner print a '*' symbol
                if ((row == 0 || row == height - 1) && (col == 0 || col == width - 1)) {
                    System.out.print("*");
                } else {
                    //if the current position is not a corner, print a space
                    System.out.print(" ");
                }
            }
            //after each row, print a newline to start on the next row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //call drawShapeCorners method
        drawShapeCorners(10, 4);
    }
}

//output
//*        *
//
//
//*        *