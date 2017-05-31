/*
*	Changed things, and compiled them from the one driver class. 
*	This is super simple now and must save much time.
*/

public class OldMacDriver {
	public static void main (String[] args) {
		OldMacCow maudine = new OldMacCow();
		OldMacCow pauline = new OldMacCow();
		maudine.moo();
		pauline.moo();

		OldMacDuck ferdinand = new OldMacDuck();
		ferdinand.quack();
	}
}
