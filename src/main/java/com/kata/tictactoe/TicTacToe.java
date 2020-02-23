package com.kata.tictactoe;

class TicTacToe {

    private static final String GAME_IS_CONTINUE = "Game is Continue!";
    private static final String GAME_IS_DRAW = "Game is draw!";
    private TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

    String playTicTacToeGame(int row, int col, char player) {
        if(ticTacToeBoard.isInvalidPosition(row,col)){
            return "Invalid Position";
        }
        ticTacToeBoard.setValue(row, col, player);
        if(ticTacToeBoard.isBoardFull()) {
            return GAME_IS_DRAW;
        }
        return GAME_IS_CONTINUE;
    }
}
