import java.util.HashSet;

//check if all elements of one array are sum of two other elements of another
public class CheckIfSum {
    public static void main(String[] args) {
        int[] arr1 = new int[]{12, 18, 16, 9, 555};
        int[] arr2 = new int[]{6, 12, 10, 2, 4, 5};

        // create hashset to store sums
        HashSet<Integer> sumSet = new HashSet<>();
        // loop
        for(int i=0; i<arr2.length; i++) {
            for (int j=i; j<arr2.length; j++) {
             sumSet.add(arr2[i] +arr2[j]);
            }
        }
        // check if contains
        boolean checkIfContains = true;

        for (int j : arr1) {
            if (!sumSet.contains(j)) {
                checkIfContains = false;
                break;
            }
        }
        // sout
        if(checkIfContains) {
            System.out.println("Każdy element arr1 jest suma dwoch elementow arr2");
        } else {
            System.out.println("NIe każdy element arr1 jest suma dwoch elementow arr2");
        }

    }
}
