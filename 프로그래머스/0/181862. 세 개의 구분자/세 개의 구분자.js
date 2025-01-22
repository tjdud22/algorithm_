function solution(myStr) {
    let str = myStr.split(/[abc]/).filter(str => str !== "");

    if (str.length === 0) {
        return ["EMPTY"];
    }

    return str;
}
