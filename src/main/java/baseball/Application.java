package baseball;

import baseball.src.controller.GameController;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        GameController game = new GameController();
        game.startGame();
    }
}
