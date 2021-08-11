#include <stdio.h>

int binarysearch (int arr[], int arrayLength, int value);

void main() {
    
    int array[8] = {1,1,2,3,4,5,6,7};
    int searchValue = 1;
    int arrayLength = 8;

    int result = binarysearch(array,arrayLength, searchValue);

    printf("Found %d \n", result);
}

int binarysearch (int arr[], int arrayLength, int value) {
    
    int lowerBound = 0;
    int upperBound = arrayLength - 1;

    while( lowerBound <= upperBound ) {
        
        int midpoint = (lowerBound + upperBound) / 2;

        int valueAtMidpoint = arr[midpoint];
        
        if (value < valueAtMidpoint ) {
            upperBound = midpoint - 1;
        }

        else if (value > valueAtMidpoint) {
            lowerBound = midpoint + 1;
        }

        else if (value == valueAtMidpoint) {
            return  midpoint;
        }
    }
    return 0;
}
