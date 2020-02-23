package com.kata.tictactoe;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void ticTacToeShouldReturn_ContinueMessage_IfPlayer_X_MovesOn_0_0_Position() {
        TicTacToe ticTacToe = new TicTacToe();
        Assert.assertThat(ticTacToe.playTicTacToeGame(0,0,'X'), Is.is("Game is Continue!"));
    }
}
