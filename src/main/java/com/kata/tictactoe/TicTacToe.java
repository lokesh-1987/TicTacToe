package com.kata.tictactoe;

class TicTacToe {

    private static final String GAME_IS_CONTINUE = "Game is Continue!";
    private static final String GAME_IS_DRAW = "Game is draw!";
    private static final String INVALID_POSITION = "Invalid Position";
    private TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

    String playTicTacToeGame(int row, int col, char player) {
        if(ticTacToeBoard.isInvalidPosition(row,col)){
            return INVALID_POSITION;
        }
        ticTacToeBoard.setValue(row, col, player);
        if(ticTacToeBoard.isBoardFull()) {
            return GAME_IS_DRAW;
        }
        return GAME_IS_CONTINUE;
    }
}
