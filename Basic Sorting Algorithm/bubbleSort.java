public class bubbleSort {
    public static void bubble(int arr []){
        for(int turn = 0; turn < arr.length - 1; turn++){
            for(int j = 0; j < arr.length - 1 - turn; j++){
                if (arr [j] > arr [j + 1]){
                    int temp = arr [j];
                    arr [j] = arr [j + 1];
                    arr [ j + 1] = temp;
                }
            }
            // for(int i = 0; i < arr.length; i++){
            //     System.out.print(arr [i] + " ");
            // }
            // System.out.println();
        }
        for(int i = 0; i < arr.length; i++){
                System.out.print(arr [i] + " ");
            }
        System.out.println();
    }
    // public static void printArr (int arr []){
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }
    public static void main (String [] args){
        int arr [] = {5, 4, 1, 3, 2};
        bubble(arr);
        // printArr(arr);
        // for(int i = 0; i < arr.length; i++){
        //         System.out.print(arr [i] + " ");
        //     }
        //     System.out.println();  
    }
}

// | Case            | Normal Bubble Sort | Optimized Bubble Sort |
// | --------------- | ------------------ | --------------------- |
// | Best            | O(n²)              | **O(n)**              |
// | Average         | O(n²)              | O(n²)                 |
// | Worst           | O(n²)              | O(n²)                 |
// | Auxiliary Space | O(1)               | **O(1)**              |


//   Optimised Solution

// public class BubbleSort {

//     public static void bubbleSort(int arr[]) {

//         for (int i = 0; i < arr.length - 1; i++) {

//             boolean swapped = false;

//             for (int j = 0; j < arr.length - 1 - i; j++) {

//                 if (arr[j] > arr[j + 1]) {

//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;

//                     swapped = true;
//                 }
//             }

//             // If no swapping happened, array is already sorted
//             if (swapped == false) {
//                 break;
//             }
//         }
//     }

//     public static void main(String[] args) {

//         int arr[] = {1, 2, 3, 4, 5};

//         bubbleSort(arr);

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }