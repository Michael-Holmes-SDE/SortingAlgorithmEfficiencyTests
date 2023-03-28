Phase 0: Analyze
* Purpose
1. Is it faster to do a linear search over sorted or unsorted data?
2. Is it faster to do a linear search over unsorted or first sort the data and then do a binary search?
3. Does it matter which sorting algorithm I use?








* Algorithms
1. generateNumbers(int howMany, int maxValue)
   1. Use Math.random() to get random numbers, then multiply by maxValue
   2. check that length of howMany is greater than 0, if not return null
2. public static boolean linearSearch(int[] data, int search)
    1.If 'search' is found in 'data', return true, else false
3. public static boolean binarySearch(int[] data, int search)
    1. If 'search' is found in 'data', return true, else false   
4. public static void selectionSort(int[] data)
    1. Sorts an array of integers from lowest to highest value
2. 
    




Selection Sort
    1. Array is {5,4,2,3,1}
    2. Select the i'th element
    3. Check element below
    4. If element below is greater
    5. Swap elements
    6. Loop through 4 & 5 until element below is less than or equal to
    7. go to a higher i