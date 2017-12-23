class Solution {
    
    public boolean  topSort(Stack <Integer>s,ArrayList<LinkedList<Integer>> arr, int i, boolean visited[], boolean recstack[]){
        
        if(visited[i]){

        return false;
        }
        visited[i]=true;
        recstack[i]=true;
        boolean f=false;
        
        for (int j:arr.get(i)){
            if(recstack[j]){
                return true;
            }

        f=f||topSort(s,arr,j,visited,recstack);
        }
        
        s.push(i);
        recstack[i]=false;
        
        
        System.out.println("i="+i+arr.get(i));
        return f;
        
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        
        
        
        Stack<Integer> s=new Stack<Integer>();
       ArrayList<LinkedList<Integer>> arr=new ArrayList<LinkedList<Integer>>() ;
     
        
        for(int i=0;i<numCourses;i++){

        arr.add(new LinkedList<Integer>());
        
        }
        
        
    
        
        for(int i=0;i<prerequisites.length;i++){

        arr.get(prerequisites[i][1]).add(prerequisites[i][0]);
            
        
        }
        
        boolean visited[]=new boolean[numCourses];
        boolean recstack[]=new boolean[numCourses];
        boolean f=false;
        for(int i=0;i<numCourses;i++){
            
             f=f||topSort(s,arr,i,visited,recstack);
        }
        
        
        int ra[]=new int [numCourses];
        
        if(f)
            return new int[0];
        int k=0;
        while(!s.isEmpty()){
//System.out.println(s.pop());
        ra[k]=s.pop();
            k++;
          
        
        }
        
        return ra;
            
        
       
        
        
    }
}
