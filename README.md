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

### CheckerPiece.java
```java
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
```
This class defines what important characteristics each individual piece will have. Each piece will have a row and a column attributed to it, which signifies where it is sitting in the game board array. It is important to save this information in this object because when a user clicks on this object in the UI, we need to have direct access to its location. Without storing this, you would have to search the array for this object to get its location. This class also keeps track of its color and whether or not the piece has "king" status.
