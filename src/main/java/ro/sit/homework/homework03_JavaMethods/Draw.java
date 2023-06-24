package ro.sit.homework.homework03_JavaMethods;

public class Draw {

        public static void main(String[] args) {
            if (args.length == 1) {
                int side = Integer.parseInt(args[0]);
                drawFullShape(side);
                drawShapeOutline(side, side);
                drawShapeCorners(side, side);
            } else if (args.length == 2) {
                int width = Integer.parseInt(args[0]);
                int height = Integer.parseInt(args[1]);
                drawFullShape(width, height);
                drawShapeOutline(width, height);
                drawShapeCorners(width, height);
            } else {
                System.out.println("Please add 1 or 2 arguments only");
            }
            System.out.println();
            System.out.println("--------");
            System.out.println();
        }

        private static void drawShapeOutline(int width, int height) {
            printShapeName("Empty rectangle:");
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    if (i == 0 || i == (width - 1) || j == 0 || j == (height - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        private static void drawFullShape(int squareSide) {
            printShapeName("Square:");
            drawFullShape(squareSide, squareSide);
        }

        private static void drawFullShape(int width, int height) {
            printShapeName("Rectangle:");
            for (int i = 0; i < width; i++) {
                printEntireLine(height);
                System.out.println();
            }
        }

        private static void drawShapeCorners(int width, int height) {
            printShapeName("Corners of a rectangle:");
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    if (i == 0 || i == width - 1) {
                        if (j == 0 || j == height - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        private static void printShapeName(String shapeName) {
            System.out.println();
            System.out.println(shapeName);
            System.out.println();
        }

        private static void printEntireLine(int numberColumns) {
            for (int j = 0; j < numberColumns; j++) {
                System.out.print("*");
            }
        }

        private static void printEntireLine(int numberColumns, String message) {
            for (int j = 0; j < numberColumns; j++) {
                System.out.print("*");
            }
            System.out.println(message);
        }

        private static void printEntireLine(String numberColumns, String message) {
            for (int j = 0; j < Integer.parseInt(numberColumns); j++) {
                System.out.print("*");
            }
            System.out.println(message);
        }

        private static void printEntireLine() {
            System.out.print("**********");
        }
    }
//arguments 4 and 10

//output
//Rectangle:
//
//**********
//**********
//**********
//**********
//
//Empty rectangle:
//
//**********
//*        *
//*        *
//**********
//
//Corners of a rectangle:
//
//*        *
//
//
//*        *
//
//--------
//
//
//Process finished with exit code 0