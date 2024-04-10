public class Board {
    private Square[][] squares;

    public Board() {
        squares = new Square[8][8];
        // Initialize squares
    }

    public Square getSquare(int row, int col) {
        return squares[row][col];
    }
}
