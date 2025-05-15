function solution(picture, k) {
    let arr = picture.map(str=>str.split("").map(i=>i.repeat(k)).join(""));
    return arr.reduce((acc,ch) => {
        for(let i=0; i<k; i++){
            acc.push(ch);
        }
        return acc
    },[]);
}