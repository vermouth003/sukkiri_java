public class Main {
	public static void main(String[] args) {
	  int[] numbers = {3,4,9};
	  System.out.println("1桁の数字を入力して下さい");
	  int input = new java.util.Scanner(System.in).nextInt();
	  for (int a : numbers) {
	      if (a == input) {
	        System.out.println("アタリ！");
          }
      }
    }
}