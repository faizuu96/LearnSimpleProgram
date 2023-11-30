import java.util.Scanner;

public class CostOfBalloons {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                int testCases = scanner.nextInt(); // Number of test cases

                while (testCases-- > 0) {
                    int costGreen = scanner.nextInt(); // Cost of green balloon
                    int costPurple = scanner.nextInt(); // Cost of purple balloon

                    int participants = scanner.nextInt(); // Number of participants

                    int totalCost1 = 0; // Total cost with first type of balloon as green
                    int totalCost2 = 0; // Total cost with first type of balloon as purple

                    for (int i = 0; i < participants; i++) {
                        int solve1 = scanner.nextInt(); // Solving problem 1 for each participant
                        int solve2 = scanner.nextInt(); // Solving problem 2 for each participant

                        totalCost1 += (solve1 * costGreen) + (solve2 * costPurple); // Calculate total cost with green balloon first
                        totalCost2 += (solve1 * costPurple) + (solve2 * costGreen); // Calculate total cost with purple balloon first
                    }

                    // Output the minimum of two total costs
                    System.out.println(Math.min(totalCost1, totalCost2));
                }
            }
        }

