import java.util.*;
public class testing {
    public static void main(String[] args) {
//        System.out.println(common_element(new int[]{3, 4, 2, 2, 4}, new int[]{3, 2, 2, 7}));
        System.out.println(reverseInteger(-123));;
    }
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        //Your code here
        ArrayList<Integer> arr = new ArrayList<Integer>(5);

        for(int i = 0 ; i < v1.length ; i++){
            for(int j = 0 ; j < v2.length ; j++){
                if(v1[i]==v2[j]){
                    arr.add(v1[i]);
                    break;
                }
            }
        }
        Collections.sort(arr);
        return arr;
    }
    public static int reverseInteger(int x ){
        System.out.println(x);
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        sb.reverse();
        int reversedNum = Integer.parseInt(String.valueOf(sb));
        if (x < 0) {
            reversedNum *= -1;
        }
        return  Integer.parseInt(String.valueOf(reversedNum));
    }
}
