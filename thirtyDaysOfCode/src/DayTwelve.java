import java.util.Scanner;
class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
        }
    }

    class Student extends Person {
        private int[] testScores;

        public Student(String firstName, String lastName, int identification, int[] testScores) {
            super(firstName, lastName, identification);
            this.testScores = testScores;
        }

        public char calculate() {
            int total = 0;
            for (int score : testScores) {
                total += score;
            }
            int average = total / testScores.length;
            if (average >= 90 && average <= 100) {
                return 'O';
            } else if (average >= 80 && average < 90) {
                return 'E';
            } else if (average >= 70 && average < 80) {
                return 'A';
            } else if (average >= 55 && average < 70) {
                return 'P';
            } else if (average >= 40 && average < 55) {
                return 'D';
            } else {
                return 'T';
            }
        }
    }

    class DayTwelve {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstName = scan.next();
            String lastName = scan.next();
            int id = scan.nextInt();
            int numScores = scan.nextInt();
            int[] testScores = new int[numScores];
            for (int i = 0; i < numScores; i++) {
                testScores[i] = scan.nextInt();
            }
            scan.close();

            Student s = new Student(firstName, lastName, id, testScores);
            s.printPerson();
            System.out.println("Grade: " + s.calculate());
        }
    }
     /*Scanner scanner = new Scanner(System.in);

        // Read in the name and ID
        String firstName = scanner.next();
        String lastName = scanner.next();
        int id = scanner.nextInt();

        // Read in the grades and calculate the average
        int n = scanner.nextInt();
        int[] grades = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextInt();
            sum += grades[i];
        }
        double average = (double) sum / n;

        // Determine the grade based on the average
        String grade;
        if (average >= 90) {
            grade = "O";
        } else if (average >= 80) {
            grade = "E";
        } else if (average >= 70) {
            grade = "A";
        } else if (average >= 55) {
            grade = "P";
        } else if (average >= 40) {
            grade = "D";
        } else {
            grade = "T";
        }

        // Print out the results
        System.out.printf("Name: %s, %s%n", lastName, firstName);
        System.out.printf("ID: %d%n", id);
        System.out.printf("Grade: %s%n", grade);

        scanner.close();*/
