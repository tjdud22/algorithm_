function solution(num_list) {
    var num1 = 0;
    var num2 = 1;
     
    for(var i =0; i<num_list.length; i++){
        num1 += num_list[i];
        num2 *= num_list[i];
    }
    return num1**2 > num2 ? 1 : 0;
}