import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App
{

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = scan.nextInt();
        int m = scan.nextInt();
        for(int i = 0; i < m; i++)
        {
            int a = scan.nextInt();
            list.add(a);
        }

        int total = (int) list.stream().distinct().count();
        System.out.println(n - total);
    }

}