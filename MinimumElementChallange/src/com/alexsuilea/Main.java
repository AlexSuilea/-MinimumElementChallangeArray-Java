package com.alexsuilea;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of elements:\r");
	    int numberOfElements = scanner.nextInt();
	    int[] array = readInt(numberOfElements);
        System.out.println("The minimum element from the array " + Arrays.toString(array)+ " is: "+getMinInt(array));
    }

    private static int[] readInt(int number){
        System.out.println("Enter " +number+ " elements\r");
        int[] array = new int[number];
        for(int i=0; i<number; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int getMinInt(int[] array){
        int min = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
