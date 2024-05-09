import javax.swing.*;
public class GuessingGame {
public static void main(String[] args) {
    int computerNumber = (int)(Math.random()*100+1);
    int userAnswer = 0;
    int count = 1;
    while(userAnswer!= computerNumber){
        String response = JOptionPane.showInputDialog( null, "Enter A GuessBetween 1 and 100", "Guessing Game",3);
        userAnswer = Integer.parseInt(response);
        JOptionPane.showMessageDialog(null, ""+determineGuess(userAnswer,computerNumber,count));
        count++;
    
    }
}
public static String determineGuess(int userAnswer, int computerNumber,int count){
    if ( userAnswer <=0  || userAnswer<100) {
        return"your guess is invalid";
    }
    else if ( userAnswer==computerNumber) {
        return "correct!\nTotal Guesses:"+count;
        
    }
    else if ( userAnswer<computerNumber) {
        return " your guess is too high, try again.\nTry Number:"+ count;
        
    }
    else if ( userAnswer<computerNumber) {
        return "your guess is too low,try again.\nTry Number:"+ count;
        
    }
    else {
        return "your guess is incorrect\nTry Number:" + count;
        }
}

}
    
