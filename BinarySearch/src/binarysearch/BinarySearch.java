/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author lucasabbade
 */
public class BinarySearch
{

    public static void main(String[] args)
    {
        int[] numeros = {1, 2, 4, 6, 8, 11, 15, 19, 20};
        
        int posicao = binarySearch(numeros, 4);
        System.out.println(posicao);
    }
    
    public static int binarySearch(int[] arr, int num) {
        int i = 0;
        int j = arr.length;
        
        while (i < j) {
            int middle = (i + j)/2;
            
            if (arr[middle] == num) {
                return middle;
            }
            if (arr[middle] > num) {
                j = middle - 1;
            } else {
                i = middle + 1;
            }
        }
        
        return -1;      // nao achou
    }
    
}
