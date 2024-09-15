function solution(my_string) {
    let sum = 0;
    for (let char of my_string) {
        let num = parseInt(char);  
        if (!isNaN(num)) {         
            sum += num;
        }
    }
    return sum;
}
