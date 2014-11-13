package game;

import game.player.Player;


public class GameEngine {

	private p1JailTime = 0
	private p2JailTime = 0
	private Player p1
	private Player p2

	public GameEngine( Player p1 , Player p2){
		this.p1 = p1
		this.p2 = p2
	}

	public void play(){
		boolean p1B = p1.betrays();
		boolean p2B = p2.betrays();

		p1.setLastOtherPlayerResponse(p2B);
		p2.setLastOtherPlayerResponse(p1B);

		print "${p1.name} ${toEnglish(p1B)} , ${p2.name} ${toEnglish(p2B)} => "

		if(p1B  && p2B  ){
			p1JailTime += 2
			p2JailTime += 2

			println " +2 for ${p1.name}, +2 for  ${p2.name}"
		}
		if(p1B  && !p2B  ){
			p1JailTime += 0
			p2JailTime += 3

			println " +0 for ${p1.name}, +3 for  ${p2.name}"
		}
		if(!p1B  && p2B  ){
			p1JailTime += 3
			p2JailTime += 0

			println " +3 for ${p1.name}, +0 for  ${p2.name}"
		}
		if(!p1B  && !p2B  ){
			p1JailTime += 1
			p2JailTime += 1
			println " +1 for ${p1.name}, +1 for  ${p2.name}"
		}
	}

	public String getResult( ){
		if(p1JailTime  ==  p2JailTime)
			return "The players are equals => ${p1JailTime}"

		if (p1JailTime  >  p2JailTime ){
			return "${p2.name} wins with => ${p2JailTime} , ${p1.name} looses with => ${p1JailTime} "
		}else{
			return "${p1.name} wins with => ${p1JailTime} , ${p2.name} looses with => ${p2JailTime} "
		}
	}

	private static String toEnglish( boolean b){
		return b ? "betrays" : "stays silent"
	}
}

