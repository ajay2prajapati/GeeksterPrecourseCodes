public class Main {
	public static void main(String[] args) {
	int count = 0, num =84484848;

    while (num != 0) {
      num /= 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  
  
	}
}