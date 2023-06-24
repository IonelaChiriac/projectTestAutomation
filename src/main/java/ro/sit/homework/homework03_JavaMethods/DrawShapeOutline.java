package ro.sit.homework.homework03_JavaMethods;

public class DrawShapeOutline {
    public static void drawShapeOutline(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                //if the current position is an edge of the rectangle print a '*' symbol at the current position
                if (row == 0 || row == height - 1 || col == 0 || col == width - 1) {
                    System.out.print("*");
                } else {
                    //if the current position is not an edge, print a space
                    System.out.print(" ");
                }
            }
            //after each row, print a newline to start on the next row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //call drawShapeOutline method
        drawShapeOutline(10, 4);
    }
}

//output
//**********
//*        *
//*        *
//**********