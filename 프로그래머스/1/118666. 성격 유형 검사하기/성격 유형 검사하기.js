function solution(survey, choices) {
    var answer = '';
    const sheet = {
        "RT": 0,
        "CF": 0,
        "JM": 0,
        "AN": 0
    }
    
    for(let i=0; i<choices.length; i++){
        if(survey[i] in sheet){
            sheet[survey[i]]+=choices[i] - 4;
        }else{
            sheet[survey[i].split("").reverse().join("")]+=4-choices[i];
        }
    }
    if(sheet["RT"] <= 0){
        answer+="R"
    }else{
        answer+="T"
    }
    if(sheet["CF"] <= 0){
        answer+="C"
    }else{
        answer+="F"
    }
    if(sheet["JM"] <= 0){
        answer+="J"
    }else{
        answer+="M"
    }
    if(sheet["AN"] <= 0){
        answer+="A"
    }else{
        answer+="N"
    }
    
    return answer;
}