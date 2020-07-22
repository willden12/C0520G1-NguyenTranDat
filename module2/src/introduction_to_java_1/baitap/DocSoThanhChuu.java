

package introduction_to_java_1.baitap;

import java.util.Scanner;

public class DocSoThanhChuu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String count = "";
        if(number < 0 || number > 999){
            System.out.println("Invalid number!");
        } else if(number <=10) {
            switch (number){
                case 1: count += "one"; break;
                case 2: count += "two"; break;
                case 3: count += "three"; break;
                case 4: count += "four"; break;
                case 5: count += "five"; break;
                case 6: count += "six"; break;
                case 7: count += "seven"; break;
                case 8: count += "eight"; break;
                case 9: count += "nine"; break;
                case 10: count += "ten"; break;
            }
        } else if(number < 20){
            switch (number-10){
                case 1: count += "eleven"; break;
                case 2: count += "twelve"; break;
                case 3: count += "thirteen"; break;
                case 4: count += "fourteen"; break;
                case 5: count += "fifteen"; break;
                case 6: count += "sixteen"; break;
                case 7: count += "seventeen"; break;
                case 8: count += "eighteen"; break;
                case 9: count += "nineteen"; break;

            }
        } else if(number < 100){
            switch (number/10) {
                case 2: count += "twenty"; break;
                case 3: count += "thirty"; break;
                case 4: count += "forty"; break;
                case 5: count += "fifty"; break;
                case 6: count += "sixty"; break;
                case 7: count += "seventy"; break;
                case 8: count += "eighty"; break;
                case 9: count += "ninety"; break;

            }
            if(number%10 > 0) {
                count += " ";
                switch(number%10){
                    case 1: count += "one"; break;
                    case 2: count += "two"; break;
                    case 3: count += "three"; break;
                    case 4: count += "four"; break;
                    case 5: count += "five"; break;
                    case 6: count += "six"; break;
                    case 7: count += "seven"; break;
                    case 8: count += "eight"; break;
                    case 9: count += "nine"; break;

                }
            }
        } else { // number > 100
            switch(number/100){
                case 1: count += "one hundred"; break;
                case 2: count += "two hundred"; break;
                case 3: count += "three hundred"; break;
                case 4: count += "four hundred"; break;
                case 5: count += "five hundred"; break;
                case 6: count += "six hundred"; break;
                case 7: count += "seven hundred"; break;
                case 8: count += "eight hundred"; break;
                case 9: count += "nine hundred"; break;
            }
            int modulo = number%100;
            if(modulo > 0){
                count += " and";
                if(modulo/10 < 2){
                    switch(modulo){
                        case 1: count += " one"; break;
                        case 2: count += " two"; break;
                        case 3: count += " three"; break;
                        case 4: count += " four"; break;
                        case 5: count += " five"; break;
                        case 6: count += " six"; break;
                        case 7: count += " seven"; break;
                        case 8: count += " eight"; break;
                        case 9: count += " nine"; break;
                        case 10: count += " ten"; break;
                        case 11: count += " eleven"; break;
                        case 12: count += " twelve"; break;
                        case 13: count += " thirteen"; break;
                        case 14: count += " fourteen"; break;
                        case 15: count += " fifteen"; break;
                        case 16: count += " sixteen"; break;
                        case 17: count += " seventeen"; break;
                        case 18: count += " eighteen"; break;
                        case 19: count += " nineteen"; break;
                    }
                } else {
                    switch(modulo/10) {
                        case 2: count += " twenty"; break;
                        case 3: count += " thirty"; break;
                        case 4: count += " forty"; break;
                        case 5: count += " fifty"; break;
                        case 6: count += " sixty"; break;
                        case 7: count += " seventy"; break;
                        case 8: count += " eighty"; break;
                        case 9: count += " ninety"; break;
                    }
                    if(modulo%10 > 0) {
                        switch(modulo%10) {
                            case 1: count += " one"; break;
                            case 2: count += " two"; break;
                            case 3: count += " three"; break;
                            case 4: count += " four"; break;
                            case 5: count += " five"; break;
                            case 6: count += " six"; break;
                            case 7: count += " seven"; break;
                            case 8: count += " eight"; break;
                            case 9: count += " nine"; break;
                            default: count +=""; break;
                        }
                    }
                }
            }
        }

        System.out.println("Result: " + count + ".");
    }
}



