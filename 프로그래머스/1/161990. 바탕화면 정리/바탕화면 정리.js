function solution(wallpaper) {
    let lux = Infinity;
    let luy = Infinity;
    let rdx = -Infinity;
    let rdy = -Infinity;

    for (let i = 0; i < wallpaper.length; i++) {
        for (let j = 0; j < wallpaper[i].length; j++) {
            if (wallpaper[i][j] === '#') { 
                lux = Math.min(lux, i);
                rdx = Math.max(rdx, i + 1);
                luy = Math.min(luy, j);
                rdy = Math.max(rdy, j + 1);
            }
        }
    }

    return [lux, luy, rdx, rdy]; 
}
