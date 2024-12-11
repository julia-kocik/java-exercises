public class BubbleSort {
    public static void main(String[] args) {
        int[] tab = {5,3,4,7,6,2,1};
        bubbleSort(tab);
    }

    static int[] bubbleSort(int[] tab) {
        int length = tab.length;
        for (int i = 0; i < length; i++) {
            //przejście po nieposortowanej części tablicy
            for (int j = 0; j < length-i-1; j++) {
                if(tab[j] > tab[j+1]) {
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        for(int e:tab) {
            System.out.println(e);
        }
        return tab;
    }
}
