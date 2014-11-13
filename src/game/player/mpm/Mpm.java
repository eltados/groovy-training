package game.player.mpm;

import game.player.Player;

class Mpm implements Player {

	@Override
  public boolean betrays() {
		return true;
	}

	@Override
  public String getName() {
		return "MPM";
	}

	@Override
	public void setLastOtherPlayerResponse( boolean betrays ) {
		// I don't care !
	}

}
