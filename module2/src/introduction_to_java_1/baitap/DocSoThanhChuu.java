

package introduction_to_java_1.baitap;

import java.util.Scanner;

public class DocSoThanhChuu {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = myScanner.nextInt();
        String count = "";
        if (number >= 0 && number < 1000) {
            if (number <= 10) {
                switch (number) {
                    case 1:
                        count = count + "one";
                        break;
                    case 2:
                        count = count + "two";
                        break;
                    case 3:
                        count = count + "three";
                        break;
                    case 4:
                        count = count + "four";
                        break;
                    case 5:
                        count = count + "five";
                        break;
                    case 6:
                        count = count + "six";
                        break;
                    case 7:
                        count = count + "seven";
                        break;
                    case 8:
                        count = count + "eight";
                        break;
                    case 9:
                        count = count + "nine";
                        break;
                    case 10:
                        count = count + "ten";
                        break;
                }
            } else if (number < 20) {
                switch (number - 10) {
                    case 1:
                        count = count + "eleven";
                        break;
                    case 2:
                        count = count + "twelve";
                        break;
                    case 3:
                        count = count + "thirteen";
                        break;
                    case 4:
                        count = count + "fourteen";
                        break;
                    case 5:
                        count = count + "fifteen";
                        break;
                    case 6:
                        count = count + "sixteen";
                        break;
                    case 7:
                        count = count + "seventeen";
                        break;
                    case 8:
                        count = count + "eighteen";
                        break;
                    case 9:
                        count = count + "nineteen";
                        break;
                }
            } else if (number < 100) {
                switch (number / 10) {
                    case 2:
                        count = count + "twenty";
                        break;
                    case 3:
                        count = count + "thirty";
                        break;
                    case 4:
                        count = count + "forty";
                        break;
                    case 5:
                        count = count + "fifty";
                        break;
                    case 6:
                        count = count + "sixty";
                        break;
                    case 7:
                        count = count + "seventy";
                        break;
                    case 8:
                        count = count + "eighty";
                        break;
                    case 9:
                        count = count + "ninety";
                        break;

                }

                if (number % 10 > 0) {
                    count = count + " ";
                    switch (number % 10) {
                        case 1:
                            count = count + "one";
                            break;
                        case 2:
                            count = count + "two";
                            break;
                        case 3:
                            count = count + "three";
                            break;
                        case 4:
                            count = count + "four";
                            break;
                        case 5:
                            count = count + "five";
                            break;
                        case 6:
                            count = count + "six";
                            break;
                        case 7:
                            count = count + "seven";
                            break;
                        case 8:
                            count = count + "eight";
                            break;
                        case 9:
                            count = count + "nine";
                            break;
                    }
                }
            } else {
                switch (number / 100) {
                    case 1:
                        count = count + " one hundred ";
                        break;
                    case 2:
                        count = count + " two hundred ";
                        break;
                    case 3:
                        count = count + " three hundred ";
                        break;
                    case 4:
                        count = count + " four hundred ";
                        break;
                    case 5:
                        count = count + " five hundred ";
                        break;
                    case 6:
                        count = count + " six hundred ";
                        break;
                    case 7:
                        count = count + " seven hundred ";
                        break;
                    case 8:
                        count = count + " eight hundred ";
                        break;
                    case 9:
                        count = count + " nine hundred ";
                        break;
                }

                int number12 = number % 100;
                count = count + " and ";
                if (number12 > 0) {
                    switch (number12 / 10) {
                        case 1:
                            count = count + " eleven ";
                            break;
                        case 2:
                            count = count + "twenty";
                            break;
                        case 3:
                            count = count + "thirty";
                            break;
                        case 4:
                            count = count + "forty";
                            break;
                        case 5:
                            count = count + "fifty";
                            break;
                        case 6:
                            count = count + "sixty";
                            break;
                        case 7:
                            count = count + "seventy";
                            break;
                        case 8:
                            count = count + "eighty";
                            break;
                        case 9:
                            count = count + "ninety";
                            break;
                    }

                    if (number12 % 10 > 0) {
                        count = count + " ";
                        switch (number12 % 10) {
                            case 1:
                                count = count + "one";
                                break;
                            case 2:
                                count = count + "two";
                                break;
                            case 3:
                                count = count + "three";
                                break;
                            case 4:
                                count = count + "four";
                                break;
                            case 5:
                                count = count + "five";
                                break;
                            case 6:
                                count = count + "six";
                                break;
                            case 7:
                                count = count + "seven";
                                break;
                            case 8:
                                count = count + "eight";
                                break;
                            case 9:
                                count = count + "nine";
                                break;
                        }
                    }
                }
            }
        } else {
            System.out.println("Sô tào lao");
        }

        System.out.println("Dịch sang chữ : " + count + ".");
    }
}
