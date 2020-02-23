package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeTest {

    private static final String GAME_IS_CONTINUE = "Game is Continue!";
    private TicTacToe ticTacToe;

    @Before
    public void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test
    public void ticTacToeShouldReturn_ContinueMessage_IfPlayer_X_MovesOn_0_0_Position() {
        assertThat(ticTacToe.playTicTacToeGame(0,0,'X'), is(GAME_IS_CONTINUE));
    }

    @Test
    public void ticTacToeShouldReturn_ContinueMessage_IfPlayerXGoesFirstOn_0_0_And_Player_O_Makes2ndMoveOn_0_2_Position() {
        assertThat(ticTacToe.playTicTacToeGame(0,0,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(0,2,'0'), is(GAME_IS_CONTINUE));
    }

    @Test
    public void ticTacToeShouldReturn_GameIsDrawMessage_ifThePlayersMoveAlternativelyUntilGameIsFinished() {
        assertThat(ticTacToe.playTicTacToeGame(0,0,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(0,2,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(0,4,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,0,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,2,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,4,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,2,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,0,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,4,'X'), is("Game is draw!"));
    }
}