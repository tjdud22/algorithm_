function solution(order) {
    let answer = 0;
    let str = order.toString().split('');
    for(let i of str){
    if(i == '3' || i == '6' || i == '9') answer++};
    return answer;
}