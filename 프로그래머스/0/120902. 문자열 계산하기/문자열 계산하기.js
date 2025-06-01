function solution(my_string) {
    let answer = 0;
        let str = my_string.split(" ");

        for (let i = 0; i < str.length; i += 2) {
            let num = parseInt(str[i]);

            if (i > 0) {
                if (str[i-1] === "+") {
                    answer += num;
                } else if (str[i-1] === "-") {
                    answer -= num;
                }
            } else {
                answer = num;  
            }
        }
        return answer;
}