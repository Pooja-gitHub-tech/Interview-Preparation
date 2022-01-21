/*In this problem, given two sorted arrays, you have to implement the int[] mergeArrays(int[] arr1, int[] arr2) method, which returns an array consisting of all elements of both arrays in a sorted way.

Method Prototype #
int[] mergeArrays(int[] arr1, int[] arr2)*/


class CheckMergeArray 
{ 
    // merge arr1 and arr2 into a new result array 
    public static int[] mergeArrays(int[] arr1, int[] arr2) 
    {  
      int m = arr1.length;
      int n = arr2.length;
      int result[] = new int[m+n];
      int i,j,k;

      for(i=0, j=0, k=0; i < m && j < n ; ) {
        if(arr1[i] < arr2[j]) {
          result[k++] = arr1[i++];
        } 
        else {
          result[k++] = arr2[j++];
        }
      }

      while(i < m) {
        result[k++] = arr1[i++];
      }

      while(j < n) {
        result[k++] = arr2[j++];
      }

      // write your code here
      return result; // make a new resultant array and return your results in that
    } 
}
