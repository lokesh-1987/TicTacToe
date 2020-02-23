package com.kata.tictactoe;

class TicTacToe {

    private static final String GAME_IS_CONTINUE = "Game is Continue!";
    private static final String GAME_IS_DRAW = "Game is draw!";
    private static final String INVALID_POSITION = "Invalid Position";
    private static final String PLAYER = "Player ";
    private static final String WON = " Won!";
    private TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

    String playTicTacToeGame(int row, int col, char player) {
        if(ticTacToeBoard.isInvalidPosition(row,col)){
            return INVALID_POSITION;
        }
        ticTacToeBoard.setValue(row, col, player);
        if(ticTacToeBoard.isBoardFull()) {
            return GAME_IS_DRAW;
        } else if (ticTacToeBoard.hasFullRowOfEitherXOr0(player)
                || ticTacToeBoard.hasFullColumnOfEitherXOr0(player)
                || ticTacToeBoard.hasFullDiagonalOfEitherXOr0(player)) {
            return PLAYER +player+ WON;
        }
        return GAME_IS_CONTINUE;
    }
}
