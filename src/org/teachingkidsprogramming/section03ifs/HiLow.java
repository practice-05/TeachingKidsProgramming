package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    //    Do the following 8 times --#9.1
    int guess = MessageBox.askForNumericalInput("What is your guess?");
    
    if (guess == 40)
    {
      Sound.playBeep();
      MessageBox.askForNumericalInput("What is your guess?");
      
    }
    //               and exit --#10
    //         Otherwise, if the guess is too high --#6
    else if (guess > 40)
    {
      MessageBox.showMessage("Too high");
      
    }
    
    //         Otherwise, if the guess is too low --#8
    else 
    {
      MessageBox.showMessage("Too low");
    }
    //               Tell the end user that it is too low --#7
    //    End Repeat --#9.2
    //    After 8 incorrect guesses tell the user they've lost --#11
  }
}
