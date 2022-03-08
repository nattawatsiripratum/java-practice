package rockpaperscissortester;

import java.util.Scanner;

public class Game {
    private int score_player;
    private int score_com;
    
    private String check(int i) {
        if (i==0) return "ROCK";
        else if (i==1) return "PAPER";
        else return "SCISSORS";
    }
    
    public void play() {
        Scanner input=new Scanner(System.in);
        while (Math.abs(score_player-score_com)!=2) {
            System.out.print("Enter 0 for ROCK, 1 for PAPER, 2 for SCISSORS: ");
            String in;
            int player=-1;
            int com = (int) (Math.random()*3);
            while (input.hasNext()) {
                in = input.nextLine();
                if ("0".equals(in) || "1".equals(in) || "2".equals(in)) {
                    player = Integer.parseInt(in);
                    break;
                }
                else {
                    System.out.print("Enter 0 for ROCK, 1 for PAPER, 2 for SCISSORS: ");
                }
            }
   
            System.out.println("You enter: "+check(player));
            System.out.println("Computer: "+check(com));
            if ((player==0 && com==2) || (player==1 && com==0) || (player==2 && com==1)) {
                System.out.println("You win!");
                score_player++;
            } else if (player==com) {
                System.out.println("It's a tie.");  
            } else {
                System.out.println("You lose!");
                score_com++;  
            }
        }
        
        System.out.println("------------------------");
        System.out.println(score_player>score_com ? "Congrats! You win." : "Too bad! You lose.");
        System.out.println("User Score: "+score_player);
        System.out.println("Computer Score: "+score_com);
    }
}