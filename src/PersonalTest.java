public class PersonalTest {
    static final int MAX_VALUE = 1_000_000;
    static final int MAX_ARRAY_SIZE = 100_000;
    static final int ARRAY_SIZE_START = 20_000;
    static final int ARRAY_SIZE_INCREMENT = 20_000;
    static final int NUMBER_SEARCHES = 50_000;

    public static int[] generateNumbers (int howMany, int maxValue) {
        if(howMany < 1) {
            return null;
        }
        int i = 0;
        int[] numbers = new int[howMany];
        while (i < howMany) {
            int number = (int) (Math.random() * maxValue);
            numbers[i] = number;
            i++;
        }
        return numbers;
    }
    public static boolean linearSearch(int[] data, int search) {  // Must remember times from each one
        int i = 0;
        while (i < data.length) {
            if (data[i] == search) {
                return true;
            }
            i++;
        }
        return false;
    }
    int[] data = new int[]{5,4,3,2,1};  // TEST
    public static void selectionSort(int[] data) {
        int i = 0;
        while (i < data.length-1) {
            int j = i + 1;
            while (j > 0) {
                if (data[j] < data[j - 1]) {
                    int dataTemp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = dataTemp;
                }
                j--;
            }
            i++;
        }
        //int n = data.length;
        //for (int a=0; a<n; ++a)
        //    System.out.print(data[a]+" ");
        //System.out.println();
        //System.out.println(data.length);
    }

    public static boolean binarySearch(int[] data, int search) {
        int i = 0;
        int low = 0;
        int high = data.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (search == data[mid]) {
                return true;
            }
            else if (search > data[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void demoLinearSearchUnsorted() {
        System.out.println("--- Linear Search Timing (unsorted) ---");
        int start = ARRAY_SIZE_START;
        while (start <= MAX_ARRAY_SIZE) {
            int[] data = generateNumbers(start, MAX_VALUE);
            double startTime = System.currentTimeMillis();
            int timesFound = 0;
            int i = 0;
            while (i <= NUMBER_SEARCHES) {
                int searchVal = (int)(Math.random() * MAX_VALUE);
                boolean result = linearSearch(data, searchVal);
                if (result) {
                    timesFound++;
                }
                i++;
            }
            double endTime = System.currentTimeMillis();
            double totalTimeVar = endTime - startTime;
            int totalTime = (int) totalTimeVar;
            String toPrint = "Number of items";
            System.out.printf("%-21s : %-5s\n", toPrint, start);
            toPrint = "Times value was found";
            System.out.printf("%-21s : %-5s\n", toPrint, timesFound);
            toPrint = "Total search time";
            System.out.printf("%-21s : %-3s ms\n\n", toPrint, totalTime);
            start += ARRAY_SIZE_INCREMENT;
        }


    }
    public static void demoLinearSearchSorted() {
        System.out.println("--- Linear Search Timing (Selection Sort) ---");
        int start = ARRAY_SIZE_START;
        while (start <= MAX_ARRAY_SIZE) {
            int[] data = generateNumbers(start, MAX_VALUE);
            double startTime = System.currentTimeMillis();
            int timesFound = 0;
            int i = 0;
            selectionSort(data);
            while (i <= NUMBER_SEARCHES) {
                int searchVal = (int)(Math.random() * MAX_VALUE);
                boolean result = linearSearch(data, searchVal);
                if (result) {
                    timesFound++;
                }
                i++;
            }
            double endTime = System.currentTimeMillis();
            double totalTimeVar = endTime - startTime;
            int totalTime = (int) totalTimeVar;
            String toPrint = "Number of items";
            System.out.printf("%-21s : %-5s\n", toPrint, start);
            toPrint = "Times value was found";
            System.out.printf("%-21s : %-5s\n", toPrint, timesFound);
            toPrint = "Total search time";
            System.out.printf("%-21s : %-3s ms\n\n", toPrint, totalTime);
            start += ARRAY_SIZE_INCREMENT;
        }
    }
    public static void demoBinarySearchSelectionSort() {
        System.out.println("--- Binary Search Timing (Selection Sort) ---");
        int start = ARRAY_SIZE_START;
        while (start <= MAX_ARRAY_SIZE) {
            int[] data = generateNumbers(start, MAX_VALUE);
            double startTime = System.currentTimeMillis();
            int timesFound = 0;
            int i = 0;
            selectionSort(data);
            while (i <= NUMBER_SEARCHES) {
                int searchVal = (int)(Math.random() * MAX_VALUE);
                boolean result = binarySearch(data, searchVal);
                if (result) {
                    timesFound++;
                }
                i++;
            }
            double endTime = System.currentTimeMillis();
            double totalTimeVar = endTime - startTime;
            int totalTime = (int) totalTimeVar;
            String toPrint = "Number of items";
            System.out.printf("%-21s : %-5s\n", toPrint, start);
            toPrint = "Times value was found";
            System.out.printf("%-21s : %-5s\n", toPrint, timesFound);
            toPrint = "Total search time";
            System.out.printf("%-21s : %-3s ms\n\n", toPrint, totalTime);
            start += ARRAY_SIZE_INCREMENT;
        }
    }
    public static void demoBinarySearchFastSort() {
        System.out.println("--- Binary Search Timing (Arrays.sort) ---");
        int start = ARRAY_SIZE_START;
        while (start <= MAX_ARRAY_SIZE) {
            int[] data = generateNumbers(start, MAX_VALUE);
            double startTime = System.currentTimeMillis();
            int timesFound = 0;
            int i = 0;
            java.util.Arrays.sort(data);
            while (i <= NUMBER_SEARCHES) {
                int searchVal = (int)(Math.random() * MAX_VALUE);
                boolean result = binarySearch(data, searchVal);
                if (result) {
                    timesFound++;
                }
                i++;
            }
            double endTime = System.currentTimeMillis();
            double totalTimeVar = endTime - startTime;
            int totalTime = (int) totalTimeVar;
            String toPrint = "Number of items";
            System.out.printf("%-21s : %-5s\n", toPrint, start);
            toPrint = "Times value was found";
            System.out.printf("%-21s : %-5s\n", toPrint, timesFound);
            toPrint = "Total search time";
            System.out.printf("%-21s : %-3s ms\n\n", toPrint, totalTime);
            start += ARRAY_SIZE_INCREMENT;
        }
    }
    public static void main(String[] args) {
        int [] numbers = generateNumbers(ARRAY_SIZE_START, MAX_VALUE);
        //System.out.print(linearSearch(numbers, 15));
        demoLinearSearchUnsorted();
        demoLinearSearchSorted();
        demoBinarySearchSelectionSort();
        demoBinarySearchFastSort();
    }

}