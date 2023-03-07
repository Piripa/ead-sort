package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        for (int i = 0; i < elements.length; i++){
            int key= i+1;
            for (int j = i; j < elements.length; j++) {
                if(elements[j]<key){
                    elements[j] = key;
                }
                key = elements[j];
            }
        }
        int [] sorted = elements.clone();
        return sorted;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
