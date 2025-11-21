import java.util.Scanner;

/**
 * Write a description of class ScenarioQuestion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScenarioQuestion
{
    public static void main(String[] args){
        
        int fare=150;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter distance in kilometers:");
        System.out.println("Enter time in minutes:");
        System.out.println("Are you a local?");
        System.out.println("Is the travel during night");
        double distance=scan.nextDouble();
        double time=scan.nextDouble();
        boolean local=scan.nextBoolean();
        boolean traveltime=scan.nextBoolean();
        String result=(local=true)?"125":"150";
        String result1=(traveltime=true)?"175":"150";        
        System.out.println("The fare is:"+result);
        System.out.println("The fare is:"+result1);
        
    }
}