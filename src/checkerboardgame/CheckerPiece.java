/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboardgame;

/**
 *
 * @author loganharrison
 */
public class CheckerPiece {
    private int row;
    private int col;
    private final PieceColor color;
    private boolean isKing = false;
    
    public CheckerPiece(int row, int col, PieceColor color){
        this.row = row;
        this.col = col;
        this.color = color;
    }
    
    public PieceColor getColor(){
        return color;
    }
    
    public int getRow(){
        return row;
    }
    
    public int getCol(){
        return col;
    }
    
    public void setRow(int row){
        this.row = row;
    }
    
    public void setCol(int col){
        this.col = col;
    }
   
    public void king(){
        this.isKing = true;
    }
    
    public boolean isKinged(){
        return isKing;
    }
}
