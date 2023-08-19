package BinaryGap;

class Solution {
    public int solution(int N){
        String bin = Integer.toBinaryString(N);
        String[] binSolution = bin.split("");
        int gap = 0;;
        int max = 0;
        
        for(int i = 0; i < bin.length(); i++){
            if(Integer.parseInt(binSolution[i]) == 0){
                gap++;
            }
            else {
                if(max < gap){
                    max = gap;   
                }
                gap = 0;
            }
        }

        return max;
    }
}

class Main{
    public static void main(String[] args) {
        Solution mySolution = new Solution();
        System.out.println(mySolution.solution(561892));
    }
}