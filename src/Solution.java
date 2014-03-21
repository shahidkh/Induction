import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;

/**
 * Created by IntelliJ IDEA.
 * User: shahidkh
 * Date: 3/19/14
 * Time: 11:28 PM
 * To change this template use File | Settings | File Templates.
 */

class Rover {
    private int X,Y;
    private char direction;
    public void init(int X,int Y,char direction) {
        this.X=X;
        this.Y=Y;
        this.direction=direction;
    }
    public int getX() { return X; }
    public int getY() { return Y; }
    public char getDirection() { return direction; }
    public void applyOperation(char operation) {
        switch(operation)
        {
            case 'L':
                if(direction=='N') direction='W';
                else if(direction=='W') direction='S';
                else if(direction=='S') direction='E';
                else if(direction=='E') direction='N';
                break;
            case 'R':
                if(direction=='N') direction='E';
                else if(direction=='E') direction='S';
                else if(direction=='S') direction='W';
                else if(direction=='W') direction='N';
                break;
            case 'M':
                if(direction=='N') Y++;
                else if(direction=='S') Y--;
                else if(direction=='E') X++;
                else if(direction=='W') X--;
        }
    }
    public boolean isPositionValid(int GridX,int GridY) {
        if(X>=0 && X<=GridX && Y>=0 && Y<=GridY) return true;
        return false;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/shahidkh/Induction/src/input.txt"));
        String s = br.readLine();
        if(s==null) return;
        String[] input = s.split(" ");
        int GridX = Integer.parseInt(input[0]), GridY = Integer.parseInt(input[1]);
        Rover r = new Rover();
        while((s = br.readLine())!=null)
        {
            input = s.split(" ");
            r.init(Integer.parseInt(input[0]),Integer.parseInt(input[1]),input[2].charAt(0));
            s = br.readLine();
            for(int i=0;i<s.length();i++)
            {
                r.applyOperation(s.charAt(i));
                //System.out.println(i + " : " + r.getX() + " " + r.getY() + " " + r.getDirection());
                if(!r.isPositionValid(GridX,GridY)) break;
            }
            System.out.println(r.getX() + " " + r.getY() + " " + r.getDirection());
        }
    }
}
