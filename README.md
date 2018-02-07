# CheckerBoardGame Data Model Proposition

## Supporting Classes
Four additional files are required to provide an effective data model for the checkers game:
* PieceColor.java
* PlayerType.java
* Player.java
* CheckerPiece.java

### PieceColor.java
```java
public enum PieceColor {
    LIGHT, DARK
}
```
The point of this file, is to enumerate the two piece colors we have: light and dark.

### PlayerType.java
```java
public enum PlayerType {
    HUMAN, AI
}
```
Similarly to PieceColor, this file enumerates the two *types* of players there are: human or AI.

### Player.java
```java
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
```
This is our player class which contains information about the person playing that particular color of pieces. Note that `PlayerType type` and `PieceColor color` are declared `final`. This is because a player will not go from being human to AI in the middle of a game, nor will their piece color change. Getters are provided for all instance variables, and a setter is provided for name (in case a player chooses to change their name displayed mid-game).
