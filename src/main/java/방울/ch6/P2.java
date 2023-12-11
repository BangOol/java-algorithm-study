package 방울.ch6;

import java.util.*;

public class P2 {

    // 1. StringBuilder를 통해 간편하게 해결.
    public void reverseString(char[] a) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : a) {
            stringBuilder.append(a);
        }

        stringBuilder.reverse().toString().toCharArray();
    }


    // 2. 양 끝에서부터 변경해나가는 방식.
    public char[] reverseStringNormal(char[] a) {
        int firstIndex = 0;
        int lastIndex = a.length - 1;

        // 앞의 index가 뒤의 index보다 커질 때까지 진행.
        while (firstIndex < lastIndex) {
            char ch = a[firstIndex];
            a[firstIndex] = a[lastIndex];
            a[lastIndex] = ch;

            lastIndex--;
            firstIndex++;
        }
        return a;
    }
}
