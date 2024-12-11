public class CommonWithoutSet {
    public static void main(String[] args) {

        int[] tab1 = {1, 2, 3, 4, 5, 7, 8};
        int[] tab2 = {9, 8, 3, 4, 5, 7, 8};

        int[] commonTab= new int[Math.min(tab1.length, tab2.length)];
        int commonTabIndex = 0;



        for (int i : tab1) {
            boolean added = false;

            for (int k = 0; k < commonTabIndex; k++) {
                if (i == commonTab[k]) {
                    added = true;
                    break;
                }
            }

            if(!added) {
                for (int j : tab2) {
                    if(i==j) {
                        commonTab[commonTabIndex++] = i;
                        break;
                    }
                }
            }
        }


        for (int i=0; i<commonTabIndex; i++) {
            System.out.println(commonTab[i]);
        }
    }
}
