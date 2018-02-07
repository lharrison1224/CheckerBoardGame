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
public class CheckersDataModel {
    private final Player lightPlayer;
    private final Player darkPlayer;
    private PieceColor playerToMove = PieceColor.DARK;
    private int numberOfTurns = 0; 
    private final CheckerPiece[][] gameBoard = new CheckerPiece[8][8];
    
    public CheckersDataModel(Player lightPlayer, Player darkPlayer){
        this.lightPlayer = lightPlayer;
        this.darkPlayer = darkPlayer;
        initializeGameBoardArray();
    }
    
    public PieceColor getPlayerToMove(){
        return playerToMove;
    }
    
    public Player getLightPlayer(){
        return lightPlayer;
    }
    
    public Player getDarkPlayer(){
        return darkPlayer;
    }
    
    public int getNumberOfTurns(){
        return numberOfTurns;
    }
    
    public void incrementTurns(){
        numberOfTurns++;
    }
    
    public void togglePlayerToMove(){
        playerToMove = playerToMove == PieceColor.DARK ? PieceColor.LIGHT : PieceColor.DARK;
    }
    
    public CheckerPiece getPiece(int row, int col){
        return gameBoard[row][col];
    }
    
    public void removePiece(int row, int col){
        gameBoard[row][col] = null;
    }
    
    public void movePiece(int fromRow, int fromCol, int toRow, int toCol){
        CheckerPiece tmp = gameBoard[fromRow][fromCol];
        tmp.setRow(toRow);
        tmp.setCol(toCol);
        gameBoard[toRow][toCol] = tmp;
        gameBoard[fromRow][fromCol] = null;
    }
    
    public void kingPiece(int row, int col){
        CheckerPiece tmp = gameBoard[row][col];
        tmp.king();
    }
    
    private void initializeGameBoardArray(){
        for(int row = 0; row < 8; row ++){
            switch (row) {
                case 0:
                case 2:
                    for(int col = 1; col <= 7; col+=2){
                        gameBoard[row][col] = new CheckerPiece(row, col, PieceColor.DARK);
                    }
                    break;
                case 1:
                    for(int col = 0; col <= 6; col+=2){
                        gameBoard[row][col] = new CheckerPiece(row, col, PieceColor.DARK);
                    }
                    break;
                case 5:
                case 7:
                    for(int col = 0; col <= 6; col+=2){
                        gameBoard[row][col] = new CheckerPiece(row, col, PieceColor.LIGHT);
                    }
                    break;
                case 6:
                    for(int col = 1; col <= 7; col+=2){
                        gameBoard[row][col] = new CheckerPiece(row, col, PieceColor.LIGHT);
                    }
                    break;
                default:
                    break;
            }
        }
    }
    
}
