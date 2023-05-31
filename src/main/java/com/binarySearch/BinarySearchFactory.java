package com.binarySearch;

public class BinarySearchFactory {
    public static <TComparable extends Comparable<TComparable>> BinarySearch<TComparable> create() {
        return new BinarySearch<TComparable>();
    }
}
