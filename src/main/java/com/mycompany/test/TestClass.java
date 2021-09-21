/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;
import java.util.*;
import java.text.ParseException; 
import java.time.*; 


/**
 *
 * @author maazh
 */
public class TestClass {

    
    /*The time for this algorithm is O(nLog n) since the built 
    in sort method in java uses combination of QuickSort and MergSort 
    and both come down to O(nLog n) time complexity.*/
    int pairwiseProduct(int [] arr){
        
        Arrays.sort(arr);
        int n = arr.length;
        int sum = arr[n-1] * arr[n-2];
        return sum;
    }
    
    
    public static void main(String[] args) throws ParseException {
        
        
        TestClass TC = new TestClass();
        Scanner sc=new Scanner(System.in); 
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        Instant start = Instant.now();
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int num = TC.pairwiseProduct(arr);
        System.out.println(num);
      
        Instant finish = Instant.now(); 
  
        long timeElapsed = Duration.between(start, finish).toSeconds();  //in millis 
        System.out.println("time "+ timeElapsed); 
    }
    
}
