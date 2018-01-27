/**
 * The purpose of this program is to count the number of
 * grades, get test grade per each test and 
 * the average of the grades after each test based on the user's responses.
 * 
 * @author Briana Berger 
 * @version 09/10/17
 */

import java.util.Scanner; 

public class GradesV3
{
    public static void main(String[ ] args)
    {
        Scanner in = new Scanner(System.in);
        
        //local variables       
        int numTests = 0;      //counts number of tests
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        
        //Asks user what their name is, the subject, and the four test scores
        System.out.println("What is your name?");
        String name = in.nextLine();
        
        System.out.println("What is your grade level? Ex: 9th");
        String grade = in.nextLine();
        
        System.out.println("What subject is this class?");
        String subject = in.nextLine();
        
        System.out.println("What were your grades on each of the four tests? Write in order of grade.");
        double testGrade1 = in.nextDouble();
        double testGrade2 = in.nextDouble();
        double testGrade3 = in.nextDouble();
        double testGrade4 = in.nextDouble();
                    
        System.out.println();
        System.out.println("==============================================================================");
        System.out.println("Name: " + name);
        System.out.println("Grade Level: " + grade);
        System.out.println("Subject: " + subject);
        System.out.println();
        
        //Calculates test grade, total points, and avg. score for test 1.
        numTests++;
        totalPoints += testGrade1;
        average = ((double)totalPoints/numTests);
        System.out.print("Test #1  Test Grade: " + testGrade1);
        System.out.print("  Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average); 

        //Calculates test grade, total points, and avg. score for test 2.
        numTests++;
        totalPoints += testGrade2;
        average = ((double)totalPoints/numTests);
        System.out.print("Test #2  Test Grade: " + testGrade2);
        System.out.print("  Total Points: " + totalPoints);
        System.out.println("  Average Score: " + average); 
        
        //Calculates test grade, total points, and avg. score for test 3.
        numTests++;
        totalPoints += testGrade3;
        average = ((double)totalPoints/numTests);
        System.out.print("Test #3  Test Grade: " + testGrade3);
        System.out.print("  Total Points: " + totalPoints);
        System.out.println("  Average Score: " + average); 
        
        //Calculates test grade, total points, and avg. score for test 4.
        numTests++;
        totalPoints += testGrade4;
        average = ((double)totalPoints/numTests);
        System.out.print("Test #4  Test Grade: " + testGrade4);
        System.out.print("  Total Points: " + totalPoints);
        System.out.println("  Average Score: " + average); 
    }//end of main method
}//end of class 