package com.kata.tictactoe;

class TicTacToeBoard {
    char[][] board;

    TicTacToeBoard() {
        board = new char[5][5];
    }

    void setUpBoard() {
        this.board = new char[][]{{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
    }

    void setValue(int row, int col, char value) {
        this.board[row][col] = value;
    }

    char getValue(int row, int col) {
        return this.board[row][col];
    }

    boolean isInvalidPosition(int row, int col) {
        return isRowAndColOutOfDefinedDimension(row, col)
                || isPositionAlreadyOccupied(row, col)
                || isPlusMinusAndPipeSymbolsUsedWhileSetUpBoard(row, col);
    }

    private boolean isPlusMinusAndPipeSymbolsUsedWhileSetUpBoard(int row, int col) {
        return getValue(row, col) == '+'
                || getValue(row, col) == '-'
                || getValue(row, col) == '|';
    }

    private boolean isRowAndColOutOfDefinedDimension(int row, int col) {
        return (row < 0 || row > 4) || (col < 0 || col > 4);
    }

    private boolean isPositionAlreadyOccupied(int row, int col) {
        return getValue(row, col) == 'X' || getValue(row, col) == '0';
    }

    boolean hasFullRowOfEitherXOr0(char value) {
        return ((getValue(0,0) == value && getValue(0,2) == value && getValue(0,4) == value)
                || (getValue(2,0) == value  && getValue(2,2) == value && getValue(2,4) == value)
                || (getValue(4,0) == value  && getValue(4,2) == value && getValue(4,4) == value));
    }

    boolean hasFullColumnOfEitherXOr0(char value) {
        return ((getValue(0,0) == value && getValue(2,0) == value && getValue(4,0) == value)
                || (getValue(0,2) == value  && getValue(2,2) == value && getValue(4,2) == value)
                || (getValue(0,4) == value  && getValue(2,4) == value && getValue(4,4) == value));
    }

    boolean hasFullDiagonalOfEitherXOr0(char value) {
        return ((getValue(0,0) == value && getValue(2,2) == value && getValue(4,4) == value)
                || (getValue(0,4) == value  && getValue(2,2) == value && getValue(4,0) == value));
    }

    boolean isBoardFull() {
        for (int i = 0; i < board.length; i+=2) {
            for (int j = 0; j < board[i].length; j+=2) {
                if (getValue(i, j) != 'X' && getValue(i, j) != '0') {
                    return false;
                }
            }
        }
        return true;
    }

    void displayBoard() {
        for (char[] row : this.board){
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
