function solution(arr) {
    let firstIdx = -1;
    let lastIdx = -1;

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === 2) {
            firstIdx = i;
            break;
        }
    }

    for (let i = arr.length - 1; i >= 0; i--) {
        if (arr[i] === 2) {
            lastIdx = i;
            break;
        }
    }

    if (firstIdx === -1 || lastIdx === -1) {
        return [-1];
    }

    return arr.slice(firstIdx, lastIdx + 1);
}