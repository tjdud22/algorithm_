function solution(arr1, arr2) {
        let sum1 = 0;
        let sum2 = 0;

        for (let num of arr1) {
            sum1 += num;
        }

        for (let num of arr2) {
            sum2 += num;
        }

        if (arr1.length < arr2.length) {
            return -1;
        } else if (arr1.length > arr2.length) {
            return 1;
        } else {
            if (sum1 < sum2) {
                return -1;
            } else if (sum1 > sum2) {
                return 1;
            } else {
                return 0;
            }
        }
    return answer;
}