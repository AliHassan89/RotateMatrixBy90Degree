/*
    Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
    bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 */
package cci_chap1_rotatematrix;

/**
 *
 * @author Ali
 */
public class CCI_Chap1_RotateMatrix 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        
        rotateMatrixBy90Degrees(matrix);
    }
    
    private static void rotateMatrixBy90Degrees(int[][] matrix)
    {
        if (matrix.length != matrix[0].length)
            return;
        
        int len = matrix.length;
        int a,b,c,d;
        int k;
        
        for (int i=0; i<len/2; i++)
        {
            k = len - i - 1;
            for (int j=i; j<k; j++)
            {
                a = matrix[i][j];
                b = matrix[j][k];
                c = matrix[k][k-j+i];
                d = matrix[k-j+i][i];
                
                matrix[i][j] = d;
                matrix[j][k] = a;
                matrix[k][k-j+i] = b;
                matrix[k-j+i][i] = c;
            }
        }
        
        for (int i=0; i<len; i++)
        {
            for (int j=0; j<len; j++)
            {
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println("");
        }
    }
    
}
