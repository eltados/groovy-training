package game

import game.player.Player;
import game.player.mpm.Mpm2
import game.player.slc.Slc

slc = new Slc()
mpm = new Mpm2()
e = 	new  GameEngine(slc , mpm) ;

100.times { e.play() }
println e.getResult();