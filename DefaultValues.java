
/**
 * Write a description of class DefaultValues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValues
{
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    boolean g;
    char h;
    public static void main(String[] args){
        int x;
        DefaultValues y=new DefaultValues();
        System.out.println(y.a);
        System.out.println(y.b);
        System.out.println(y.c);
        System.out.println(y.d);
        System.out.println(y.e);
        System.out.println(y.f);
        System.out.println(y.g);
        System.out.println(y.h);
        
        //Local variable declared inside the main method do not receive any default values.They need to be initialized.
        
        
        
        
    }
}