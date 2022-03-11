class Solution {
    public void rotate(int[][] matrix) {
        
        
        //first transpose 
        
        //rows
        for (int i =0;i<matrix.length;i++){
            
            
            //cols
            for(int j = i+1;j<matrix.length;j++){
                
                
                //System.out.print(matrix[i][j]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                
            }//end inner for 
            
            
            
        }//end outer for
        
        
        //second reflect 
        
           for (int i =0;i<matrix.length/2;i++){
            
                    //rows
                    for(int j=0;j<matrix.length;j++){
                        
                        int temp = matrix[j][i];//0,0
                        int swap = matrix[j][matrix.length-1-i];
                        matrix[j][i] = matrix[j][matrix.length-1-i];
                        matrix[j][matrix.length-1-i]=temp;
                        
                    }
               
               
           }
        
        //System.out.print(matrix.length-1);
        
    }
}
