package examples.singleton;

// Singleton exercice correction
public class Game {

    // Singleton static instance
    private static Game instance;

    // private constructor to prevent instantiation
    private Game() {

    }

    // Static method to get the singleton instance
    public static Game getInstance(){
        // lazy initialization: create the instance only when it is needed
        if(Game.instance == null){
            Game.instance = new Game();
        }
        return Game.instance;
    }
}
