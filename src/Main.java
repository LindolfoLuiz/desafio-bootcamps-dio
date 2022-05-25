import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] line = input.split(" ");

        double media = Double.parseDouble( line[0]
        )/Double.parseDouble( line[1]);

        System.out.printf("%.2f", media );
    }
}
