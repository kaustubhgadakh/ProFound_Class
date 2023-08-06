/*
    1. Write class game{ }
    class boardgame extends game{ }
    class chess extends boardgame{ }
    class gamedemo{
    public static void main(String[] args) {
    chess ch=new chess(); }
    }
    (Note: Write only default constructors in each class with specific information . See
    the order of constructors invoked when chess object is created)

 */
class Game {
    public Game() {
        System.out.println("Default constructor of Game");
    }
}

class BoardGame extends Game {
    public BoardGame() {
        System.out.println("Default constructor of BoardGame");
    }
}

class Chess extends BoardGame {
    public Chess() {
        System.out.println("Default constructor of Chess");
    }
}

public class Que1 {
    public static void main(String[] args) {
        Chess ch = new Chess();
    }
}

