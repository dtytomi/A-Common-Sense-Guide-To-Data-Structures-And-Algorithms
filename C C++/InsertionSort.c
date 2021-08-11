#include <stdio.h>

void insertion_sort(int arr[5]);

int main(int argc, char ** argv) {
    
    int list [] = {4, 2, 7, 1, 3};
    insertion_sort(list);
}

void insertion_sort(int arr[5]) {
    
    for (int i = 1; i < 5; i++) {

        int position = i;
        int temp_value = arr[i];
        
        while( position > 0 && arr[position - 1] > temp_value) {
            arr[position] = arr[position - 1];
            position = position - 1;
        }
        arr[position] = temp_value;

    }

    for(int j = 0; j < 5; j++) {
        printf("Sorted array: %d \n", arr[j]);
    }
}
