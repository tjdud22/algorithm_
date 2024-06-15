class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        while (true) {
            int[] newArr = new int[arr.length];
            boolean isChanged = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    newArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    newArr[i] = arr[i] * 2 + 1;
                } else {
                    newArr[i] = arr[i];
                }
                if (newArr[i] != arr[i]) {
                    isChanged = true;
                }
            }

            if (!isChanged) {
                break;
            }
            arr = newArr;
            answer++;
        }

        return answer;
    }
}