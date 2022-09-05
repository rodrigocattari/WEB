package Exercise;

public class Hello {
    public static void main(String[] args) {
       int highScorePosition = calculatehighScorePosition(1500);
       displayHighScorePosition("Rodrigo", highScorePosition);

       highScorePosition = calculatehighScorePosition(900);
       displayHighScorePosition("Tim", highScorePosition);

       highScorePosition = calculatehighScorePosition(400);
       displayHighScorePosition("Bob", highScorePosition);
       
       highScorePosition = calculatehighScorePosition(50);
       displayHighScorePosition("Percy", highScorePosition);

        }
        public static void displayHighScorePosition(String playerName, int highScorePosition ){
            System.out.println(playerName + " managed to get into position "
            + highScorePosition + " on the high score table.");
            }
        public static int calculatehighScorePosition(int playerScore){
            if(playerScore > 1000){  
                return 1;
            }else if(playerScore > 500 && playerScore < 1000){
                return 2;
            }else if(playerScore > 100 && playerScore <500){
                return 3;
            }else{
                return 4;
            }
            
        }
        }

    