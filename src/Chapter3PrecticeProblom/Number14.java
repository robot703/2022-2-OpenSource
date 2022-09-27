package Chapter3PrecticeProblom;

import java.util.Scanner;

public class Number14 {
 
    public static void main(String[] args) {
        String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score[] = {95, 88, 76, 62, 55};
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.print("과목 이름(그만 입력시 종료)>>");
            String input = sc.next();
            if(input.contentEquals("그만")) {
                System.out.println("종료...");
                break;
            }
            for (int i=0; i<course.length; i++) {
                if(input.contentEquals(course[i])) {
                    System.out.println(course[i]+"의 점수는 "+score[i]);
                    break;
                }
                if(i==course.length-1) {
                    System.out.println("없는 과목입니다.");
                }
            }
        }
    }    
}
