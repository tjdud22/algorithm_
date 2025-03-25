function solution(n)
{
    let answer = 0;
    let num = String(n).split('');
    for(let n of num){
        answer += Number(n);
    }
    return answer;
}