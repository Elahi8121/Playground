import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int l1 = num%10;
      int f1 = num/100;
      System.out.println(f1+l1);
	}
}