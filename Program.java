//import stuff here
import java.util.Scanner;
//Your code here
public class Program7{
  public static void main(String[] args){
    int sb;
    int k;
    int sn;
    Scanner x = new Scanner(System.in);
    System.out.print("Enter schrute-bucks: ");
    sb = x.nextInt();
    System.out.println();
    System.out.print("Enter klevins: ");
    k = x.nextInt();
    System.out.println();
    System.out.print("Enter stanley-nickels: ");
    sn = x.nextInt();
    System.out.println();
    double k1 = k / 20.0;
    double sn1 = sn / 240.0;
    double total = sn1 + k1 + sb;
    double total1 = Math.round(total * 100.0) / 100.0;
    System.out.print("Decimal schrute-bucks = $");
    System.out.println(total1);
  }
}
//Paste console output below:
/*


*/
