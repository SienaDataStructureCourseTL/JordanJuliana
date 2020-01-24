
/**
 * An exception to be thrown by Matrix2D methods when a row or column
 * index is specified out of range.
 * 
 * @author Jim Teresco
 * @version Fall 2017
 */
public class Matrix2DIndexOutOfBoundsException extends Exception
{
    public Matrix2DIndexOutOfBoundsException(String rowCol, int number, int size) {
        super("Matrix2D " + rowCol + " " + number + " must be in range 0-" + (size-1));
    }
}

