package algorithms.searching.arrays.binary_search;

import data_structures.arrays.IntegerHighOperations;

import java.util.Arrays;
import java.util.Objects;

public class HighArrays implements IntegerHighOperations {
    private int[] arr;
    private int size;

    public HighArrays(int length) {
        this.arr = new int[length];
        size = length;
    }

    public HighArrays(int size, int... value) {
        this.arr = value;
        this.size = size;
    }

    @Override
    public int insert(Integer value) {
        return 0;
    }

    @Override
    public boolean find(Integer value) {
        if (size <= 0 || Objects.isNull(value)) return false;
        int u = size - 1, l = 0, c;
        while (true) {
            if (l > u) return false;
            c = (u + l) / 2;
            if (value == arr[c]) return true;
            if (value < arr[c]) {
                u = c - 1;
            } else {
                l = c + 1;
            }
        }
    }

    @Override
    public int delete(Integer value) {
        return 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void printf() {
        System.out.println(Arrays.toString(arr));
    }
}


class Test {

    public final Type a = Type.TYPE_1;
    public static void main(String[] args) {
        HighArrays arrays = new HighArrays(5, 2, 3, 4, 5, 6);
        arrays.printf();
        System.out.println("Check: " + arrays.find(1));


    }
}
