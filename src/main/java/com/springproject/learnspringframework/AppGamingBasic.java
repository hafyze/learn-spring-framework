package com.springproject.learnspringframework;

import com.springproject.learnspringframework.game.GameRunner;
import com.springproject.learnspringframework.game.MarioGame;

public class AppGamingBasic{
    public static void main(String[] args) {
        
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}