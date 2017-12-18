class Solution {
    public void wallsAndGates(int[][] rooms) {
        //int arr[]=new int[2];
        Queue<int []> q=new LinkedList<int []>();
        
        for(int i=0;i<rooms.length;i++)
        {
            for(int j=0;j<rooms[0].length;j++)
            {
               int ak[]=new int[2];
                
                
                if(rooms[i][j]==0){
                   
                    ak[0]=i;
                    ak[1]=j;
                    
                    
                    q.add(ak);
                }
            
            }
        }
      
        
        
        while(!q.isEmpty()){

        int k[]=q.remove();
            
            int i=k[0];
            int j=k[1];
            
            //System.out.println(i+","+j);
            
            if(i-1>=0 && rooms[i-1][j]!=-1){
                if(rooms[i-1][j]>rooms[i][j]+1){
                rooms[i-1][j]=rooms[i][j]+1;
                    int arr[]=new int[2];
                    arr[0]=i-1;
                    arr[1]=j;
                    
                    q.add(arr);
                
                }
            
            
            }
            
            
            
            
            if(j-1>=0 &&rooms[i][j-1]!=-1){
                if(rooms[i][j-1]>rooms[i][j]+1){
                rooms[i][j-1]=rooms[i][j]+1;
                    int arr[]=new int[2];
                    arr[0]=i;
                    arr[1]=j-1;
                    
                    q.add(arr);
                
                }
            
            
            }
            
            
            
            
            if(i+1<rooms.length &&rooms[i+1][j]!=-1){
                if(rooms[i+1][j]>rooms[i][j]+1){
                rooms[i+1][j]=rooms[i][j]+1;
                    int arr[]=new int[2];
                    arr[0]=i+1;
                    arr[1]=j;
                    
                    q.add(arr);
                
                }
                           
            
            }
            
            
            if(j+1<rooms[0].length &&rooms[i][j+1]!=-1){
                if(rooms[i][j+1]>rooms[i][j]+1){
                rooms[i][j+1]=rooms[i][j]+1;
                    int arr[]=new int[2];
                    arr[0]=i;
                    arr[1]=j+1;
                    
                    q.add(arr);
                
                }
            
            
            }
            
            
        
        }
        
//        for(int i=0;i<rooms.length;i++)
//        {
//             for(int j=0;j<rooms[0].length;j++)
//             {

//             System.out.print(rooms[i][j]+" ");
                
            
//             }
       
//            System.out.println();
       
//        }
        
    }
}
