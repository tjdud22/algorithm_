function solution(sizes) {
    var answer = 0;
    let width = 0;
    let height = 0;
    for(let i=0; i<sizes.length; i++){
        let X = Math.max(sizes[i][0],sizes[i][1]);
        let Y = Math.min(sizes[i][0],sizes[i][1]);
        width = Math.max(width,X);
        height = Math.max(height,Y);
    }
    return width * height;
}