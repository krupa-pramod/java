import java.util.Scanner;

public class MultiplicationFacts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's test your multiplication facts! ");
 
        
        int[] numbersList = new int[20];
        boolean[] wrongAnswerList = new boolean[20];


        int correctAnswersOne = 0;
        int correctAnswersTwo = 0;
        int numberListIndex = 0;

        for (int i = 0; i < 10; i++) {

            int numOne = (int)(Math.random() * 15) + 1;
            int numTwo = (int)(Math.random() * 15) + 1;

            int answer = numOne * numTwo;

            System.out.print(numOne + "*" + numTwo + "= ");
            int userGuess = scan.nextInt();


            if (userGuess != answer) {
                wrongAnswerList[numberListIndex] = true;
                wrongAnswerList[numberListIndex+1] = true;
                numbersList[numberListIndex] = numOne;
                numbersList[numberListIndex+1] = numTwo;

                numberListIndex += 2;

 
            } else {correctAnswersOne++;}
        }


        System.out.println("You got " + (correctAnswersOne) + "/10 correct. Try these ones again.");

        for (int i = 0; i < wrongAnswerList.length - 1; i+= 2) {
            if (wrongAnswerList[i] == true) {
                System.out.print(numbersList[i] + "*" + numbersList[i+1] + "=");
                int userGuess = scan.nextInt();
                if (userGuess == (numbersList[i] * numbersList[i+1])) {
                    correctAnswersTwo++;
                }
            }
        }

        System.out.println("Now you got " + (correctAnswersOne + correctAnswersTwo) + "/10 correct.");

        scan.close();
    }
}
