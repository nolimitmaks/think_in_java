package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;


class Game {
    Game(int i) {

        print("Game constructor");
    }
}
class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        print("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    public Chess() {
        super(11);
        print("Chess constructor");
    }
}

