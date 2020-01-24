/**
 * The main method is used to test some of the 
 * matrix operations defined in the Matrix2D
 * class.
 * 
 * @author Jim Teresco, modified by Prof. White 
 * @version Fall 2019
 */
public class DriverMatrix2D
{
    // a main method that tries out some of the matrix operations here
    public static void main(String[] args) throws Matrix2DSizeMismatchException,
    Matrix2DIndexOutOfBoundsException {

        Matrix2D a = new Matrix2D(4);
        System.out.println("Uninitialized 4x4 matrix a");
        System.out.println(a);

        a.randomInit(0, 10);
        System.out.println("4x4 matrix a after random initialization 0-10");
        System.out.println(a);

        try {
            a.set(2, 2, 0);
        }
        catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("4x4 matrix a after a[2][2] is set to 0");
        System.out.println(a);

        // try to get a value out of range
        try {
            double x = a.get(7, 2);
        }
        catch (Exception e) {
            System.err.println(e);
        }

        Matrix2D ident = new Matrix2D(3);
        ident.setToIdentity();
        System.out.println("3x3 identity matrix");
        System.out.println(ident);

        System.out.println("Checking if a.equals(a), expecting true: " + a.equals(a));
        
        Matrix2D ident4 = new Matrix2D(4);
        System.out.println("Checking if a.equals(ident), expecting false: " + a.equals(ident4));

        ident.scale(3);
        System.out.println("\nChecking scale of ident by 3, expecting true:  " + 
            (ident.get(0, 0) == 3 && ident.get(0, 1) == 0 && ident.get(0, 2) == 0 &&
             ident.get(1, 0) == 0 && ident.get(1, 1) == 3 && ident.get(1, 2) == 0 &&
             ident.get(2, 0) == 0 && ident.get(2, 1) == 0 && ident.get(2, 2) == 3));

        ident.set(2, 0, 9);
        System.out.println("\nChecking max, expecting true:  " + (9 == ident.maxValue()));
        
        Matrix2D b = new Matrix2D(4);
        b.randomInit(-100, 100);
        System.out.println("\n4x4 matrix b after random initialization -100 to 100");
        System.out.println(b);

        Matrix2D c = a.add(b);
        System.out.println("4x4 matrix c = a + b; expected output must be nmanually verified");
        System.out.println(c);

        // Finally, we'll try a mismatched size add and not catch the exception. 
        // This should generate a runtime error.
        Matrix2D d = c.add(ident);           
    }
}
