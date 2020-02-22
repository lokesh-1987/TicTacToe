package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class TicTacToeBoardTest {

    private static final int FIVE = 5;
    private TicTacToeBoard ticTacToeBoard;
    private char [][] board = {{' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '}};
    @Before
    public void setUp() {
        ticTacToeBoard = new TicTacToeBoard();
    }

    @Test
    public void ticTacToeBoardShouldReturnRowLength5AfterInitialization(){
        assertThat(ticTacToeBoard.board.length, is(FIVE));
    }

    @Test
    public void ticTacToeBoardShouldReturnColumnLength5AfterInitialization() {
        assertThat(ticTacToeBoard.board[0].length, is(FIVE));
    }

    @Test
    public void ticTacToeBoardShouldReturnValidBoardOnceSetUp() {
        ticTacToeBoard.setUpBoard();
        assertArrayEquals(ticTacToeBoard.board, this.board);
    }

    @Test
    public void ticTacToeBoardShouldSetAndGetValueOnBoard() {
        ticTacToeBoard.setValue(2,2,'X');
        assertThat(ticTacToeBoard.getValue(2, 2), is('X'));
    }

}
