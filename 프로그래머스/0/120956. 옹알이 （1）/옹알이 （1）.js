function solution(babbling) {
    let answer = 0;
    const baby = ["aya", "ye", "woo", "ma"]; // 발음 가능 목록

    for (let i = 0; i < babbling.length; i++) {
        let word = babbling[i]; // 현재 단어
        let isValid = true; // 유효한 단어인지 여부
        let lastUsed = ""; // 직전에 사용한 발음

        while (word.length > 0) {
            let found = false; // 현재 단어에서 발음을 찾았는지 여부
            for (const b of baby) {
                if (word.startsWith(b)) { // 단어가 발음으로 시작할 때만 처리
                    if (b === lastUsed) { // 직전 발음과 동일하면 무효
                        isValid = false;
                        break;
                    }
                    word = word.slice(b.length); // 발음을 제거
                    lastUsed = b; // 현재 발음을 기록
                    found = true;
                    break;
                }
            }
            if (!found) { // 발음을 찾지 못하면 무효
                isValid = false;
                break;
            }
        }

        if (isValid) {
            answer++;
        }
    }

    return answer;
}
