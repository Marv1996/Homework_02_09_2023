public class Main {
    public static void main(String[] args) {

        for (int i = 3; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        ***
//        **
//        *

        System.out.println();

        int[][] array = {{4, 5, 9, 7, 8}, {7, 8, 3, 6, 2}, {3, 1, 8, 7, 4}, {5, 8, 9, 2, 5}, {3, 5, 4, 9, 7}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
//        4 5 9 7 8
//        7 8 3 6 2
//        3 1 8 7 4
//        5 8 9 2 5
//        3 5 4 9 7

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//        4
//          8
//            8
//              2
//                7

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == 4) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//                8
//              6
//            8
//          8
//        3

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i >= j) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//        4
//        7 8
//        3 1 8
//        5 8 9 2
//        3 5 4 9 7

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= j) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//        4 5 9 7 8
//          8 3 6 2
//            8 7 4
//              2 5
//                7

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i >= j && i + j > 3) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//            8
//          8 9 2
//        3 5 4 9 7

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= j && i + j < 5) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//        4 5 9 7 8
//          8 3 6
//            8

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i >= j && i + j < 5) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//        4
//        7 8
//        3 1 8
//        5 8
//        3

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= j && i + j > 3) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//            8
//          6 2
//        8 7 4
//          2 5
//            7

        System.out.println();

        // --------------------------------------------------------------

        int[] arrayFirst = {4, -5, 8, 9, -7, 2, 3, 1, -9, 6};

        // 211
        int count = 0;
        double sum = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] > 0) {
                sum = sum + arrayFirst[i];
                count++;
            }
        }
        System.out.println(sum / count);

        // 212
        int countMultiply = 0;
        double sumMultiply = 1;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] > 0) {
                sumMultiply = sumMultiply * arrayFirst[i];
                countMultiply++;
            }
        }
        System.out.println(sumMultiply / countMultiply);

        // 213
        int countMultiplyMinus = 0;
        double sumMultiplyMinus = 1;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] < 0) {
                sumMultiplyMinus = sumMultiplyMinus * arrayFirst[i];
                countMultiplyMinus++;
            }
        }
        System.out.println(sumMultiplyMinus / countMultiplyMinus);

        // 214
        int countMultiplyPlus = 0;
        double sumMultiplyPlus = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] < 0) {
                sumMultiplyPlus = sumMultiplyPlus + arrayFirst[i];
                countMultiplyPlus++;
            }
        }
        System.out.println(sumMultiplyPlus / countMultiplyPlus);

        // 215
        int sumEven = 0;

        for (int i = 0; i < arrayFirst.length; i = i + 2) {
            sumEven = sumEven + arrayFirst[i];
        }
        System.out.println(sumEven);

        // 216
        int sumMultiplyEven = 1;

        for (int i = 0; i < arrayFirst.length; i = i + 2) {
            sumMultiplyEven = sumMultiplyEven * arrayFirst[i];
        }
        System.out.println(sumMultiplyEven);

        // 219
        int k = 3;
        int countMultipleK = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % k == 0) {
                countMultipleK++;
            }
        }
        System.out.println(countMultipleK);

        // 220
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] > 0) {
                countEven++;
            } else if (arrayFirst[i] < 0) {
                countOdd++;
            }
        }
        System.out.println("Even: " + countEven + " " + "Odd: " + countOdd);

        // 227
        int x = 2;
        double sumX = 0;
        int countX = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (i % x == 0) {
                sumX = sumX + arrayFirst[i];
                countX++;
            }
        }
        System.out.println(sumX / countX);

        // 228
        int y = 3;
        double sumY = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (i % y == 0) {
                sumY = sumY + arrayFirst[i];
            }
        }
        System.out.println(sumY);

        // 229
        int multiple = 1;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] - i > 0) {
                multiple = multiple * arrayFirst[i];
            }
        }
        System.out.println(multiple);

        // 232
        int countEvenSecond = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 == 0) {
                countEvenSecond++;
            }
        }
        System.out.println(countEvenSecond);

        // 233
        int sumEvenSecond = 0;
        int multipleSecond = 1;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 == 0) {
                sumEvenSecond = sumEvenSecond + arrayFirst[i];
                multipleSecond = multipleSecond * arrayFirst[i];
            }
        }
        System.out.println("Sum: " + sumEvenSecond + " " + "Multiple: " + multipleSecond);

        // 234
        double sumOdd = 0;
        int countOddSecond = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 != 0) {
                sumOdd = sumOdd + arrayFirst[i];
                countOddSecond++;
            }
        }
        System.out.println(sumOdd / countOddSecond);

        // 235
        double sumOddMultiple = 1;
        int countOddMultiple = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 != 0) {
                sumOddMultiple = sumOddMultiple * arrayFirst[i];
                countOddMultiple++;
            }
        }
        System.out.println(sumOddMultiple / countOddMultiple);

        // 236
        double multipleOddleSecond = 1;
        int countOddMultipleSecond = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 != 0) {
                multipleOddleSecond = multipleOddleSecond * arrayFirst[i];
                countOddMultipleSecond++;
            }
        }
        System.out.println("Count: " + countOddMultipleSecond + " " + "Multiple: " + multipleOddleSecond);

        // 237
        int[] arrayZero = {4, 5, 9, 0, 3, 6, 0, 7, 1, 0};

        int countZero = 0;

        for (int i = 0; i < arrayZero.length; i++) {
            if (arrayZero[i] == 0) {
                countZero++;
            }
        }
        System.out.println(countZero);

        // --------------------------------------------------------------

        // Task 3
        int[] oddNumbersArray = new int[41];

        int firstValue = -21;

        for (int i = 0; i < oddNumbersArray.length; i++) {
            oddNumbersArray[i] = firstValue;
            firstValue = firstValue + 1;
            if (firstValue % 2 != 0) {
                System.out.print(firstValue + ", ");
            }
        }

        System.out.println();

        // Task 4
        int[] numbersDividedFiveArray = {45, 12, 57, 21, 36, 65, 31, 25, 47, 15};

        for (int i = 0; i < numbersDividedFiveArray.length; i++) {
            if (numbersDividedFiveArray[i] % 5 == 0) {
                System.out.print(numbersDividedFiveArray[i] + ", ");
            }
        }

        System.out.println();

        // Task 5
        double[] doubleNumbersArray = {12.2, 24.25, 32.65, 44.9, 20.15, 150.65, 369.23, 485.23, 460.87, 563.12};

        double startNumber = 24.12;
        double endNumber = 467.23;

        for (int i = 0; i < doubleNumbersArray.length; i++) {
            if (doubleNumbersArray[i] > startNumber && doubleNumbersArray[i] < endNumber) {
                System.out.print(doubleNumbersArray[i] + ", ");
            }
        }

        System.out.println();

        // Task 6
        for (int i = 0; i < numbersDividedFiveArray.length; i++) {
            if (numbersDividedFiveArray[i] % 2 == 0) {
                System.out.print(numbersDividedFiveArray[i] + ", ");
            }
        }

        System.out.println();

        // Task 7
        int multipleNumber = 5;

        for (int i = 1; i < 11; i++) {
            System.out.println(multipleNumber + " x " + i + " = " + multipleNumber * i);
        }
    }
}