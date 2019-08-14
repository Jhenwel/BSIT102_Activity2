
import java.util.Scanner;
public class Activity2 {
    
    public static void main(String[] args) throws Exception {
  Scanner input =new Scanner(System.in);
  
  String InName;
  String Section;
  String Address;
  String ContactNumber;
    
  System.out.println("Type Your Name");
  InName=input.nextLine();
    System.out.println("Type your Section");
   Section=input.nextLine();
     System.out.println("Type Your Address");
     Address=input.nextLine();
     System.out.println("Type Your ContactNumber");
     ContactNumber=input.nextLine();
   System.out.println("Hi Am " +InName);
   System.out.println("I'm from " +Section);
   System.out.println("I live in " +Address);
   System.out.println("my num is " +ContactNumber);
    }
}