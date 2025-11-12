import java.util.Scanner;

public class gameOfChance {
    public static void main(String[] args) {
        int coinFlip = (int)(Math.random() * 2);
        int diceRoll = (int)(Math.random() * 6) + 1;
        int wheelSpin = (int)(Math.random() * 4) + 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Heads(H) or Tails(T): ");
        String coinFlipGuess = scan.next();
        System.out.print("What will the dice roll (1-6): ");
        int diceRollGuess = scan.nextInt();
        System.out.print("Will the spinner be red (r), yellow (y), green (g) or blue (b)?: ");
        String wheelSpinGuess = scan.next();

        String coinFlipWord;
        String wheelSpinWord;

        if (coinFlip == 1) {
            coinFlipWord = "Heads";
        } else {
            coinFlipWord = "Tails";
        }

        if (wheelSpin == 1) {
            wheelSpinWord = "red";
        } else if (wheelSpin == 2) {
            wheelSpinWord = "yellow";
        } else if (wheelSpin == 3) {
            wheelSpinWord = "green";
        } else {
            wheelSpinWord = "blue";
        }

        int coinFlipResult; 
        int wheelSpinResult;

        if (coinFlipGuess.equals("H")){
            coinFlipResult = 1;
        } else {
            coinFlipResult = 0;
        }

        if (wheelSpinGuess.equals("r")) {
            wheelSpinResult = 1;
        } else if (wheelSpinGuess.equals("y")) {
            wheelSpinResult = 2;
        } else if (wheelSpinGuess.equals("g")) {
            wheelSpinResult = 3;
        } else {
            wheelSpinResult = 4;
        }

        System.out.println("You flipped a " + coinFlipWord);
        System.out.println("You rolled a " + diceRoll);
        System.out.println("You spun a " + wheelSpinWord);

        boolean coinFlipCorrect;
        boolean diceRollCorrect;
        boolean wheelSpinCorrect;

        if (coinFlipResult == coinFlip) {
            coinFlipCorrect = true;
        } else {
            coinFlipCorrect = false;
        }

        if (diceRoll == diceRollGuess) {
            diceRollCorrect = true;
        } else {
            diceRollCorrect = false;
        }

        if (wheelSpin == wheelSpinResult) {
            wheelSpinCorrect = true;
        } else {
            wheelSpinCorrect = false;
        }

        if (coinFlipCorrect && diceRollCorrect && wheelSpinCorrect) {
            System.out.println("YOU GOT THEM ALL CORRECT!!!!!!!");
        } else if (coinFlipCorrect && diceRollCorrect) {
            System.out.println("You got the coin flip and dice roll correct!");
        } else if (coinFlipCorrect && wheelSpinCorrect) {
            System.out.println("You got the coin flip and wheel spin correct!");
        } else if (diceRollCorrect && wheelSpinCorrect) {
            System.out.println("You got the wheel spin and the dice roll correct!");
        } else if(coinFlipCorrect) {
            System.out.println("You got the coin flip correct!");
        } else if(diceRollCorrect) {
            System.out.println("You got the dice roll correct!");
        } else if(wheelSpinCorrect) {
            System.out.println("You got the wheel spin correct!");
        } else {
            System.out.println("you got nothing correct.");
        }

        scan.close();
    }
}