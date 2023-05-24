package com.binarySearch;

import java.util.Collections;
import java.util.List;

public class BinarySearch<T extends Comparable<T>> {
    public List<T> list;

    public BinarySearch(List<T> list) {
        Collections.sort(list);
        this.list = list;
    }

    public int SearchIndex(T value) {
        int index = -1;
        int low = 0;
        int high = list.size();

        while (low <= high) {
          int middleValue = list.size() / 2;
          int comparationResult = list.get(middleValue).compareTo(value);
          if (comparationResult == 0) {
            index = middleValue;
            break;
          }
          if (comparationResult > 0) {
            low = middleValue + 1;
          }
          if (comparationResult < 0) {
            high = middleValue - 1;
          }
        }
        return index;
    }
}
