package aaReplit_2_Statment;

public class blackJack {
    public static void main(String[] args) {
        /**
         *     if the card total is bigger then 21 the player busts.
         *     if the house score is bigger then the player, the player loses .
         *     if the player score is equal to the house then they are a draw.
         *     if the player score is bigger then the house the player wins.
         */
        int player = 8;
        int card = 21;
        if(player == card ){
            System.out.println("its a tie");
        }else if (player < card){
            System.out.println("player bust");
        }else if (player > card){
            System.out.println("player win");
        }else{
            System.out.println("player loss");
        }

    }
}
