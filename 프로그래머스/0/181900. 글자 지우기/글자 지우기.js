function solution(my_string, indices) {
    const indicesSet = new Set(indices);
    var answer = '';
    for(let i = 0; i < my_string.length; i++) {
        if (!indicesSet.has(i)) {
            answer += my_string[i];
        }
    }

    return answer;
}