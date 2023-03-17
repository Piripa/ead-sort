package ordenacao.algoritms;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        merge(elements, elements, 0, elements.length-1);
        int [] sorted = elements.clone();
        return sorted;
    }
    private void merge(int[] elements,int[] auxiliar, int inicio, int fim)
    {  
        if(inicio<fim){
            int meio = (inicio+fim)/2;
            merge(elements, auxiliar, inicio, meio);
            merge(elements, auxiliar, meio+1, fim);
            juntar(elements, auxiliar, inicio, fim, meio);

        }
    }
    private void juntar(int[]elements, int[] auxiliar, int inicio, int fim, int meio){
        int esq = inicio;
        int dir = meio+1;
        for (int i = inicio; i <=fim; i++) {
            auxiliar[i] = elements[i];
        }
        for (int i = inicio; i < fim; i++) {
            if(esq > meio){
                elements[i] = auxiliar[dir++];
            }
            else if(dir>fim){
                elements[i] = auxiliar[esq++];
            }
            else if(auxiliar[esq]< auxiliar[dir]){
                elements[i] = auxiliar[esq++];
            }
            else{
                elements[i] = auxiliar[dir++];
            }
            
        }
    }

    @Override
    public String getName() {
        return "MergeSort";
    }

}
