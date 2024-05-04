package ShipGame;

import java.util.Scanner;

public class shipGame {
    String[][] firstGrid;
    String[][] secondGrid;


    public shipGame() {
        firstGrid = new String[10][10];
        secondGrid = new String[10][10];

    }

    public void buildingShips(String[][] firstGrid) {
        Scanner scanner = new Scanner(System.in);
        int aircraftCarrier = 5;
        int battleShip = 4;
        int submarine = 3;
        int destroyer = 3;
        int patrolBoat = 2;
        System.out.println("How many ships do you want to build?");
        int numberOfShips = scanner.nextInt();
        for (int i = 0; i < numberOfShips; i++) {
            System.out.println("Which kind of ship do you want to build?");
            String playerChoice = scanner.next();
            if (playerChoice.equalsIgnoreCase("aircraft carrier")) {
                for (int j = 0; j < aircraftCarrier; j++) {
                    System.out.println("Enter the row");
                    int row = scanner.nextInt();
                    System.out.println("Enter the column");
                    int column = scanner.nextInt();
                    firstGrid[row][column] = "AC";
                }
            } else if (playerChoice.equalsIgnoreCase("battleship")) {
                for (int k = 0; k < battleShip; k++) {
                    System.out.println("Enter the row");
                    int row = scanner.nextInt();
                    System.out.println("Enter the column");
                    int column = scanner.nextInt();
                    firstGrid[row][column] = "BS";

                }


            } else if (playerChoice.equalsIgnoreCase("submarine")) {
                for (int l = 0; l < submarine; l++) {
                    System.out.println("Enter the row");
                    int row = scanner.nextInt();
                    System.out.println("Enter the column");
                    int column = scanner.nextInt();
                    firstGrid[row][column] = "SM";
                }

            } else if (playerChoice.equalsIgnoreCase("destroyer")) {
                for (int m = 0; m < destroyer; m++) {
                    System.out.println("Enter the row");
                    int row = scanner.nextInt();
                    System.out.println("Enter the column");
                    int column = scanner.nextInt();
                    firstGrid[row][column] = "DT";
                }


            } else if (playerChoice.equalsIgnoreCase("patrol boat")) {
                for (int n = 0; n < patrolBoat; n++) {
                    System.out.println("Enter the row");
                    int row = scanner.nextInt();
                    System.out.println("Enter the column");
                    int column = scanner.nextInt();
                    firstGrid[row][column] = "PB";
                }

            }
        }




        System.out.println("Here is your ships");
        for (int i = 0; i < firstGrid.length; i++) {
            System.out.println();
            for (int j = 0; j < firstGrid[i].length; j++) {
                System.out.print(firstGrid[i][j] + " ");

            }

        }


    }
}


