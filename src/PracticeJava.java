import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeJava {

    // Fills prefix sum array
    static void fillPrefixSum(int arr[],
                              int prefixSum[]) {
        prefixSum[0] = arr[0];
        // Adding present element
        // with previous element
        for (int i = 1; i < arr.length; ++i)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        return;
    }

    public static int calSum(int[] prefix, int left, int right) {
        return prefix[right] - prefix[left];
    }

    static int pickMushrooms(int arrayList[], int start, int totalMoves) {
        int result = 0;
        int currentMax = 0;
        int n = arrayList.length;
        int prefixSum[] = new int[n];
        int startMax = 0;
        int endMax = 0;
        fillPrefixSum(arrayList, prefixSum);
//        for (int i = 0; i < n; i++)
//            System.out.print(prefixSum[i] + " ");
//        System.out.println("  ");
        for (int i = 0; i < Math.min(totalMoves, start); i++) {
            int left = start - i;
            int right = Math.min(n - 1, Math.max(start, start + totalMoves - 2 * i));
            result = Math.max(result, calSum(prefixSum, left, right));
            if (currentMax <= result) {
                currentMax = result;
                startMax = left;
                endMax = right;
            }
        }
        for (int i = 0; i < Math.min(arrayList.length - start, totalMoves + 1); i++) {
            int right = start + i;
            int left = Math.max(0, Math.min(start, start - (totalMoves - 2 * i)));
            result = Math.max(result, calSum(prefixSum, left, right));
            if (currentMax <= result) {
                currentMax = result;
                startMax = left;
                endMax = right;
            }
        }
        result = 0;
//        System.out.println("startMax = " + startMax);
//        System.out.println("endMax = " + endMax);
        for (int i = startMax; i <= endMax; i++) {
            result += arrayList[i];
//            System.out.println("result = " + result);
        }

        return result;

    }

    public static void main(String[] args) {
        /**************************************
         * Count numbers
         **************************************/
        HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(2);
        integerList.add(1);
        integerList.add(3);
        integerList.add(4);
        integerList.add(4);
        integerList.add(1);


        for (int i = 0; i < integerList.size(); i++) {
            if (hash_map.containsKey(integerList.get(i))) {
                hash_map.put(integerList.get(i), hash_map.get(integerList.get(i)) + 1);
            } else {
                hash_map.put(integerList.get(i), 1);
            }
        }
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<Integer, Integer> entry : hash_map.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        /*********************************
         * prefix of sums
         **********************************/

        //

        int arr[] = {2, 3, 7, 5, 1, 3, 9};
        int totalMoves = 6;
        int startLocation = 4;
        System.out.print("Total mushrooms " + pickMushrooms(arr, startLocation, totalMoves));
    }
    /**************************************************
     * Selection Sort
     **************************************************/

}
