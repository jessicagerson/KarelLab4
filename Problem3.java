 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        moveAlongWall();
        
        finish();
    }
    public void moveAlongWall(){
        while ((frontIsClear() && checkRightSide())==true){
            move();
            
            
            if (!frontIsClear() && checkRightSide()==true){
                turnLeft();
            }
            else{
                
                //
            }
        }
    }
  
    public void finish(){
        turnOff();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public boolean checkRightSide(){
        turnRight();
        if (!frontIsClear()){
            turnLeft();
            return true;
        }
        else{
            
            turnLeft();
            return false;
        }
    }
}

