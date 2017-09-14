 
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
        findWall();
        while (!nextToABeeper()){
            moveAlongWall();
            closeWindow();
        }
        
    }
   public void findWall(){
       while (frontIsClear()){
           move();
        }
       turnLeft();
    }
   public void moveAlongWall(){
        
        
        while ((frontIsClear() && checkRightSide())==true){
            if(nextToABeeper()) {
                turnOff();
            }
            move();
            
            if (!frontIsClear()){
                turnLeft();
            }
          
        }
        
      
    }
   public void turnRight(){
       turnLeft();
       turnLeft();
       turnLeft();
    }
   public void closeWindow(){
        if (frontIsClear()){
            putBeeper();
            turnLeft();
            
            move();
        }
        else{
            turnLeft();
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

