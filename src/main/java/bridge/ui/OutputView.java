package bridge.ui;

import bridge.model.Answer;
import bridge.model.Bridge;
import bridge.model.Direction;
import bridge.model.GameMessage;
import bridge.model.Result;
import java.util.List;

public class OutputView {

    public void printMap(List<Answer> upperBridge, List<Answer> downBridge) {
        printEachBridge(upperBridge);
        printEachBridge(downBridge);
        System.out.println();
    }

    public void printResult(Result isSuccess, int totalTry) {
        System.out.println(GameMessage.IS_SUCCESS.getOutput()
                + isSuccess.getOutput());
        System.out.print(GameMessage.TOTAL_TRY.getOutput()
        + totalTry);
    }

    private void printEachBridge(List<Answer> bridge){
        StringBuilder result = new StringBuilder();
        result.append(Bridge.START.getView());
        bridge.forEach(answer -> {
                    result.append(answer.getOutput());
                    result.append(Bridge.MID.getView());
                }
                );
        result.append(Bridge.END.getView());
        System.out.println(result);
    }

}
