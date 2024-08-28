function solution(order) {
    let answer = 0;
    for(let item of order){
        if (item.includes("cafelatte")) {
            answer += 5000;
        } else {
            answer += 4500;
        }
    }
    return answer;
}