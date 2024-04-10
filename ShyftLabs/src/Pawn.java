public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(Square source, Square destination) {
        // Implementation of pawn's valid moves
        return true;
    }
}
