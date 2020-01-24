
/**
 * An exception to indicate that two Matrix2D objects are not the same size when
 * that is required.
 * 
 * @author Jim Teresco
 * @version Fall 2017
 */
public class Matrix2DSizeMismatchException extends Exception
{

    public Matrix2DSizeMismatchException(int size1, int size2) {
        super("Matrix2D size mismatch: " + size1 + "!=" + size2);
    }
}
