package lab_7;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        final int NUM_MACHINES = 4;
        Scanner in = new Scanner(System.in);
        int[] machine_codes = new int[NUM_MACHINES];
        int num_days = 0;
        int num_widgets = 0;
        double day_total = 0.0;
        double machine_total = 0.0;
        int total_widgets = 0;
        double weekly_cost = 0.0;
        int weekly_production = 0;
        int count = 1;

        for (int i = 0; i < machine_codes.length; i++){
            System.out.printf("Please enter machine code: %d%n", i+1);
            machine_codes[i] = in.nextInt();
            System.out.println("Please enter how many days the machine was active: ");
            num_days = in.nextInt();

            for (int j = 0; j < num_days; j++){
                System.out.printf("Please enter the number of widgets produced for day %d:", j+1);
                num_widgets = in.nextInt();

                if (num_widgets < 100){
                    day_total = num_widgets * 0.50;
                } else if (num_widgets >= 100 &&  num_widgets <= 400){
                    day_total = num_widgets * 0.40;
                } else {
                    day_total = num_widgets * 0.30;
                }

                if (num_widgets > 1000){
                    count++;
                }

                machine_total += day_total;
                total_widgets += num_widgets;

                System.out.printf("day total: €%.2f%n", day_total);
            }


            System.out.printf("Machine cost: €%.2f%n", machine_total);
            System.out.println("Machine production: " + total_widgets + "\n");
            weekly_production += total_widgets;
            weekly_cost += machine_total;
            machine_total = 0;
        }

        System.out.printf("Weekly cost: €%.2f%n", weekly_cost);
        System.out.println("Weekly production: " + total_widgets);
        System.out.println("The number of machines who produced over 1000 units is: " + count + ". Thank you");
    }
}
