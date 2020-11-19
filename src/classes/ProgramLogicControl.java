package classes;

import java.util.Scanner;
import interfaces.StickGame;

public class ProgramLogicControl {
    private static ConsoleOutput console = new ConsoleOutput();
    private static ComputerLogic computer = new ComputerLogic();
    private static int sticksNum = StickGame.STICK_NUM;
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
            while(true){
                computerMove();
                if (isOneStickOnTAble(sticksNum)) {
                    console.printLoseOutMessage();
                    break;
                }
                playerMove();
            }
    }

    private static void computerMove(){
        int computerSticksNumForMove = 0;

        console.printStickNumber(sticksNum);
        computerSticksNumForMove = computer.calcSticksNumForMove(sticksNum);
        console.printComputerSticksNumber(computerSticksNumForMove);

        sticksNum-=computerSticksNumForMove;
    }

    private static void playerMove() {
        int playerStickSNumForMove = 0;

        while(true) {
            console.printStickNumber(sticksNum);
            console.printPlayerMoveMessage();

            playerStickSNumForMove = s.nextInt();
            if (isValidSticksNumForMove(playerStickSNumForMove)) {
                sticksNum -= playerStickSNumForMove;
                break;
            } else {
                console.printIncorrectStickNumberMessage();
                continue;
            }
        }

    }

    private static boolean isValidSticksNumForMove(int sticksNum){
            if ((sticksNum > 3)||(sticksNum < 1)) {
                return false;
            }
            return true;
    }

    private static boolean isOneStickOnTAble(int sticksNum){
        if (sticksNum == 1) {
            return true;
        }
        return false;
    }
}


