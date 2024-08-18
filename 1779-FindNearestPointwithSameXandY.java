class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int c = 0;
        int min_dis = 100000;
        int index = 0;
        
        for(int i = 0; i < points.length; i++){
            if(points[i][0] != x && points[i][1] != y ){
                c++;
            }
            else {
                int x1 = points[i][0];
                int y1 = points[i][1];
                
                int distance = Math.abs(x-x1) + Math.abs(y-y1);
                if(distance < min_dis){
                    min_dis = distance;
                    index = i;
                }
                else if((distance == min_dis)){
                    if(i < index){
                        index = i;
                    }   
                }
                
            }
        }
        
        if(c == points.length){
            return -1;
        }
        else{
            return index;
        }
    }
}