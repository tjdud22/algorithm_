function solution(arr) {
    let length = arr.length;

    // 필요한 길이 (2의 거듭제곱 중 가장 가까운 값)
    let nextPowerOfTwo = 1;
    while (nextPowerOfTwo < length) {
        nextPowerOfTwo *= 2;
    }

    // 부족한 만큼 0을 추가
    while (length < nextPowerOfTwo) {
        arr.push(0);
        length++;
    }

    return arr;
}
