/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mankala;

/**
 *
 * @author SyBye8898
 */
public class Board {
    
    int[] board = new int[14];
    
    public Board(){
        //int i : board[0] issue with the loop
        for(int i = 0; i < 6; i++){
            board[i] = 3;
        }
        for(int i = 8; i < 13; i++){
            board[i] = 3;
        }
        printBoard();    
    }
    
    public void printBoard(){
        System.out.print(" ");
        for(int i = 0; i < 6; i++){
            System.out.print(board[i] + " ");
        }
        System.out.println();
        System.out.println(board[7] + "            " + board[14]);
        System.out.print(" ");
        for(int i = 8; i < 13; i++){
            System.out.print(board[i] + " ");
        }
        System.out.println();
        System.out.println(" A B C D E F  ");
    }
    
}
