package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

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

    @Test
    public void ticTacToeBoardShouldReturnTrueIfPositionIsAlreadyOccupied() {
        ticTacToeBoard.setValue(0,4,'X');
        assertTrue(ticTacToeBoard.isInvalidPosition(0, 4));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfRowAndColOutOfDefinedDimension() {
        assertTrue(ticTacToeBoard.isInvalidPosition(1, 6));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfEitherOfRowsAreFull() {
        ticTacToeBoard.setValue(2,0,'0');
        ticTacToeBoard.setValue(2,2,'0');
        ticTacToeBoard.setValue(2,4,'0');
        assertTrue(ticTacToeBoard.hasFullRowOfEitherXOr0('0'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfEitherOfColumnsAreFull() {
        ticTacToeBoard.setValue(0,0,'0');
        ticTacToeBoard.setValue(2,0,'0');
        ticTacToeBoard.setValue(4,0,'0');
        assertTrue(ticTacToeBoard.hasFullColumnOfEitherXOr0('0'));
    }

    @Test
    public void ticTacToeBoardShouldReturnTrueIfEitherOfDiagonalsAreFull() {
        ticTacToeBoard.setValue(0,4,'X');
        ticTacToeBoard.setValue(2,2,'X');
        ticTacToeBoard.setValue(4,0,'X');
        assertTrue(ticTacToeBoard.hasFullDiagonalOfEitherXOr0('X'));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfEitherOfRowsAreNotFull() {
        ticTacToeBoard.setValue(2,0,'0');
        ticTacToeBoard.setValue(2,4,'0');
        assertFalse(ticTacToeBoard.hasFullRowOfEitherXOr0('0'));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfEitherOfColumnsAreNotFull() {
        ticTacToeBoard.setValue(0,0,'0');
        ticTacToeBoard.setValue(4,0,'0');
        assertFalse(ticTacToeBoard.hasFullColumnOfEitherXOr0('0'));
    }

    @Test
    public void ticTacToeBoardShouldReturnFalseIfEitherOfDiagonalsAreNotFull() {
        ticTacToeBoard.setValue(0,4,'X');
        ticTacToeBoard.setValue(2,2,'X');
        assertFalse(ticTacToeBoard.hasFullDiagonalOfEitherXOr0('X'));
    }
}
