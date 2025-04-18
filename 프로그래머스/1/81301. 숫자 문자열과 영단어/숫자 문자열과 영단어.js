function solution(s) {
    const numMap = {
    "zero": "0",
    "one": "1",
    "two": "2",
    "three": "3",
    "four": "4",
    "five": "5",
    "six": "6",
    "seven": "7",
    "eight": "8",
    "nine": "9"
    };
    
    for(let i in numMap){
        //RegExp는 Regular Expression(정규표현식) 을 만들 때 쓰는 자바스크립트 내장 클래스
        const regex = new RegExp(i, "g");
        s = s.replace(regex, numMap[i]);
    }  
    return Number(s);
}