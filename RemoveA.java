public class RemoveA {
    public static String removeOcc(String s,int idx){
        
        if(s.length()==0) return " ";
        String ans;
        for(int i=0;i<s.length();i++){
            if(s.charAt(idx)!='a'){
                ans+=s.charAt(i);
            }
              
                }
                      
            

        }

    public static void main(String[] args) {
        String s="abcax";
        removeOcc(s,0);
        
    }
    
}
