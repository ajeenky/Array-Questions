package com.L2;
//program to find common in three array
public class CommonInThreeArray {
	 // This function prints common elements in ar1
    void findCommon(int a[], int b[], int c[])
    {
        // Initialize starting indexes for ar1[], ar2[] and
        // ar3[]
        int i = 0, j = 0, k = 0;
 
        // Iterate through three arrays while all arrays
        // have elements
        while (i < a.length && j < b.length
               && k < c.length) {
            // If x = y and y = z, print any of them and
            // move ahead in all arrays
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
                k++;
            }
 
            // x < y
            else if (a[i] < b[j])
                i++;
 
            // y < z
            else if (b[j] < c[k])
                j++;
 
            // We reach here when x > y and z < y, i.e., z
            // is smallest
            else
                k++;
        }
    }
 
    // Driver code to test above
    public static void main(String args[])
    {
        CommonInThreeArray ob = new CommonInThreeArray();
 
        int a[] = { 1, 5, 10, 20, 40, 80 };
        int b[] = { 6, 7, 20, 80, 100 };
        int c[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
 
        System.out.print("Common elements are ");
        ob.findCommon(a, b, c);
    }
}
 