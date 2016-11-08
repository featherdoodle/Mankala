/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mankala;

import java.util.Scanner;

/**
 *
 * @author SyBye8898
 */
public class Player {
    boolean turn;
    //variable for side of the board
    Board board = new Board();
    
    public Player(Board _board, boolean _turn){
        board = _board;
        turn = _turn;
    }
    
    public void move(){
        
        int input = inputMove();
        
        int pieces = board.board[input-1];
        board.board[input-1] = 0;
        for(int i = 0; i < pieces; i++){
            board.board[input+pieces] += 1;
            
        }
        board.printBoard();
    }
    
    public int inputMove(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter a move: ");
            String input = scan.nextLine();
            if(input.equalsIgnoreCase("A")){
                return 1;
            }else if(input.equalsIgnoreCase("B")){
                return 2;
            }else if(input.equalsIgnoreCase("C")){
                return 3;
            }else if(input.equalsIgnoreCase("D")){
                return 4;
            }else if(input.equalsIgnoreCase("E")){
                return 5;
            }else if(input.equalsIgnoreCase("F")){
                return 6;
            }else{
                System.out.print("Invalid. ");
            }
        }
    }
    
    public void flipBoard(){
        
    }
    
}
