import Game.Direction;
import Game.GameBoard;

import java.util.Scanner;

public class Main {
    static GameBoard game = new GameBoard();
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        print();
        for(;;){
            String input = scanner.nextLine();
            Direction direction = Direction.UP;
            switch (input){
                case "1":
                    direction = Direction.UP;
                    break;
                case "2":
                    direction = Direction.DOWN;
                    break;
                case "3":
                    direction = Direction.LEFT;
                    break;
                case "4":
                    direction = Direction.RIGHT;
                    break;
            }
            game.move(direction);
            print();
            System.out.println(game.getPoints());
        }
    }
    public static void print(){
        for(int[] i:game.getBoard()){
            for(int j:i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
