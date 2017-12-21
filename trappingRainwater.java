class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int wc=0;
        int ml=0;
        
        int mr=n-1;
        
        int peak=0;
        for(int i=1;i<n;i++){
            
        
        if(height[i]>height[ml]){
            
                wc+=height[ml]*(i-ml-1)-peak;
            ml=i;
            peak=0;
             }
        else {
                peak=peak+height[i];
            
            }
        
        }
        
        peak=0;
        
         for(int i=n-2;i>=0;i--){
            
        
        if(height[i]>=height[mr]){
            
                wc+=height[mr]*(mr-i-1)-peak;
           
                mr=i;
                peak=0;
             }
        else {
                peak=peak+height[i];
            
            }
        
        }
        
        
        return wc;
        
        
        
        
        
        
        
        
    }
}
