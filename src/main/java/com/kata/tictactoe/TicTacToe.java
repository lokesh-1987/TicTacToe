package com.kata.tictactoe;

class TicTacToe {

    private static final String GAME_IS_CONTINUE = "Game is Continue!";
    private TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

    String playTicTacToeGame(int row, int col, char player) {
        ticTacToeBoard.setValue(row, col, player);
        if(ticTacToeBoard.isBoardFull()) {
            return "Game is draw!";
        }
        return GAME_IS_CONTINUE;
    }
}
