class Solution {
    
    public void getParen(int n, int pos, String s,int open,int close, ArrayList <String>list){
     
        if(pos==2*n){
            if(!list.contains(s)){
            list.add(s);
           }
            return ;
                        
        }
        if(open<n){
         
            getParen(n,pos+1,s+"(",open+1,close,list);
        
        }
        
         if(close<open){

            getParen(n,pos+1,s+")",open,close+1,list);
            
        
        }
    }
    
    
    public List<String> generateParenthesis(int n) {
        ArrayList a=new ArrayList<String>();
         getParen(n,0,"",0,0,a);
		 return a;
    }
}
