import java.util.Scanner;

/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=scan.nextInt();
        String result=(marks>=40)?"Pass":"Fail";
        System.out.println(result);
        
    }
}