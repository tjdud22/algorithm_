function solution(nums) {
    let answer = 0;
    let arr = [];
    
    for(let i=0; i<nums.length-2; i++){
        for(let j=i+1; j<nums.length-1; j++){
            for(let k=j+1; k<nums.length; k++){
                arr.push(nums[i]+nums[j]+nums[k]);
            }
        }
    }
    
    for(let i=0; i<arr.length; i++){
    let cnt =0;
        for(let j=1; j<=arr[i]; j++){
            if(arr[i]%j === 0){
               cnt++; 
                if(cnt > 2) break;
            }
        }
        if(cnt === 2){
               answer++;
           }
    }
    
    
    return answer;
}