// given maze, ball position, hole position find shortest distance to from ball to hole and also output the lexicographically smaller direction string. 

class Solution {
    public String findShortestWay(int[][] maze, int[] ball, int[] hole) {
        
        ArrayList<Integer> h=new ArrayList<Integer>();
        h.add(hole[0]);h.add(hole[1]);
        
        ArrayList<Integer> b=new ArrayList<Integer>();
        b.add(ball[0]);b.add(ball[1]);
               
        
        Queue<ArrayList<Integer>> q=new LinkedList<ArrayList<Integer>>();
        
        q.add(b);
        
        boolean visited[][]=new boolean[maze.length][maze[0].length];
        
        String path[][]=new String[maze.length][maze[0].length];
        
        path[ball[0]][ball[1]]="";
        
        while(!q.isEmpty()){

        ArrayList<Integer> a= (ArrayList<Integer>)q.remove();
            if(a==null || a.isEmpty()){
            System.out.println("a is empty something wrong");
            }
            int m=a.get(0);
            int n=a.get(1);
            visited[m][n]=true;
            
            int i=a.get(0);
            int j=a.get(1);
            //System.out.println(i+"=i"+ "j="+j);
            //System.out.println(path[i][j]);
            
            
            
            if(i==hole[0] && j==hole[1]){
                
                return path[i][j];
            }
            if(i+1<maze.length){
                if(!visited[i+1][j] && maze[i+1][j]==0){
                        String p="";
                    ArrayList<Integer> k=new ArrayList<Integer>();
                    k.add(i+1);
                    k.add(j);
                    q.add(k);
                    if(path[i][j]!=null && path[i][j].length()!=0){
                        if(path[i][j].charAt(path[i][j].length()-1)!='d'){
                        p=path[i][j]+""+"d";
                        }
                        else p=path[i][j];
                        
                    }
                    
                    else{
                        p="d";
                    }
                    
                    if(path[i+1][j]!=null && !path[i+1][j].isEmpty()){
                             if(p.compareTo(path[i+1][j])<0){
                                path[i+1][j]=p;
                             }
                        }
                    else{
                        path[i+1][j]=p;
                    }
                   
                  //  System.out.println((i+1)+"=i"+ "j="+j);
                   //System.out.println("d "+path[i+1][j]) ;

                }
            }
                
                
                
                 if(j-1>=0){
                if(!visited[i][j-1] && maze[i][j-1]==0){
                        String p="";
                    ArrayList<Integer> k=new ArrayList<Integer>();
                    k.add(i);
                    k.add(j-1);
                    q.add(k);
                    if(path[i][j]!=null && path[i][j].length()!=0){
                        if(path[i][j].charAt(path[i][j].length()-1)!='l'){
                        p=path[i][j]+""+"l";
                        }
                        else p=path[i][j];
                    }
                    
                    else{
                        p="l";
                    }
                    if(path[i][j-1]!=null && !path[i][j-1].isEmpty()){
                             if(p.compareTo(path[i][j-1])<0){
                                path[i][j-1]=p;
                             }
                        }
                    else{
                        path[i][j-1]=p;
                    }
                   // System.out.println(i+"=i"+ "j="+(j-1));
                   // System.out.println("l "+path[i][j-1]) ;
                }
                
            }
                
                
                
                if(j+1<maze[0].length){
                    if(!visited[i][j+1] && maze[i][j+1]==0){
                        String p="";
                        ArrayList<Integer> k=new ArrayList<Integer>();
                        k.add(i);
                        k.add(j+1);
                        q.add(k);
                        if(path[i][j]!=null && path[i][j].length()!=0){
                            if(path[i][j].charAt(path[i][j].length()-1)!='r'){
                            p=path[i][j]+""+"r";
                            }
                            else p=path[i][j];
                        }

                        else{
                            p="r";
                        }
                        
                        
                        
                        if(path[i][j+1]!=null && !path[i][j+1].isEmpty()){
                             if(p.compareTo(path[i][j+1])<0){
                                path[i][j+1]=p;
                             }
                        }
                    else{
                        path[i][j+1]=p;
                    }
                   // System.out.println(i+"=i"+ "j="+(j+1));
                   // System.out.println("r "+path[i][j+1]) ;

                    }
                }
                
                
                
                
                
                 if(i-1>=0){
                if(!visited[i-1][j] && maze[i-1][j]==0){
                        String p="";
                    ArrayList<Integer> k=new ArrayList<Integer>();
                    k.add(i-1);
                    k.add(j);
                    q.add(k);
                    if(path[i][j]!=null&& path[i][j].length()!=0){
                        if(path[i][j].charAt(path[i][j].length()-1)!='u'){
                        p=path[i][j]+""+"u";
                        }
                        else p=path[i][j];
                    }
                    
                    else{
                        p="u";
                    }
                    
                    
                    if(path[i-1][j]!=null && !path[i-1][j].isEmpty()){
                             if(p.compareTo(path[i-1][j])<0){
                                path[i-1][j]=p;
                             }
                        }
                    else{
                        path[i-1][j]=p;
                    }
                   // System.out.println((i-1)+"=i"+ "j="+j);
                   // System.out.println("u "+path[i-1][j]) ;

                }
                
            }
                
                
                
                
                
        
        
        }
        
        return "impossible";
        
        
        
    }
}
