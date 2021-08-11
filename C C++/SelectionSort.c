#include <stdio.h>

void selectionSort (int arr[5]);

int main(int argc, char ** argv) {

    int list [] = {4, 2, 7, 1, 3};
    
    selectionSort(list);

}

void selectionSort (int arr[5]) {

    for (int i = 0; i < 5; i++) {
        
        int lowestNumberIndex = i;

        for (int j = i + 1; j < 5; j++) {
            if(arr[j] < arr[lowestNumberIndex]) {
                lowestNumberIndex = j;
            }
        }
        
        if (lowestNumberIndex != i) {
            int temp = arr[i];
            arr[i] = arr[lowestNumberIndex];
            arr[lowestNumberIndex] = temp;
        }
        
        printf("Sorted array: %d \n", arr[i]);
    }
}
