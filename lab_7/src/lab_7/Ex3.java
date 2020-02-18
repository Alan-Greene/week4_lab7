package lab_7;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String winner = "";

        System.out.println("Please enter the number of salesmen: ");
        int number_of_salesmen = in.nextInt();
        in.nextLine();

        String[] surnames = new String[number_of_salesmen];
        double[] sales = new double[number_of_salesmen];

        for (int i = 0; i < number_of_salesmen; i++){
            System.out.printf("Please enter the name of salesman %d%n", i+1);
            surnames[i] = in.nextLine();
            System.out.printf("Please enter the sales figure for %s%n", surnames[i]);
            sales[i] = in.nextDouble();
            in.nextLine();

        }

        System.out.printf("%10s%n", "Sales Report");
        System.out.printf("%-10s %-6s%n", "Salesman", "Sales");
        for (int i = 0; i < number_of_salesmen; i++){
            System.out.printf("%-10s %-6s%n", surnames[i], sales[i]);
        }

        double max = sales[0];

        for (double i:sales){
            if (i > max){
                max = i;
            }
        }

        for (int i = 0; i < number_of_salesmen; i++){
            if (sales[i] == max){
                winner = surnames[i];
            }
        }

        System.out.printf("The largest sale was: €%.2f and was made by: %s", max, winner);

    }
}
