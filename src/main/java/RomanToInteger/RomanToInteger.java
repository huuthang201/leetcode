package RomanToInteger;

import java.util.Scanner;

public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;
        if (s.length() == 0) {
            return result;
        } else {
            if (s.length() >= 2) {
                if (s.charAt(0) == 'I' && s.charAt(1) == 'V') {
                    result += 4;
                    s = s.substring(2);
                    return result + romanToInt(s);
                } else if (s.charAt(0) == 'I' && s.charAt(1) == 'X') {
                    result += 9;
                    s = s.substring(2);
                    return result + romanToInt(s);
                } else if (s.charAt(0) == 'X' && s.charAt(1) == 'L') {
                    result += 40;
                    s = s.substring(2);
                    return result + romanToInt(s);
                } else if (s.charAt(0) == 'X' && s.charAt(1) == 'C') {
                    result += 90;
                    s = s.substring(2);
                    return result + romanToInt(s);
                } else if (s.charAt(0) == 'C' && s.charAt(1) == 'D') {
                    result += 400;
                    s = s.substring(2);
                    return result + romanToInt(s);
                } else if (s.charAt(0) == 'C' && s.charAt(1) == 'M') {
                    result += 900;
                    s = s.substring(2);
                    return result + romanToInt(s);
                }
            }
            switch (s.charAt(0)) {
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }
        s = s.substring(1);
        return result + romanToInt(s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Roman number: ");
        try {
            String roman = scanner.nextLine();
            RomanToInteger romanToInteger = new RomanToInteger();
            System.out.println(romanToInteger.romanToInt(roman));
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
