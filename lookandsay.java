package lookandsay;

public class LookAndSay {

    public static void main(String[] args) {

           String result = "1";
           
           for (int i = 0; i < 10; i++) {
               System.out.println(result);
               result = lookandsay(result);
               
           }
                
          }
    public static String lookandsay(String num) {
        
        if (num == null || num.isEmpty()) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        
        String totalNum = "";
        int position = 0;
        
        for (int i = 0; i < num.length(); i++) {
            
            if (num.charAt(position) != num.charAt(i)) {
                totalNum = num.substring(position, i);
                sb.append(totalNum.length()).append(num.charAt(position));
                
                position = i;
            }
            
        }
        //az utolsó karakter miatt kell még ez is. 
        //megszámoljuk a marker és a vége közötti szakasz hosszát
        sb.append(num.substring(position, num.length()).length()).append(num.charAt(position));
        return sb.toString();
        
    }
       
}
