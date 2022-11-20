package bridge.view;

import bridge.domain.Player;
import bridge.domain.Result;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    public void printMap(Result result) {
        System.out.println(result.makeUpStairsMessage());
        System.out.println(result.makeDownStairsMessage());
    }


    public void printStartMessage() {
        System.out.println("다리 건너기 게임을 시작합니다.\n");
    }

    public void printInputLengthMessage() {
        System.out.println("다리의 길이를 입력해주세요.");
    }

    public void printSelectDirectionMessage() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
    }
}
