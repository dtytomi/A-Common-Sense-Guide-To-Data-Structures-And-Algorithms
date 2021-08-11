#include <stdio.h>

void buble_sort(int arr[6]);

int main(int args, char ** argv) {
    
    int list [6] = {65, 55, 35, 25, 15, 10};
    buble_sort(list);   
    return 0;
}

void buble_sort(int arr[6]) {
    
    int sort = 0, unsorted_length = 6 - 1;
    int swap, sorted_length = 6;

    while (sort != 1) {
        sort = 1;
        for (int i = 0; i < unsorted_length; i++) {
            if (arr[i] > arr[i + 1] ) {
                sort = 0;
                swap = arr[i + 1];
                arr[i + 1] = arr [i];
                arr[i] = swap;           
            }
        }
        unsorted_length = unsorted_length - 1;   
    }

    for (int j = 0; j < sorted_length; j++) {
        printf("Why");
        printf("My values are: %d \n", arr[j]);
    }
}
