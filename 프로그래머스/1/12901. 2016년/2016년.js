function solution(a, b) {
    const Week = ["FRI","SAT","SUN","MON","TUE","WED","THU"];
    const Day = [31,29,31,30,31,30,31,31,30,31,30,31];
    let sum =0;
    
    for(let i=1; i<a; i++){
        sum += Day[i-1];
    }
    
    return Week[(b - 1 + sum) % 7];
}