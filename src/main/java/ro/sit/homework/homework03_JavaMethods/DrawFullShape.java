package ro.sit.homework.homework03_JavaMethods;

public class DrawFullShape {
    public static void drawFullShape(int width, int height) {
        //check if width and height are greater than zero.
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {

                //on the same line
                System.out.print("*");
            }
            //after each iteration print on new line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //call drawFullShape method
        drawFullShape(10, 4);

    }
}

//output
//**********
//**********
//**********
//**********