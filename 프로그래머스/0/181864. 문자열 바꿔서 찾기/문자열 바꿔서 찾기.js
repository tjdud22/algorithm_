function solution(myString, pat) {
    // 'A'와 'B' 둘 다 포함되어 있는지 확인
    if (myString.includes('A') || myString.includes('B')) {
        // A와 B를 동시에 교체
        var tempString = "";
        
        for (var i = 0; i < myString.length; i++) {
            var char = myString[i];
            
            if (char === 'A') {
                tempString += 'B';
            } else if (char === 'B') {
                tempString += 'A';
            } else {
                tempString += char;
            }
        }

        myString = tempString;
    }

      return tempString.includes(pat) ? 1 : 0;
}
