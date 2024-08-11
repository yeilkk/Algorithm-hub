class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        int x = 0;
        int n = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].endsWith("x")){
                String str = arr[i].replace("x", "");
                if (str.equals(""))
                    x++;
                else
                    x += Integer.parseInt(str);
                
                continue;
            }
            if(arr[i].equals("+")) 
                continue;
            
            n += Integer.parseInt(arr[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        if (x > 0){
            if(x == 1) sb.append("x");
            else sb.append(x+"x");
        }
        if (n > 0) {
            if (x > 0) 
                sb.append(" + ");
            sb.append(n);
        }
        if(x > 0 || n > 0) 
            return sb.toString();
        else 
            return "0";
    }
}