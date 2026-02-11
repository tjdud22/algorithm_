function solution(today, terms, privacies) {
    var answer = [];
    today = today.split('.');
    const today_total = Number(today[0])*12*28 + Number(today[1])*28 + Number(today[2]);
    
    
    const termObj = {};
    for(let i=0; i<terms.length; i++){
        let term = terms[i].split(' ');
        termObj[term[0]]=Number(term[1]);
    }
    for(let i=0; i<privacies.length; i++){
        let privacy = privacies[i].split(' ');
        let joindate = privacy[0].split('.');
        let total = Number(joindate[0])*12*28 + Number(joindate[1])*28 + Number(joindate[2])+termObj[privacy[1]]*28;
        if(today_total>=total){
            answer.push(i+1);
        }
    }
    return answer;
}