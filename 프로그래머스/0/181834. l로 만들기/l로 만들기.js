function solution(myString) {
   let charArray = myString.split('');

    for (let i = 0; i < charArray.length; i++) {
        if (charArray[i] < 'l') {
            charArray[i] = 'l';
        }
    }

    return charArray.join('');
}