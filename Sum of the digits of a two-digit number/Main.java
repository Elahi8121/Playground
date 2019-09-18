import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
       Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int num1 = num%10;
      int num2 = num/10;
      System.out.println(num1+num2);
	}
}