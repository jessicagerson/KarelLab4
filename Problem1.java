
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
  
    public void escapeRoom() {
        findWall();
        moveAlongWall();
        exitRoom();
    }
   public void findWall(){
       while (frontIsClear()){
           move();
        }
       turnLeft();
    }
    public void moveAlongWall(){
        
        while ((frontIsClear() && checkRightSide())==true){
            move();
            if (!frontIsClear()){
                turnLeft();
            }
            else{
                
                //
            }
        }
      
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void exitRoom(){
        if (frontIsClear()){
            move();
        }
        else{
            //
        }
    }
    public boolean checkRightSide(){
        turnRight();
        if (!frontIsClear()){
            turnLeft();
            return true;
        }
        else{
            return false;
        }
    }
}

