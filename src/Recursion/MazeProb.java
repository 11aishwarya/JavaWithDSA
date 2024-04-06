package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProb {
    public static void main(String[] args) {
        //System.out.println(count(3,3));
        //path("",3,3);
        //System.out.println(pathRt("",3,3));
        //System.out.println(pathRtDiagonaly("",3,3));
        boolean[][] board = {
                {true,true,true},{true,false,true},{true,true,true}
        };
        int path[][] = new int [board.length][board[0].length];
        //allpathRes("",board,0,0  );
        allPathPrint("",board,0,0,path,1);
    }

    static int count(int r , int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }
    static void path(String p , int r ,int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }

    static ArrayList<String> pathRt(String p , int r , int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int count = 0;
        ArrayList<String> list1 = new ArrayList<>();
        if(r > 1){
            list1.addAll(pathRt(p+'D',r-1,c));
        }
        if(c>1){
            list1.addAll(pathRt(p+'R',r,c-1));
        }

        return list1;
    }

    static ArrayList<String> pathRtDiagonaly(String p , int r , int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list1 = new ArrayList<>();
        if(r>1 && c >1){
            list1.addAll(pathRtDiagonaly(p+'d',r-1,c-1));
        }
        if(r > 1){
            list1.addAll(pathRtDiagonaly(p+'D',r-1,c));
        }
        if(c>1){
            list1.addAll(pathRtDiagonaly(p+'R',r,c-1));
        }
       // System.out.println(list1.size());
        return list1;
    }

    static void pathRes(String p ,boolean[][] maze, int r ,int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r <  maze.length-1){
            pathRes(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            pathRes(p+'R',maze,r,c+1);
        }
    }

    static void allpathRes(String p ,boolean[][] maze, int r ,int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r <  maze.length-1){
            allpathRes(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            allpathRes(p+'R',maze,r,c+1);
        }
        if(r > 0){
            allpathRes(p+'U',maze,r-1,c);
        }
        if(c > 0){
            allpathRes(p+'L',maze,r,c-1);
        }
    }
    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c+1);
        }

        if (r > 0) {
            allPath(p + 'U', maze, r-1, c);
        }

        if (c > 0) {
            allPath(p + 'L', maze, r, c-1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }



    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r+1, c, path, step+1);
        }

        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c+1, path, step+1);
        }

        if (r > 0) {
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c-1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
