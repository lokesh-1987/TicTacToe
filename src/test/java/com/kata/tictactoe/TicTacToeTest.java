package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeTest {

    private static final String GAME_IS_CONTINUE = "Game is Continue!";
    private static final String GAME_IS_DRAW = "Game is draw!";
    private static final String INVALID_POSITION = "Invalid Position";
    private static final String PLAYER_X_WON = "Player X Won!";
    private static final String PLAYER_0_WON = "Player 0 Won!";
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
        assertThat(ticTacToe.playTicTacToeGame(4,4,'X'), is(GAME_IS_DRAW));
    }

    @Test
    public void ticTacToeShouldReturn_InvalidPositionMessage_IfEitherPlayerPlaysOnOccupiedPosition() {
        assertThat(ticTacToe.playTicTacToeGame(0,2,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(0,2,'0'), is(INVALID_POSITION));
    }

    @Test
    public void ticTacToeShouldReturn_InvalidPositionMessage_IfPosition_6_2_EnteredByEitherPlayerIsOutOfDefinedDimension() {
        assertThat(ticTacToe.playTicTacToeGame(6,2,'0'), is(INVALID_POSITION));
    }

    @Test
    public void ticTacToeShouldReturn_WinningMessage_IfPlayerXCompletesFirstRow() {
        assertThat(ticTacToe.playTicTacToeGame(0,0,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,2,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(0,4,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,0,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(0,2,'X'), is(PLAYER_X_WON));
    }

    @Test
    public void ticTacToeShouldReturn_WinningMessage_IfPlayerOCompletesBottomRow() {
        assertThat(ticTacToe.playTicTacToeGame(0,0,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,2,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(0,4,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,0,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,4,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,4,'0'), is(PLAYER_0_WON));
    }

    @Test
    public void ticTacToeShouldReturn_WinningMessage_IfPlayerXCompletesMidRow() {
        assertThat(ticTacToe.playTicTacToeGame(2,0,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,2,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,4,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,0,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,2,'X'), is(PLAYER_X_WON));
    }

    @Test
    public void ticTacToeShouldReturn_WinningMessage_IfPlayerXCompletesFirstColumn() {
        assertThat(ticTacToe.playTicTacToeGame(0,0,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,2,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,0,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,2,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,0,'X'), is(PLAYER_X_WON));
    }

    @Test
    public void ticTacToeShouldReturn_WinningMessage_IfPlayerXCompletesMiddleColumn() {
        assertThat(ticTacToe.playTicTacToeGame(0,2,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(0,0,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,2,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,4,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,2,'X'), is(PLAYER_X_WON));
    }

    @Test
    public void ticTacToeShouldReturn_WinningMessage_IfPlayerXCompletesLastColumn() {
        assertThat(ticTacToe.playTicTacToeGame(0,4,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(0,0,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,4,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,2,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,4,'X'), is(PLAYER_X_WON));
    }

    @Test
    public void ticTacToeShouldReturn_WinningMessage_IfPlayerXCompletesFirstDiagonal() {
        assertThat(ticTacToe.playTicTacToeGame(0,4,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(0,0,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,2,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,2,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,0,'X'), is(PLAYER_X_WON));
    }

    @Test
    public void ticTacToeShouldReturn_WinningMessage_IfPlayerXCompletesSecondDiagonal() {
        assertThat(ticTacToe.playTicTacToeGame(0,0,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,0,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(2,2,'X'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,2,'0'), is(GAME_IS_CONTINUE));
        assertThat(ticTacToe.playTicTacToeGame(4,4,'X'), is(PLAYER_X_WON));
    }
}
