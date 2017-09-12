
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        
        moveAlongWall();
        finish();
       
    }
    public void moveAlongWall(){
        while (checkLeftSide() && frontIsClear() == true){
            putBeeper();
            move();
            if (!checkLeftSide() && frontIsClear() == true){
                turnAroundCorner();
                move();
            }
            if (checkLeftSide() && !frontIsClear() == true){
                turnRight();
            }
            if (nextToABeeper()){
                finish();
            }
        }
        
    }
    public boolean checkLeftSide(){
        turnLeft();
        if (!frontIsClear()){
            turnRight();
            return true;
        }
        else{
            turnRight();
            return false;
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void finish(){
       //
       turnOff();
    }
    public void turnAroundCorner(){
        
        turnLeft();
        move();
        turnLeft();
    }
}

