package com.springapp.mvcaa;

/**
 * Created by Administrator on 2017/4/23.
 */
public class Test {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length + 1];
        int m = 10, n = 3;
        for (int i = 0; i < a.length + 1; i++) {
            if (i == n)
                b[i] = m;
            else if (i > n)
                b[i] = a[i - 1];
            else b[i] = a[i];
        }
        for (int i = 0; i < a.length + 1; i++) {
            System.out.println(b[i]);
        }
    }
}
