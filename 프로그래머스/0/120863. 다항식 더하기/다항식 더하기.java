class Solution {
    public String solution(String polynomial) {
               String answer = "";
        int numX = 0;
        int numY = 0;
        String[] strList = polynomial.split("\\s*\\+\\s*");

        for (String str : strList) {
            str = str.trim(); 
            if (str.contains("x")) {
                if (str.equals("x")) {
                    numX += 1;
                } else {
                    numX += Integer.parseInt(str.replace("x", ""));
                }
            } else {
                if (!str.isEmpty()) {
                    numY += Integer.parseInt(str);
                }
            }
        }

        if (numX == 1 && numY == 0) {
            answer = "x";
        } else if (numX == 1 && numY != 0) {
            answer = "x + " + numY;
        } else if (numX != 0 && numY == 0) {
            answer = numX + "x";
        } else if (numX != 0 && numY != 0) {
            answer = numX + "x + " + numY;
        } else if (numX == 0 && numY != 0) {
            answer = Integer.toString(numY);
        }

        return answer;

    }
}