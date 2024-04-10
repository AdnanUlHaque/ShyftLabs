// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        // Initialize players
        Player player1 = new Player("Player1", true);
        Player player2 = new Player("Player2", false);
        // Initialize pieces on the board
        initializePieces(board);
    }
    private static void initializePieces(Board board) {
        // Initialize pieces on the board
        // For example:
        board.getSquare(1, 0).setPiece(new Pawn(true));
        // Similarly, initialize other pieces
    }
}