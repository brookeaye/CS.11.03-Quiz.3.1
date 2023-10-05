public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int num){
        if (num >=90){
            return 'A';
        }
        if (num >= 80){
            return 'B';
        }
        if (num >= 70){
            return 'C';
        }
        if (num >=60){
            return 'D';
        }
        if (num >=50){
            return 'E';
        }
        return 'F';
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num){
        if (num%3==0 && num%5==0){
            return "fizzbuzz";
        }

        if (num%3 ==0){
            return "fizz";
        }
        if (num%5 == 0){
            return "buzz";
        }
        return "unlucky";
    }
    // Question 3 - frontBack
    public static String frontBack(String text){
        if (text.length()<2){
            return text;
        }
        String firstTwo = text.substring(0,2);
        return firstTwo + text + firstTwo;
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int numOne, int numTwo, int numThree){
        if (numOne + numTwo == numThree){
            return true;
        }
        if (numTwo + numThree == numOne){
            return true;
        }
        if (numThree + numOne == numTwo){
            return true;
        }
        return false;
    }

    // Question 5 - endUp
    public static String endUp(String text){
        if (text.length()<3){
            return text.toUpperCase();
        }
        String lastThree = text.substring(text.length()-3, text.length()).toUpperCase();
        return text.substring(0, text.length()-3) + lastThree;
    }
}
