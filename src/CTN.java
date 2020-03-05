import java.util.Scanner;

public class CTN {
public static void main(String[]args) {

    Scanner input = new Scanner(System.in);
    int a,b;
    System.out.println("Enter the first number: ");
    a = input.nextInt();
    System.out.println("Enter the second number: ");
    b = input.nextInt();

  //  boolean t = true;
    if(a>b){
        System.out.println("The answer is: a > b");
    }
//    else if(a!=b){
//        System.out.println("a is not equal to b");
//    }
else if (a<b){
    System.out.println("The answer is: a < b");
    }
else{
    System.out.println("a is equal with b ");
    }


}
}
