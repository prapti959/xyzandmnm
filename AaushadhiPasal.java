
/**
 * Write a description of class AaushadhiPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AaushadhiPasal
{
    public static void main(String[] args) {

        // Declare and initialize variables for 3 medicines
        String med1Name = "Paracetamol";
        String med1NepName = "सिटामोल";
        double med1Price = 5.74;
        int med1Stock = 200;
        boolean pres1 = false;

        String med2Name = "Flexon";
        String med2NepName = "फ्लेक्सन";
        double med2Price = 15.52;
        int med2Stock = 150;
        boolean pres2 = true;

        String med3Name = "Decold";
        String med3NepName = "डिकोल्ड";
        double med3Price = 12.5;
        int med3Stock = 100;
        boolean pres3 = false;
         //  header
        System.out.println("=====================================================");
        System.out.println("               Aushadhi Pasal Inventory              ");
        System.out.println("=====================================================");
        System.out.println();
        System.out.println("Medicine Name (Nepali) | Price | Stock|Prescription");
        System.out.println("-----------------------------------------------------");

        // details display
        System.out.println(med1Name + "   (" + med1NepName + ") | " + med1Price + " | " + med1Stock+"|"+pres1);
        System.out.println(med2Name + "   (" + med2NepName + ") | " + med2Price + " | " + med2Stock+"|"+pres2);
        System.out.println(med3Name + "   (" + med3NepName + ") | " + med3Price + " | " + med3Stock+"|"+pres3);

        System.out.println("-----------------------------------------------------");
         // Footer
        System.out.println("Inventory report generated successfully!");
    }
    
}