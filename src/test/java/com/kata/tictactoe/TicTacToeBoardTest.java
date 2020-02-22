package com.kata.tictactoe;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeBoardTest {

    private static final int FIVE = 5;

    @Test
    public void ticTacToeBoardShouldReturnRowLength5AfterInitialization(){
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        assertThat(ticTacToeBoard.board.length, is(FIVE));
    }

    @Test
    public void ticTacToeBoardShouldReturnColumnLength5AfterInitialization() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        assertThat(ticTacToeBoard.board[0].length, is(FIVE));
    }
}
