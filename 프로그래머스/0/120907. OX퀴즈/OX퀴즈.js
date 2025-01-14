function solution(quiz) {
    return quiz.map(item => {
        let [left, right] = item.split("=").map(part => part.trim());

        let leftValue = new Function(`return ${left}`)();
        let rightValue = Number(right); 

        return leftValue === rightValue ? "O" : "X";
    });
}
