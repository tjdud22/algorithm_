function solution(phone_number) { 
    let hiddenPart = "*".repeat(phone_number.length - 4);
    let visiblePart = phone_number.slice(-4); 
    return hiddenPart + visiblePart; 
}
