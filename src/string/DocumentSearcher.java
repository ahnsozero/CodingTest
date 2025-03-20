package string;

import java.util.Scanner;

// 문서 검색
public class DocumentSearcher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine(); // 개행문자를 기준으로 공백포함해서 문자 입력받기 가능
        String word = sc.nextLine();

       /* int count = 0;
        int startIndex = 0;
        while(true) {
           int findIndex = doc.indexOf(word, startIndex);
           // indexOf 결과 -1 나온다면 일치하는 문자가 없다
           if(findIndex < 0) {
               break; // 뒤에 더이상 일치하는 문자 없기 때문에 while문 탈출
           }
           count++; // 일치하는 문자 찾아서 count +1
           startIndex = findIndex + word.length(); // 단어 길이만큼 다음 시작 인덱스 늘려줌
        }
        System.out.println(count);*/

        String replaced = doc.replace(word, "");
        int length = doc.length() - replaced.length(); // 문서 전체 길이에서 일치하지 않는 단어 길이 뺴기
        int count = length / word.length(); //일치하는 단어 길이에서 검색 단어 나누기
        System.out.println(count);
    }
}
