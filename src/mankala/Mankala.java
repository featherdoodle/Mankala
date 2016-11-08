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
public class Mankala {

    Board board = new Board();
    
    Player playerOne = new Player(board, true);
    Player playerTwo = new Player(board, false);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    
    public void step(){
        if(playerOne.turn){
            playerOne.move();
            playerOne.turn = false;
        }else if(playerTwo.turn){
            playerTwo.move();
            playerTwo.turn = false;
        }
    }
    
    
}
