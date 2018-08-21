package com.sergio.algoritmos;

import java.lang.reflect.Array;

public class ReverseArray {
	
	public static void main(String [] args) {
		Integer [] vector = {3,6,10,30,222,99};
		Integer[] reverse_vector = reverseArray(Integer.class, vector);
        for (Integer temp : reverse_vector) {
            System.out.print(temp + " ");
        }
	}
	
	private static <T> T[] reverseArray(Class<T> clazz, T[] array) {
		T[] res = (T[]) Array.newInstance(clazz, array.length);
		int aux = res.length - 1;
		for (int i = 0; i < res.length; i++) {
			res[i] = array[aux];
			aux--;
		}
		return res;
	}
}
