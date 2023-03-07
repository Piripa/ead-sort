package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int key = i;
            for (int j = i+1; j < elements.length; j++) {
                if(key>elements[j]){
                    int save = key;
                    key = elements[j];
                    elements[j] = save;
                }
            }
            
        }
        int [] sorted = elements.clone();
        return sorted;
    }
    
    @Override
    public String getName() {
        return "SelectionSort";
    }
}
