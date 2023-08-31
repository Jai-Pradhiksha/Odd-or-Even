import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OddOrEven oddOrEven = new OddOrEven();
        Scanner scanner = new Scanner(System.in);
        oddOrEven.number = scanner.nextInt();
        oddOrEven.check();
    }
}
class OddOrEven {
    int number;
    void check() {
        if (number% 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}