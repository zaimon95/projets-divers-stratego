package g53037.stratego.model;

/**
 * allows to manage the coordinates of the boxes of the board of game
 *
 * @author simon
 */
public class Position {

    /**
     * Row of the position
     */
    private int row;

    /**
     * Column of the position
     */
    private int column;

    /**
     * The constructor receives a row and a column as a parameter and
     * initializes the attributes of the class
     *
     * @param row Row of the position
     * @param column Column of the position
     */
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     *
     * @return Row of the position
     */
    public int getRow() {
        return row;
    }

    /**
     *
     * @return Column of the position
     */
    public int getColumn() {
        return column;
    }

    public Position next(Direction direction) {
        Position p = new Position(row, column);
        p.row = p.row + direction.getRow();
        p.column = p.column + direction.getColumn();
        return p;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.row;
        hash = 31 * hash + this.column;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Position other = (Position) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        return true;
    }

}
