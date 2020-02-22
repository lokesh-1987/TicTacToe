package com.kata.tictactoe;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeBoardTest {

    @Test
    public void ticTacToeBoardShouldReturnRowLength5AfterInitialization(){
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        assertThat(ticTacToeBoard.board.length, is(5));
    }
}
