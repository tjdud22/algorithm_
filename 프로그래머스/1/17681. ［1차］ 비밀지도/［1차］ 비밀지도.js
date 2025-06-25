function solution(n, arr1, arr2) {
    var answer = [];
    let binaryArr1 = arr1.map(num => num.toString(2).padStart(n, "0"));
    let binaryArr2 = arr2.map(num => num.toString(2).padStart(n, "0"));
    
    for(let i=0; i<binaryArr1.length; i++){
        let a1 = binaryArr1[i].split("");    
        let a2 = binaryArr2[i].split("");
        let arr = ""
        for(let j=0; j<a1.length; j++){
            if(a1[j] ==0 && a2[j] ==0){
                arr+=" "
            }else{
                arr+="#"
            }
        }
            answer.push(arr);
    }
    return answer;
}