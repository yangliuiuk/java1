/** Display a geometric progression
 * Write a program that displays the first ten terms of a geometric progression with
 * initial value 1 and common ratio 2. The n-th term of this geometric progression
 * is given by:
 * 
 * a[0] = 1 (n = 0)
 * a[n] = 2 * a[n-1] (n >= 1)
 * 
 * Below is a sample run:
 * 
 * 2 4 8 16 32 64 128 256 512 1024
*/
public class GeometricProgression{
    public static void main(String[] args){
        for (int i = 0; i < 10; i ++)
            System.out.print((int)geometricProgression(i, 1, 2) + " ");
    }

    /**
     * Returns the value of the n-th term of a geometric progression with 
     * initial value a and common ratio r.
     * 
     * @param n the index n
     * @param a the initial value
     * @param r the common ratio
     * @return double the n-th term
    */
    public static double geometricProgression(int n, double a, double r){
        if (n == 0) 
            return a;
        else
            return r * geometricProgression(n-1, a, r);
    }
}
