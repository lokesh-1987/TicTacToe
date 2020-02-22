package com.kata.tictactoe;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class TicTacToeBoardTest {

    @Test
    public void ticTacToeBoardShouldReturnRowLength5AfterInitialization(){
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        Assert.assertThat(ticTacToeBoard.board.length, Is.is(5));
    }
}
