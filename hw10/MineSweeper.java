//Author: Andrew Steinberg
//Title: CSE2 HW#10 (minesweeper)
//Date: 11/12/15


import java.util.Scanner;

public class MineSweeper{
    static String[][] board = null;//the global board var
    static int n = 0;//the global length variable
            
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("What size board do you want to play on? ");
        n = scan.nextInt();
        try //if negative length inputted
        {
            board = new String[n][n];
        }
        catch(Exception e)
        {
            System.out.println("Invalid input.");
            System.exit(-1);
        }
        //Initialize array to " ".
        for(int x = 0; x < n; x++)
        {
            
          for(int y = 0; y < n; y++)
          {
                
              board[x][y] = " ";
            }
        }
        
        System.out.println("Enter  number of mines you want to be placed on the board: ");
        int mines = scan.nextInt();// num of mines
        
        int nxtMineX = 0;
        int nxtMineY = 0;
        
        String m = "M";
        
        for(int i = 0; i < mines; i++)
        {
            
            nxtMineX =(int)(Math.random()*n);//Random location for mine
            nxtMineY =(int)(Math.random()*n);
            
            if(board[nxtMineX][nxtMineY] != m){//Find out if there is a mine already
                board[nxtMineX][nxtMineY] = "M";//if it does not, you add M
            }
           
            else if(board[nxtMineX][nxtMineY] == m){//If there is already a mine, decrease i and try again
                i--;
            }
        }
        
        for(int x = 0; x < n; x++)
        {
            for(int y = 0; y < n; y++)
            {
                //If a mine is at the current location then you update all the adjacent cells
                if(board[x][y] == "M"){
                    newAdjacent(x, y);
                }
            }
        }
        print(board);
    }
    
    public static void add(int x, int y)
    {
        if(board[x][y] != "M")
        {
            if(board[x][y] == " ")
            {
                board[x][y] = "1";
            }
            else if(board[x][y] == "1")
            {
                board[x][y] = "2";
            }
            else if(board[x][y] == "2")
            {
                board[x][y] = "3";
            }
            else if(board[x][y] == "3")
            {
                board[x][y] = "4";
            }
        }
    }
    
    public static void newAdjacent(int x, int y)
    {
        if(x > 0 && x < (n - 1))
        {
            
            if(y > 0 && y < n -1)
            {
                add(x, y-1);
                add(x, y+1);
                add(x+1, y-1);
                add(x+1, y);
                add(x+1, y+1);
                add(x-1, y-1);
                add(x-1, y);
                add(x-1, y+1);
            }
            else if(y == 0)
            {
                add(x, y+1);
                add(x+1, y);
                add(x+1, y+1);
                add(x-1, y);
                add(x-1, y+1);
            }
            else if(y == (n - 1))
            {
                add(x, y-1);
                add(x+1, y-1);
                add(x+1, y);
                add(x-1, y-1);
                add(x-1, y);
            }
        }
        else if(x == 0 && (n - 1) > 0)
        {
                        
            if(y > 0 && y < n -1)
            {
                add(x, y-1);
                add(x, y+1);
                add(x+1, y-1);
                add(x+1, y);
                add(x+1, y+1);
            }
            else if(y == 0)
            {
                add(x, y+1);
                add(x+1, y);
                add(x+1, y+1);
            }
            else if(y == (n - 1))
            {
                add(x, y-1);
                add(x+1, y-1);
                add(x+1, y);
            }
        }
        else if(x == (n - 1))
        {
                        
            if(y > 0 && y < n -1)
            {
                add(x, y-1);
                add(x, y+1);
                add(x-1, y-1);
                add(x-1, y);
                add(x-1, y+1);
            }
            else if(y == 0)
            {
                add(x, y+1);
                add(x-1, y);
                add(x-1, y+1);
            }
            else if(y == n - 1))
            {
                add(x, y-1);
                add(x-1, y-1);
                add(x-1, y);
            }
        }
    }
    
    public static void print(String[][] board)
    {
        
        System.out.println("Begin");
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        System.out.println("----------------");
        for(int i = 0; i < n; i++)
        {
            System.out.print("| ");
            for(int j = 0; j < n; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("--------End---------");
    }
    
}
