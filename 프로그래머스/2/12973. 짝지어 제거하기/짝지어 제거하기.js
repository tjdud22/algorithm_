function solution(s){
    const stack = []
    let idx = 0
    for(let ch of s){
        if(stack.length && stack[stack.length-1] == ch){
            stack.pop();
        }else{
            stack.push(ch);
        }
    }
    return stack.length == 0 ? 1 : 0
}