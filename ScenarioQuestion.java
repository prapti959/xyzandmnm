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
        
        
        Scanner scan=new Scanner(System.in);
         // Fare rates
        double baseFare = 50.0;           // base fare in NPR
        double perKmCharge = 20.0;        // charge per km
        double perMinuteCharge = 5.0;     // charge per minute
        double localDiscount = 0.1;       // 10% discount for locals on long distance (>10 km)
        double nightSurcharge = 0.2;      // 20% extra at night
        System.out.println("Enter distance in kilometers:");
        System.out.println("Enter time in minutes:");
        System.out.println("Are you a local?");
        System.out.println("Is the travel during night");
        double distance=scan.nextDouble();
        double time=scan.nextDouble();
        boolean local=scan.nextBoolean();
        boolean traveltime=scan.nextBoolean();
        // Calculating fare
        double fare = baseFare + (distance * perKmCharge) + (time * perMinuteCharge);

        // Apply local discount if local and distance > 10 km
        fare = (local && distance > 10) ? fare * (1 - localDiscount) : fare;

        // Apply night surcharge
        fare = traveltime ? fare * (1 + nightSurcharge) : fare;
         System.out.println("Total Rickshaw Fare: " + fare);

    }
}