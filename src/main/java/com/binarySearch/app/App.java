package com.binarySearch.app;

import java.util.Arrays;

import com.binarySearch.BinarySearch;

public class App
{
    public static void main( String[] args )
    {
      BinarySearch<Integer> a = new BinarySearch<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

      a.SearchIndex(5);
    }
}
