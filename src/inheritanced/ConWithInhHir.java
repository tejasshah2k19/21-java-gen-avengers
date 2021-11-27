package inheritanced;

public class ConWithInhHir {

	public static void main(String[] args) {
//		Game g = new Game(25);
		Pubg p = new Pubg(24);
	}
}

class Game {

//	Game() {
//		System.out.println("Game()");
//	}

	Game(int a) {
		// this();//default
		System.out.println("Game(int)");
	}

	void start() {
		System.out.println("Game::start()");
	}
}

class Pubg extends Game {
	Pubg() {
		super(2);
		System.out.println("Pubg()");
	}

	Pubg(int a) {
		super(9);
		System.out.println("Pubg(int)");
	}

	void start() {
		System.out.println("Pubg::start()");
	}
}
