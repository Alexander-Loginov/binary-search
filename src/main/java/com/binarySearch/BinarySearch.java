package com.binarySearch;

import java.util.Collections;
import java.util.List;

public class BinarySearch<T extends Comparable<T>> {
    public int searchIndex(List<T> list, T value) {
        Collections.sort(list);
        int index = -1;
        int low = 0;
        int high = list.size();

        while (low <= high) {
          int middleValue = (low + high) / 2;
          int comparationResult = list.get(middleValue).compareTo(value);
          if (comparationResult == 0) {
            index = middleValue;
            break;
          }
          if (comparationResult < 0) {
            low = middleValue - 1;
          }
          if (comparationResult > 0) {
            high = middleValue + 1;
          }
        }
        return index;
    }
}
