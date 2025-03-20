package string;

import java.util.Scanner;

// 입력받은 단어에서 가장 많이 사용된 알파벳 찾기
public class MostFrequentCharFinder {

/*    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26]; // 알파벳 갯수 a~z 까지;26개
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // str의 한글자씩 추출
            if ('A' <= ch && ch <= 'Z') {
                count[ch - 'A']++;
            }
        }
        return count;
    }*/

    // str중에서 내가 찾고 있는 alp(A ~ B) 순차적으로 몇개인지 찾기
    public static int getAlphabetCount(String str, char alp) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            // str중에서 내가 찾고 있는 alp이 있다면 count +1
            if(alp == str.charAt(i)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase(); // 입력 문자 대문자로 모두 변경
//        int[] count = getAlphabetCount(str);

        // count중 최대값 찾기
/*        int maxCount = -1; // 최대값이 0일수도 있기에 -1롤 초기화
        int maxAlphabetIndex = -1;
        char maxAlphabet = '?';
        for(int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabetIndex = i;
                maxAlphabet = (char)('A' + i);
            }
            // 만약 최대출현 알파벳이 여러개 존재한다면 '?'로 대입
            else if (count[i] == maxCount) {
                maxAlphabet = '?';
            }
        }*/

        int maxCount = -1; // 최대값이 0일수도 있기에 -1롤 초기화
        char maxAlphabet = '?';
        // 대문자 A~Z까지 for문 돌려서 입력받은 str의 알파뱃 갯수 찾기
        for(char alp = 'A'; alp <= 'Z'; alp++) {
            int count = getAlphabetCount(str, alp);
            if(count > maxCount) {
                maxCount = count;
                maxAlphabet = alp;
            }
            else if (count == maxCount){
                maxAlphabet = '?';
            }
        }

//        System.out.println((char)('A' + maxAlphabetIndex)); // 대문자로 출력하기
        System.out.println(maxAlphabet); // 대문자로 출력하기
    }
}
