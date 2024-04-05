function solution(myString, pat) {
    let answer = "";
    let index = myString.indexOf(pat);

    while (index !== -1) {
        answer += myString.substring(0, index + pat.length);
        myString = myString.substring(index + pat.length);
        index = myString.indexOf(pat);
    }

    return answer;
}