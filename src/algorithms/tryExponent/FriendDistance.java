package algorithms.tryExponent;

import java.util.ArrayList;
import java.util.List;

public class FriendDistance {
   public static void main(String[] args) {
      int [][] friendsMatrix = new int[][]{
               {0,1,1,1,0,0,0,0,0},
              {1,0,0,0,0,0,1,0,0},
              {1,0,0,0,1,1,0,0,0},
              {1,0,0,0,0,0,0,0,1},
              {0,0,1,0,0,0,0,1,0},
              {0,0,1,0,0,0,0,0,1},
              {0,1,0,0,0,0,0,0,0},
              {0,0,0,0,1,0,0,0,0},
              {0,0,0,1,0,1,0,0,0}


      };

      System.out.println(getFriendDistance(friendsMatrix, 1,8));
   }
   static int getFriendDistance(int [][] friendsMatrix, int friend1, int friend2){
      List<List<Integer>> adjacentFriends = new ArrayList<>();

      for(int i =0; i< friendsMatrix.length; i++){
         List<Integer> friends = new ArrayList<>();
         for(int j =0; j< friendsMatrix.length; j++){
            if(friendsMatrix[i][j] == 1)
               friends.add(j);
         }
         adjacentFriends.add(friends);
      }

      boolean visited[] = new boolean[friendsMatrix.length];
      int cnt =0;
      List<Integer> path = new ArrayList<Integer>();
      List<List<Integer>> result = new ArrayList<>();
      dfs(adjacentFriends, friend1, friend2, visited, new ArrayList<>(), result);
      System.out.println(result);
      return    visited[friend2] ? cnt : -1;

   }

   private static void dfs(List<List<Integer>> adjacentFriends, int friend1, int friend2, boolean[] visited, List<Integer> friendpath, List<List<Integer>> result) {

      if(friend1 == friend2){
         System.out.println("Found");
         result.add(new ArrayList<>(friendpath));
         System.out.println(friendpath);
         return;

      }

      friendpath.add(friend1);
      visited[friend1] = true;
      List<Integer> friends = adjacentFriends.get(friend1);
      for(int i: friends){
         if(!visited[i]){
            dfs(adjacentFriends, i, friend2, visited, friendpath, result);
         }
      }
      friendpath.remove(friendpath.size()-1);
   }
}
