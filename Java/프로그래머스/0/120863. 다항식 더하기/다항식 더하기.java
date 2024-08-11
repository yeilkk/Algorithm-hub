class Solution {
    public String solution(String polynomial) {
        String[] arr =polynomial.split(" ");
        int x = 0;
        int n = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].endsWith("x")){
                String coeff = arr[i].replace("x", "");
                if (coeff.equals("")) {
                    x++;
                } else {
                    x += Integer.parseInt(coeff);
                }
                continue;
            }
            if(arr[i].equals("x")) {
                x++;
                continue;
            }
            if(arr[i].equals("+")) continue;
            n += Integer.parseInt(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        if (x > 0) {
            sb.append(x == 1 ? "x" : x + "x");
        }
        
        if (n > 0) {
            if (x > 0) {
                sb.append(" + ");
            }
            sb.append(n);
        }
        
        return sb.length() > 0 ? sb.toString() : "0";
    }
}