import java.util.Scanner;

public class Game {
    private String player1;
    private String player2;
    String playAgain;
    int piecesToRemove;
    int playerTurn = (int)(Math.random() * (2 - 1 + 1) + 1);;
    Scanner sc = new Scanner(System.in);

    public Game(){
        System.out.println("Game started!");
    }
    public void play(){
        Board.populate();
        System.out.println("Enter Player 1's name: ");
        player1 = sc.nextLine();
        System.out.println("Enter Player 2's name: ");
        player2 = sc.nextLine();
        System.out.println("Welcome " + player1 + " and " + player2 + " to the Game of Nim!");
        System.out.println("Let's begin the game! There are " + Board.numPieces + " pieces on the board.");
        System.out.println("Players take turns removing pieces from the board.");
        System.out.println("On your turn you can remove between 1 and half of the pieces from the board.");
        System.out.println("The player who removes the last piece loses!");
        System.out.println();
        while(Board.numPieces > 0) {
            if (playerTurn == 1) {
                System.out.println(player1 + ", it's your turn! Enter the number of pieces to remove: ");
                piecesToRemove = sc.nextInt();
                Board.removePieces(piecesToRemove);
                System.out.println("There are now " + Board.numPieces + " pieces left on the board.");
                playerTurn = 2;
            } else {
                System.out.println(player2 + ", it's your turn! Enter the number of pieces to remove: ");
                piecesToRemove = sc.nextInt();
                Board.removePieces(piecesToRemove);
                System.out.println("There are now " + Board.numPieces + " pieces left on the board.");
                playerTurn = 1;
            }
        }
        if (playerTurn == 2) {
            System.out.println(player2 + " wins! Congratulations!");
        } else {
            System.out.println(player1 + " wins! Congratulations!");
        }
        sc.nextLine();
        System.out.println("Game over! Play again? (yes/no)");
        playAgain = sc.nextLine();
        if (playAgain.equals("yes")) {
            play(); // Start a new game
        } else {
            System.out.println("Thanks for playing! Goodbye!");
        }
    }
}
