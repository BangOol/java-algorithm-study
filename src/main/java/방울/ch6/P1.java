package 방울.ch6;

import java.util.Optional;

public class P1 {
    public boolean validPalindrome(String string) throws NullPointerException {
        boolean result = false;

        // 1. 첫 문제 풀이.
        StringBuilder sb = new StringBuilder();

        // 2. 안에 포함된 단어 중 알파벳이 아닌 값 제거 후 StringBuilder에 추가.
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            if ((ch >= 65 && ch <= 90)
                    || ch >= 97 && ch <= 122) sb.append(ch);
        }

        // NullPointerException 발생 전 Optional 이용
        sb = Optional.of(sb).orElse(new StringBuilder());

        // 3. 문자를 소문자로 변경.
        if (!sb.isEmpty()) {
            chars = sb.toString()
                    .toLowerCase()
                    .toCharArray();
        } else return result;


        // 4. 마지막 문자와 첫 번째 문자 인덱스 크기가 역전될 때까지 비교
        int firstIndex = 0;
        int lastIndex = sb.length() - 1;
        while (firstIndex <= lastIndex) {
            if (chars[firstIndex] == chars[lastIndex]) {
                firstIndex++;
                lastIndex--;
            }
        }

        if (firstIndex >= lastIndex) return true;


        // 예상 값 : n + 2/n = O(n)
        // 1. 해당 문자를 toCharArray()로 변경
        return result;
    }


    boolean PalindromeWithStringBuilder(String string) {
        // 2. StringBuilder의 reverse() 사용
        StringBuilder stringBuilder = new StringBuilder();
        boolean result = false;

        // 2. 안에 포함된 단어 중 알파벳이 아닌 값 제거 후 StringBuilder에 추가.
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            if ((ch >= 65 && ch <= 90)
                    || ch >= 97 && ch <= 122) stringBuilder.append(ch);
        }

        // 3. Null 값 혹은 빈 값인지 확인.
        stringBuilder = Optional.of(stringBuilder).orElse(new StringBuilder());
        StringBuilder reversed = stringBuilder.reverse();
        if (stringBuilder.isEmpty()) return false;

        // 4. reverse()를 이용해 뒤집은 이후 동일한지 비교
        if (reversed.equals(stringBuilder)) return true;


        return result;
    }


}

