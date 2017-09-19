package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizGrader;

public class HousesQuiz extends HousesQuizAdapter
{
  public void questions1Thru6()
  {
    // Question 1 
    small();
    //
    //   Question2
    medium();
    //
    //   Question3
    large();
    drawASide();
    //
    //   Question6
    drawASide();
  }
  private void drawASide()
  {
    //   drawASide (recipe below) 
    //   ------------- Recipe for drawASide 
    //      call moveTheLength and turnTheCorne
    moveTheLength();
    turnTheCorner();
    //   ------------- End of drawASide recipe
  }
  private void turnTheCorner()
  {
    //   turnTheCorner (recipe below) 
    //   ------------- Recipe for turnTheCorner 
    Tortoise.turn(-360 / 3);
    //      turn the Tortoise 1/3 of 360 degrees to the left
    //   ------------- End of turnTheCorner recipe
  }
  private void moveTheLength()
  {
    //   moveTheLength (recipe below) 
    //   ------------- Recipe for moveTheLength 
    Tortoise.move(length);
    //      move the Tortoise the current length
    //   ------------- End of moveTheLength recipe
  }
  private void large()
  {
    //   large (recipe below) 
    //   ------------- Recipe for large 
    length = 63;
    //      set the current length to 63
    //   ------------- End of large recipe
  }
  private void medium()
  {
    //   medium (recipe below) 
    //   ------------- Recipe for medium 
    length = 21;
    //      set the current length to 21
    //   ------------- End of medium recipe
  }
  private void small()
  {
    //   small (recipe below) 
    //   ------------- Recipe for small 
    length = 7;
    //   ------------- End of small recipe
  }
  public static void main(String[] args)
  {
    new HousesQuizGrader().grade(new HousesQuiz());
  }
}
