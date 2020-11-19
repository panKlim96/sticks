package interfaces;

public interface StickGame {
    int STICK_NUM = 20;
    int MAX_STICKS_FOR_MOVE = 3;

    int calcSticksNumForMove(int curStickNumbers);
}
