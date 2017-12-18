class Solution {
    public int countCornerRectangles(int[][] grid) {
        
//         for(int i=0;i<grid.length;i++){

//         for(int j=0;j<grid[0].length;j++){

//         System.out.print(grid[i][j]);
            
//         }
//         System.out.println();
//         }
        int num_rect=0;
        
        for(int i=0;i<grid.length-1;i++){
            
            
            for(int k=i+1;k<grid.length;k++){
            int count=0;
                for(int j=0;j<grid[0].length;j++){

                    if(grid[i][j]==1 &&grid[k][j]==1){
                       count++; 
                    
                    }         

                

                }
                
                num_rect+=count*(count-1)/2;
                    //System.out.println(i+" i,"+k+" k"+count);
            }

        
        
        }
        
        return num_rect;
            
        
    }
}
