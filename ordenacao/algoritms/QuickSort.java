package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        quickSort(elements, 0, elements.length-1);
        int [] sorted = elements.clone();
        return sorted;
        }
    private void quickSort(int[] elements, int esq, int dir){
        if(esq<dir){
            int pivo = logica(elements, esq, dir);
            quickSort(elements, esq, pivo-1);
            quickSort(elements, pivo+1, dir);
        }

    }
    private int logica(int[] elements, int esq, int dir){
        int pivo = elements[dir];
        int index = esq-1;
        for (int i = esq; i< dir; i++) {
                if(elements[i]<=pivo){
                    index++;
                    int save = elements[index];
                    elements[index] = elements[i];
                    elements[i] = save;
                }
        }
        int aux = elements[index+1];
        elements[index+1]=elements[dir];
        elements[dir] = aux;

        return index+1;
    }
        
        @Override
        public String getName() {
            return "QuickSort";
        }
    }
        
 
