function solution(my_string) {
    let result = '';

    for (let i = 0; i < my_string.length; i++) {
        let char = my_string.charAt(i);
        if (char === char.toUpperCase()) {
            result += char.toLowerCase();
        } else {
            result += char.toUpperCase();
        }
    }

    return result;
}
