class Solution {
    public String solution(String new_id) {
        //1단계
        String newId = new_id.toLowerCase();
        
        //2단계
        newId = newId.replaceAll("[^a-z0-9-_.]","");
        
        //3단계
        newId = newId.replaceAll("[.]{2,}",".");
        
        //4단계
       
            if(newId.length()>0 && newId.charAt(0) == '.'){
                newId = newId.substring(1);
            }
            if(newId.length()>0 && newId.charAt(newId.length()-1) == '.'){
                newId = newId.substring(0,newId.length()-1);
            }
      
        //5단계
        if(newId.length()==0) newId = "a";
        
        
        //6단계
        if(newId.length()>=16){
            newId = newId.substring(0,15);
            if(newId.charAt(14)=='.'){
            newId = newId.substring(0,14);
            }
        }
        
        //7단계
            while(newId.length()<3){
                newId+=newId.charAt((newId.length()-1));
            }
        
       return newId;
    }
}