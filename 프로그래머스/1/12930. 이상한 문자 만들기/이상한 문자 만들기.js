function solution(s) {
    let words = s.split(" ");
    let answer = [];

    for (let i = 0; i < words.length; i++) {
        let word = words[i];
        let str = ""; 

        for (let j = 0; j < word.length; j++) {
            if (j % 2 === 0) {
                str += word[j].toUpperCase();
            } else {
                str += word[j].toLowerCase();
            }
        }

        answer.push(str);
    }

    return answer.join(" ");
}

