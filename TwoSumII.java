import java.util.*;

class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int[] finaly = new int[2];
        HashMap<Integer, Integer> SumMap = new HashMap<>();
        HashMap<Integer, Integer> IndexMap = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            IndexMap.put(numbers[i],i); //save index, value is key and index is value
            int next = target-numbers[i]; //the value we need for the sum
            if (SumMap.containsValue(numbers[i])){ //found a match
                finaly[0] = IndexMap.get(target-numbers[i]) + 1; //original value
                finaly[1] = i + 1;
            }
            else { //the corresponding not in there
                SumMap.put(numbers[i],next);
            }
        }
         return finaly;
    }
}
