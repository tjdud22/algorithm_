function solution(num_list) {
    var num1 =0;
    var num2 =0;
    for(var i in num_list){
        if(num_list[i] % 2 == 1){
            num1 = num1*10 + num_list[i];
        }else{
            num2 = num2*10 + num_list[i];
        }
    }
    return num1+num2;
}