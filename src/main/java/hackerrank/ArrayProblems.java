package hackerrank;

import java.util.*;


public class ArrayProblems {
	
	//Lonely Integer
	
	public static int lonelyInteger(List<Integer> a) {
		Set<Integer> dupSet = new HashSet<>();
        int uniqueElement = -1;
        for(int i = 0; i < a.size(); i++){
            boolean dupFound = false;
          if(!dupSet.contains(a.get(i))){
              for(int j = i+1; j < a.size(); j++){
                  if(a.get(i) == a.get(j)){
                      dupSet.add(a.get(i));
                      dupFound = true;
                      break;
                  }
              }
          }else{
              dupFound = true;
          }
          if(!dupFound){
                  uniqueElement = a.get(i);
          }
        }
        return uniqueElement;
	}
	
	//Grading Student
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    List<Integer> results = new ArrayList<>();
	    for(Integer i : grades) {
	    	if(i < 38) {
	    		results.add(i);
	    	}else {
	    		int q = i / 5;
	    		int diff = ( (q + 1) * 5) - i;
	    		if(diff < 3) {
	    			results.add((q + 1) * 5);
	    		}else {
	    			results.add(i);
	    		}
	    	}
	    }
	    return results;

	}

}
