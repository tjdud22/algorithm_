function solution(nums) {
    let setNums = new Set(nums);
    if(setNums.size<nums.length/2){
        return setNums.size;
    }else{
        return nums.length/2;
    }
}