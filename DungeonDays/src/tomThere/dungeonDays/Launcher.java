package tomThere.dungeonDays;

public class Launcher{
	public static final String VERSION = "A0.0";
	public static void main(String[] args){
		Main game = new Main(largs(args));
		game.start();
		game.play();
		game.stop();
	}
	
	private static LauncherArguments largs(String[] args){
		LauncherArguments largs  = new LauncherArguments(VERSION);
		//BLABLABLA INSERT LAUNCHER ARGUMENTS HERE:
		
		//STOP INSERTING
		return largs;
	}
}