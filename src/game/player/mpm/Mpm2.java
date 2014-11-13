package game.player.mpm;

import java.util.Random;

import game.player.Player;

class Mpm2 implements Player {

	@Override
  public boolean betrays() {
		return Math.abs( new Random().nextInt() % 2 ) == 0;
	}

	@Override
  public String getName() {
		return "MPM2";
	}

	@Override
	public void setLastOtherPlayerResponse( boolean betrays ) {
		// I don't care !
	}

}
