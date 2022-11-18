package bridge.ui;


import bridge.model.GameMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public void startGame(){
        printStartMessage();
        System.out.println();
    }
    public String readBridgeSize() {
        printSizeMessage();
        return getInput();
    }

    public String readMoving() {
        printGetMoveMessage();
        return getInput();
    }

    public String readGameCommand() {
        printGetRestartMessage();
        return getInput();
    }

    private void printStartMessage(){
        System.out.println(GameMessage.START_GAME.getOutput());
    }

    private void printSizeMessage(){
        System.out.println(GameMessage.GET_SIZE.getOutput());
    }

    private void printGetMoveMessage(){
        System.out.println(GameMessage.GET_DIRECTION.getOutput());
    }

    private void printGetRestartMessage(){
        System.out.println(GameMessage.GET_RESTART.getOutput());
    }

    private String getInput(){
        return Console.readLine();
    }
}
