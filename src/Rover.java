import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: shahidkh
 * Date: 3/19/14
 * Time: 11:28 PM
 * To change this template use File | Settings | File Templates.
 */

class Robot {
    private :
        int X,Y,direction;
    public :
    int init(int X,int Y,int direction) {
        this.X=X;
        this.Y=Y;
        this.direction=direction;
    }
    int getX() { return X; }
    int getY() { return Y; }
    int getDirection() { return direction; }
    int applyOperation(char operation) {
        // apply operation logic
    }
}

public class Rover {
    private :
    public :
    public static void main(String args[]) {
        Grid g;
        g.init(x,y);
        Robot r;
        while(input) {
            r.init(x,y,direction);
            while(string) {
                r.applyOperation(operation);
                if( g.isInvalid(r.getX(),r.getY()) ) break;
            }
            // Check validity of initial position as well
            // Print answer
            System.out.println(r.getX(),r.getY());
        }
    }
}
