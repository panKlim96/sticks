package classes;

public class ConsoleOutput {
    void printStickNumber(int sticksOnTable) {
        System.out.println(String.format("На столе осталось %d спичек", sticksOnTable) );
    }

    void printCompSticksNumber(int compSticksNumber) {
        System.out.println(String.format("На столе осталось %d спичек", compSticksNumber) );
    }

    void printComputerSticksNumber(int compSticksNum) {
        System.out.println(String.format("- Количество выбранных компьютером спичек = %d", compSticksNum));
    }

    void printPlayerMoveMessage(){
        System.out.print(String.format("- Ход игрока. Введите количество спичек: "));
    }

    void printIncorrectStickNumberMessage(){
        System.out.println("Некорректное количество спичек!");
    }

    void printLoseOutMessage(){
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }
}
