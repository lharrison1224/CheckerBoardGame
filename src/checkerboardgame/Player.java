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
public class Player {
    private String name;
    private final PlayerType type;
    private final PieceColor color;
    
    public Player(String name, PlayerType type, PieceColor color){
        this.name = name;
        this.type = type;
        this.color = color;
    }
    
    public String getName(){
        return name;
    }
    
    public PlayerType getType(){
        return type;
    }
    
    public PieceColor getColor(){
        return color;
    }
    
    public void setName(String name){
        this.name = name;
    }
}
