package io.github.alexengrig.nih.collections.util;

public class Sorting {
    private Sorting() {
    }

    public static void insertion(int[] input) {
        for (int right = 1, length = input.length; right < length; ++right) {
            int key = input[right];
            int left = right - 1;
            while (left >= 0 && input[left] > key) {
                input[left + 1] = input[left];
                left--;
            }
            input[left + 1] = key;
        }
    }

    public static void bubble(int[] input) {
        for (int major = 0, length = input.length; major < length - 1; major++) {
            boolean swap = false;
            for (int minor = 0; minor < length - major - 1; minor++) {
                if (input[minor] > input[minor + 1]) {
                    int buffer = input[minor];
                    input[minor] = input[minor + 1];
                    input[minor + 1] = buffer;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}
