/*______________________________________________________________________________________________________
 * 
 * Write a Java program that reads arguments from the command line 
 * and checks whether all numeric positive non-zero values appear in ascending order.
 * _____________________________________________________________________________________________________
 * 
 * 
 * Example:
 * 
 *______________________________________________________________________________________________________
 *
 *  Input:
 *      java Test1 1 0 -2 3 5 -7 -9 7 8 
 *  Output:
 *      YES
 *______________________________________________________________________________________________________
 *      
 *______________________________________________________________________________________________________
 *  
 *  Input:
 *      java Test1 1 0 -2 3 5 -7 -9 4 7 8 
 *  Output:
 *      NO
 *______________________________________________________________________________________________________
 *
 *______________________________________________________________________________________________________ 
 */

package fme.internship;

import java.util.Scanner;

/**
 * 
 * @author <full name>
 * @email <email address>
 * 
 */

public class Test1 {
    static int checkAscending(int[] arr, int n) {
            if (n == 1 || n == 0)
                return 1;
            if (arr[n - 1] < arr[n - 2])
                return 0;
        return checkAscending(arr, n - 1);
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements ");
        n=sc.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
            }
        System.out.println("Array elements are: ");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
            }
        System.out.println();
        if (checkAscending(arr, n) != 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}