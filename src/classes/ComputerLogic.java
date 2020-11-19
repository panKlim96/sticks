package classes;

import interfaces.StickGame;

import java.util.ArrayList;
import java.util.List;

public class ComputerLogic implements StickGame {
    private List<Integer> victoriusNumbersList = new ArrayList<Integer>();
    public ComputerLogic() {
        calcVictoriusNumbers();
    }
    private void calcVictoriusNumbers(){
        int count = 0;
        int curNumber;
        while(true) {
            curNumber = 1 + count * (StickGame.MAX_STICKS_FOR_MOVE + 1);
            if (curNumber < StickGame.STICK_NUM) {
                victoriusNumbersList.add(count, curNumber);
            }
            else {
                break;
            }
            count++;
        }
    }

    @Override
    public int calcSticksNumForMove(int curStickNumberOnTable){
        int sd =victoriusNumbersList.size();
        int sticksForMove = curStickNumberOnTable - victoriusNumbersList.get(victoriusNumbersList.size() - 1);
        victoriusNumbersList.remove(victoriusNumbersList.size() - 1);
        return sticksForMove;
    }

}
