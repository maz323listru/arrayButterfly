package com.company;

public class Main {

    public static void main(String[] args) {
        arrayButterfly();
    }
    public static void arrayButterfly() {

        int [][] array  = {
                {1, 1, 1, 1, 1},
                {0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 1}
        };

          for (int i=0;i<array.length;i++){
              System.out.println();
              for(int j=0; j<array[i].length;j++){
                  if (array[i][j]==1)
                  {
                      System.out.print("*");
                  }
                  else System.out.print(" ");

              }
          }


    }
}
