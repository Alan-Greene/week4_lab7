package lab_7;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int NUM_CANDIDATES = 5;
        double sum = 0.0;
        String winner = "";

        String[] names = new String[NUM_CANDIDATES];
        int[] votes = new int[NUM_CANDIDATES];
        double[] percentages = new double[NUM_CANDIDATES];

        for (int i = 0; i < NUM_CANDIDATES; i++){
            System.out.printf("Please enter the name for candidate %d: ", i+1);
            names[i] = in.nextLine();

            System.out.println("Please enter the number of votes this candidate received: ");
            votes[i] = in.nextInt();
            in.nextLine();
            sum += votes[i];
        }

        for (int i = 0; i < NUM_CANDIDATES; i++){
            percentages[i] = (votes[i] / sum) * 100;
        }

        double max = percentages[0];

        for (double i:percentages){
            if (i > max){
                max = i;
            }
        }

        for (int i = 0; i < NUM_CANDIDATES; i++){
            if (percentages[i] == max){
                winner = names[i];
            }
        }

        System.out.println("The result fo the election is:");
        System.out.printf("%-10s %-6s %s%n", "Candidate", "Votes", "% of Total Votes");

        for (int i = 0; i < NUM_CANDIDATES; i++){
            System.out.printf("%-10s %-6d %.2f%n", names[i], votes[i], percentages[i]);
        }

        System.out.println("Total votes: " + sum);
        System.out.println("The winner for the election is: " + winner);
    }
}
