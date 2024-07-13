/*Step1)Divide and get mid 
  Step2)Sort(left)
  Step3)Sort(right)
  Step4)merge
*/

package Recursion;

public class RecursionMergeSort {
  public static void mergeSort(int[] arr, int si, int ei) {
    // bestcase
    if (si >= ei) {
      return;
    }

    // Divide the array from mid
    int mid = si + (ei - si) / 2; // it will calulate the mid

    // calling the function
    mergeSort(arr, si, mid);
    mergeSort(arr, mid + 1, ei);

    // creating the function
    merge(arr, si, ei, mid);
  }

  public static void merge(int[] arr, int si, int ei, int mid) {
    // creating the temp object and giving size to store
    int temp[] = new int[ei - si + 1];
    // intilizinf the sorted part
    int i = si;// First sorted part
    int j = mid + 1;// second sorted part
    int k = 0;// idx for temp

    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    // for leftover elements of 1st sorted part
    while (i <= mid) {
      temp[k++] = arr[i++];
    }

    // for leftover elements of 2nd sorted part
    while (j <= ei) {
      temp[k++] = arr[j++];
    }

    // copy temp to original array
    for (k = 0, i = si; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }
  }

  public static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = { 6, 3, 9, 5, 2, 8 };
    mergeSort(arr, 0, arr.length - 1);
    printArr(arr);

  }

}