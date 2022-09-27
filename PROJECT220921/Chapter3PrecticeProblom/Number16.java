package Chapter3PrecticeProblom;

import java.util.Scanner;

public class Number16 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        int win=0, lose=0, draw=0;  
        
        while(true) {
            System.out.println("가위 바위 보!>>");
            String user = sc.next();
            if(user.equals("그만")) {
                break;
            }
            int com =(int)(Math.random()*3+1);
            switch (com) {
            case 1:
                if(user.equals("가위")) {
                    System.out.println("사용자:가위, 컴퓨터:가위 비겼습니다.");
                    draw++;
                }else if(user.equals("바위")) {
                    System.out.println("사용자:바위, 컴퓨터:가위 이겼습니다.");
                    win++;
                }else if(user.equals("보")) {
                    System.out.println("사용자:보, 컴퓨터:가위 졌습니다.");
                    lose++;
                }
                else {
                    System.out.println("제대로 다시 입력하세요.");
                }
                break;
            case 2:
                if(user.equals("가위")) {
                    System.out.println("사용자:가위, 컴퓨터:바위 졌습니다.");
                    lose++;
                }else if(user.equals("바위")) {
                    System.out.println("사용자:바위, 컴퓨터:바위 비겼습니다.");
                    draw++;
                }else if(user.equals("보")) {
                    System.out.println("사용자:보, 컴퓨터:바위 이겼습니다.");
                    win++;
                }
                else {
                    System.out.println("제대로 다시 입력하세요.");
                }
                break;
            case 3:
                if(user.equals("가위")) {
                    System.out.println("사용자:가위, 컴퓨터:보 이겼습니다.");
                    win++;
                }else if(user.equals("바위")) {
                    System.out.println("사용자:바위, 컴퓨터:보 졌습니다.");
                    lose++;
                }else if(user.equals("보")) {
                    System.out.println("사용자:보, 컴퓨터:보 비겼습니다.");
                    draw++;
                }
                else {
                    System.out.println("제대로 다시 입력하세요.");
                }
                break;
            }
            
        }
        System.out.println("이긴횟수: "+win);
        System.out.println("진횟수: "+lose);
        System.out.println("비긴횟수: "+draw);
 
    }
 
}