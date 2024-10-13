import java.util.Scanner;

public class mergesort {
//     public static void mergeSort(int[] arr, int left, int right) {
//         if (left < right) {
//             int mid = (left + right) / 2;
//             mergeSort(arr, left, mid);
//             mergeSort(arr, mid + 1, right);
//             merge(arr, left, mid, right);
//         }
//     }

//     private static void merge(int[] arr, int left, int mid, int right) {
//         int n1 = mid - left + 1;
//         int n2 = right - mid;
//         int[] L = new int[n1];
//         int[] R = new int[n2];
//         System.arraycopy(arr, left, L, 0, n1);
//         System.arraycopy(arr, mid + 1, R, 0, n2);
//         int i = 0, j = 0;
//         int k = left;
//         while (i < n1 && j < n2) {
//             if (L[i] <= R[j]) {
//                 arr[k++] = L[i++];
//             } else {
//                 arr[k++] = R[j++];
//             }
//         }
//         while (i < n1) {
//             arr[k++] = L[i++];
//         }
//         while (j < n2) {
//             arr[k++] = R[j++];
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = scanner.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         System.out.println("Unsorted array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();

//         mergeSort(arr, 0, arr.length - 1);

//         System.out.println("Sorted array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();

//         scanner.close();
//     }
// }

public static void mergesort(int arr[],int si,int ei){
    if(si>=ei){
        return;
    }

    int mid=si+(ei-si)/2;   //(si+ei)/2;
    mergesort(arr,si,mid);
    mergesort(arr,mid+1,ei);
    merge(arr,si,mid,ei);
}
public static void merge(int[] arr,int si,int mid,int ei){
    int temp[]=new int[ei-si+1];
    
    int i=si;   //for left part
    int j=mid+1;    //right part
    int k=0;        //temp arr iterate

    while(i<=mid&&j<=ei){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
        }
        else{
            temp[k]=arr[j];
            j++;
        }
        k++;
    }

    //left part
    while(i<=mid){
        temp[k++]=arr[i++];

    }

    //right part

    while(j<=ei){
        temp[k++]=arr[j++];
    }

    //copy temp to original array
    for(k=0,i=si;k<temp.length;k++,i++){
        arr[i]=temp[k];
    }
}
 
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter your array size :");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.print("enter your array elements");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
mergesort(arr,0,arr.length-1);
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
}
}