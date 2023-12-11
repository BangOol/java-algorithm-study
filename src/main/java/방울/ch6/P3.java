package 방울.ch6;

import java.util.*;

import static java.lang.Character.isDigit;

public class P3 {

    // 1. 생각나는 대로 작성.
    public String[] ReorderDataInLogFiles(String[] logs) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> digitLogs = new ArrayList<>();
        ArrayList<String> letterLogs = new ArrayList<>();
        List<String> addArray = new ArrayList<>();
        List<String> result = new ArrayList<>();
        // 1. for 문으로 각 String에 대해 처리
        for (String log : logs) {
            // 2. " "를 기준으로 array 생성.
            String[] list = log.split(" ");

            // 3. 맨 앞의 키워드 제거.
            // [dit, 8, et, 5, ant...]
            for (int i = 0; i < list.length - 1; i++) {
                arrayList.add(list[i]);
            }

            // 키 값을 빈 값으로 만들기
            arrayList.add(0, "");

            // 4. 숫자와 문자를 별도로 정리.
            arrayList.forEach(e -> {
                boolean isDigit = false;
                if (!e.isEmpty()) isDigit = Character.isDigit(e.charAt(0));
                if(isDigit) {
                    digitLogs.add(e);
                } else {
                    letterLogs.add(e);
                }
            });

            // 5. 문자를 하나의 배열로 변환
            addArray.addAll(letterLogs);
            addArray.addAll(digitLogs);

            String[] logsArray = addArray.toArray(new String[0]);

            // 6. 문자열 만들기
            StringBuilder sb = new StringBuilder();
            for(String s : logsArray) {
                sb.append(s).append(" ");
            }

            // 7. 마지막 문자열의 빈 공간 제거
            String string = sb.toString().trim();
            result.add(string);
        }

        String[] arr = result.toArray(new String[0]);
        return arr;
    }
}

