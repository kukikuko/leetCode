class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length==0||matrix[0].length==0)return new int[0];
        int col=matrix.length,row=matrix[0].length;
        int nums=col*row,m=0,n=0;
        int res[]=new int[nums];
        boolean flag=true;

        for(int i=0;i<nums;i++){
            res[i]=matrix[m][n];
            //올라가고 내려가는 거에 따라 대각선으로 이동
            if(flag){
                n+=1; m-=1; 
            }else{
                n-=1; m+=1;
            }
            //대각선으로 이동한 값이 사각형 범위를 벗어나면 원래 자리로 돌아간 다음,
            //바닥면에 닿으면 오른쪽으로 한 칸 이동
            // 오른쪽 면에 닿으면 아래로 한 칸 이동
            if(m>=col){
                m-=1; n+=2; flag=true;
            }else if(n>=row){
                n-=1; m+=2; flag=false;
            }
            //그러고 나서도, 각 각 0보다 작으면 0값으로 변경
            if(m<0){
                m=0; flag=false;
            }else if(n<0){
                n=0; flag=true;
            }
        }
        return res;
    }
}