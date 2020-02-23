package com.kata.tictactoe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeTest {

    private static final String GAME_IS_CONTINUE = "Game is Continue!";

    @Test
    public void ticTacToeShouldReturn_ContinueMessage_IfPlayer_X_MovesOn_0_0_Position() {
        TicTacToe ticTacToe = new TicTacToe();
        assertThat(ticTacToe.playTicTacToeGame(0,0,'X'), is(GAME_IS_CONTINUE));
    }

    @Test
    public void ticTacToeShouldReturn_ContinueMessage_IfPlayerXGoesFirstOn_0_0_And_Player_O_Makes2ndMoveOn_0_2_Position() {
        TicTacToe ticTacToe = new TicTacToe();
        assertThat(ticTacToe.playTicTacToeGame(0,0,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(0,2,'0'), is(GAME_IS_CONTINUE));
    }
}
