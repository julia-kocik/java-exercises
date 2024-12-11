import java.util.HashSet;

public class CommonWithSet {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4, 5, 7, 7};
        int[] tab2 = {9, 8, 3, 4, 5, 7};

        HashSet<Integer> set1 = new HashSet<>();
        for (int e:tab1) {
            set1.add(e);
        }

        HashSet<Integer> commonElements = new HashSet<>();
        for (int i: tab2) {
            if(set1.contains(i)) {
                commonElements.add(i);
            }
        }

        System.out.println(commonElements);
    }
}
