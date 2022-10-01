/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/*
 *
 * @author zenalarifin
 */

public class InsertionSort
{
    
    static void InsertionSortFunc(int [] arr)
    {
        for(int i = 1;i < arr.length;i++)
        {
            int j = i - 1;
            int key = arr[i];
            
            while(j >= 0&&arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }
    
    static void PrintArr(int [] arr)
    {
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) 
    
    {
        int arr[] = {20,15,12,5,33,13,54};
        
        System.out.println("Unsorted array is: ");
        PrintArr(arr);
        InsertionSortFunc(arr);
        System.out.println("\n\nSorted array is: ");
        PrintArr(arr);
    }
}
