package sudoku_validator;

import org.junit.jupiter.api.Test;
import org.testng.annotations.Ignore;

import static org.junit.jupiter.api.Assertions.*;
import static sudoku_validator.SudokuValidator.*;

public class SudokuValidatorTest {

    int [][] sudoku = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
    };

    int [][] hard_sudoku = {
        {5, 1, 2, 3, 9, 8, 4, 6, 7},
        {2, 7, 8, 9, 6, 5, 1, 3, 4},
        {1, 6, 7, 8, 5, 4, 9, 2, 3},
        { 8, 4, 5, 6, 3, 2, 7, 9, 1},
        { 3, 8, 9, 1, 7, 6, 2, 4, 5},
        { 4, 9, 1, 2, 8, 7, 3, 5, 6},
        { 9, 5, 6, 7, 4, 3, 8, 1, 2},
        { 6, 2, 3, 4, 1, 9, 5, 7, 8},
        { 7, 3, 4, 5, 2, 1, 6, 8, 9}
    };

    SudokuValidator simpleSudoku = new SudokuValidator(sudoku);
    SudokuValidator hardSudoku = new SudokuValidator(hard_sudoku);


//    @Test
//    void testLineValidator() {
//
//        int [] horizontalLine = {5, 3, 4, 6, 7, 8, 9, 1, 2};
//        assertTrue(validateLine(horizontalLine));
//
//        horizontalLine = new int[] {6, 7, 2, 1, 9, 5, 3, 4, 8};
//        assertTrue(validateLine(horizontalLine));
//
//        horizontalLine = new int[] {1, 7, 2, 1, 9, 5, 3, 4, 9};
//        assertFalse(validateLine(horizontalLine));
//
//        horizontalLine = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
//        assertFalse(validateLine(horizontalLine));
//
//        horizontalLine = new int[] {};
//        assertFalse(validateLine(horizontalLine));
//
//        horizontalLine = new int[] {1, 7, 2, 1, 9, 5, 3, 4, 9, 6, 7, 2, 1, 9, 5, 3, 4, 8};
//        assertFalse(validateLine(horizontalLine));
//
//        horizontalLine = null;
//        assertFalse(validateLine(horizontalLine));
//    }

    @Test
    @Ignore
    void exampleTest() {

        assertTrue(simpleSudoku.check());
        assertFalse(hardSudoku.check());

        sudoku[0][0]++;
        sudoku[1][1]++;
        sudoku[0][1]--;
        sudoku[1][0]--;

        assertFalse(simpleSudoku.check());

        sudoku[0][0]--;
        sudoku[1][1]--;
        sudoku[0][1]++;
        sudoku[1][0]++;

        sudoku[4][4] = 0;

        assertFalse(simpleSudoku.check());
    }

}
