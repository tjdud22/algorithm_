function solution(my_string, queries) {
    for (let i = 0; i < queries.length; i++) {
        const [s, e] = queries[i]; // 구조분해할당 - 각 query에서 s와 e 가져오기
        const reversedPart = my_string.slice(s, e + 1).split("").reverse().join(""); 
        my_string = my_string.slice(0, s) + reversedPart + my_string.slice(e + 1); 
    }
    return my_string;
}
