package com.gordonreid.adventofcode2021.december04;

import com.gordonreid.adventofcode2021.helpers.ListHelpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class BingoBoard {
    private final List<List<Cell>> board;

    public BingoBoard() {
        this.board = new ArrayList<>();
    }

    public void addRow(List<Cell> row) {
        board.add(row);
    }

    public void mark(int number) {
        board.forEach(row -> row.stream()
                .filter(cell -> cell.getNumber() == number)
                .forEach(Cell::pick));
    }

    public List<Integer> unpickedNumbers() {
        return board.stream()
                .flatMap(Collection::stream)
                .filter(Cell::notPicked)
                .map(Cell::getNumber)
                .collect(Collectors.toList());
    }

    public boolean hasWon() {
        boolean rowWon = board.stream().anyMatch(row -> row.stream().allMatch(Cell::picked));
        boolean columnWon = ListHelpers.transpose(board).stream().anyMatch(row -> row.stream().allMatch(Cell::picked));
        return rowWon || columnWon;
    }

    public boolean notWon() {
        return !hasWon();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (List<Cell> row : board) {
            for (Cell cell : row) {
                builder.append(cell.picked()).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

}
