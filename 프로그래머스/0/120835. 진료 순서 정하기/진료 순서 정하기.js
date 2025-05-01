function solution(emergency) {
    var answer = [];
    let arr = [];
    for(let i=0; i<emergency.length; i++){
        arr.push({index : emergency.length - i,value : emergency[i]});
    }
    
    arr.sort((a,b)=>a.value - b.value);
    for(let i of arr){
        answer.push(i.index);
    }

    return answer;
}