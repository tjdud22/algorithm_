function solution(myString, pat) {
        var answer = 0;
    for (var i = 0; i <= myString.length - pat.length; i++) {
        var substr = myString.substring(i, i + pat.length);
        if (substr === pat) {
            answer++;
        }
    }
    return answer;
}