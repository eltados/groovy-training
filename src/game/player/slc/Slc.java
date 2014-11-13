package game.player.slc;

import game.player.Player;

class Slc implements Player {

	@Override
  public boolean betrays() {
		return false;
	}

	@Override
	public String getName() {
		return "SLC";
	}

	@Override
	public void setLastOtherPlayerResponse( boolean betrays ) {
		// I don't care !
	}

}
