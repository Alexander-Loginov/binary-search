package com.binarySearch.app;

import java.util.Arrays;

import com.binarySearch.BinarySearch;

public class App
{
    public static void main( String[] args )
    {
      BinarySearch<Integer> a = new BinarySearch<Integer>();

      System.out.println(a.searchIndex(Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10),5));
    }
}
