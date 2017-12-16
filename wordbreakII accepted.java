//Lessons: Generic arrayList Error like ArrayList <Integer> dp[]=new ArrayList<Integer>[30] is not possible in java gives error



class Solution {
    
    public List<String> getList(ArrayList<ArrayList<Integer>>dp,int i, String s){
        ArrayList<String>m=new ArrayList<String>(); 
        
        
        
         for(int f:dp.get(i)){
             if(!getList(dp,f,s).isEmpty()){
             
             for(String h:getList(dp,f,s)){
                 
                 m.add(h+" "+s.substring(f,i));
             }
        }
             
             else{
               
                 m.add(s.substring(f,i));
             }
             
         }
        return m;
        
        
    }
    
    public List<String> wordBreak(String s, List<String> wordDict) {
        
       ArrayList<ArrayList<Integer>>dp=new ArrayList<ArrayList<Integer>>(); 
        for(int i=0;i<s.length()+1;i++){

        dp.add(new ArrayList<Integer>());
        }
        
        
        
        for(int i=1;i<=s.length();i++){
            
            String x=s.substring(0,i);
            if(wordDict.contains(x)){
              dp.get(i).add(0);
               //System.out.println(i);
            }
            if(!dp.get(i).isEmpty()){     // Don't forget to add this check because we will continue finding if we get a string in first element.
            for(int j=i+1;j<=s.length();j++){
                String h=s.substring(i,j);
                if(wordDict.contains(h)){
                    dp.get(j).add(i);
                    //System.out.println(i);
                }
            
            }
            }
        }
        
        
        return getList(dp,s.length(),s);
        
       
                
                
                
            
            }
       
    
                
                

            
            

        
        
        

    }
