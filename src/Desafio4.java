import java.util.Scanner;

public class Desafio4
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        String T = sc.nextLine();

        String postgresCompetitors = sc.nextLine();
        String[] respostasCompetidoresSplit = postgresCompetitors.split(" ");

        int count = 0;
        for (String s : respostasCompetidoresSplit) {

            if (s.equals(T)) {
                count++;
            }
        }

        System.out.println(count);

    }
}