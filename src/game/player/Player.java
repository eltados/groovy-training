package game.player;


public interface Player {

	public boolean betrays();

	public String getName();

	public void setLastOtherPlayerResponse( boolean betrays );

}
