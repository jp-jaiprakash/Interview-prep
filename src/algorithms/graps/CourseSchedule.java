package algorithms.graps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSchedule {

   public boolean canFinish(int numberOfCourses, int [][]prerequisites){

      /**
       * 0  - unvisited
       * -1 - visiting
       * 1  - visited this node in previous iteration
       */
      int [] visiting = new int[numberOfCourses];
      Map<Integer, List<Integer>> adjacency = new HashMap<>();

      for(int i=0; i< numberOfCourses; i++){
         adjacency.put(i, new ArrayList<>());
      }

      for(int i=0; i< prerequisites.length; i++){
         adjacency.get(prerequisites[i][0]).add(prerequisites[i][1]);
      }

      for(int i=0; i< numberOfCourses; i++){
         if(!dfs(visiting, adjacency,i))
            return false;
      }

      return true;
   }

   private boolean dfs(int[] visiting, Map<Integer, List<Integer>> adjacency, int i) {

      if(visiting[i] == -1)
         return false;

      if(visiting[i] == 1)
         return true;

      visiting[i] = -1;

      List<Integer> adjacentNodes = adjacency.get(i);
      for(int j: adjacentNodes){
         if(!dfs(visiting, adjacency,j))
            return false;
      }

      visiting[i] = 1;
      return true;
   }
}
