class Solution {
    public String toLowerCase(String s) {
        char myChar;
        for(int i=0; i<s.length();i++){
            myChar=s.charAt(i);
            if(Character.isUpperCase(myChar))
                s=s.toLowerCase(); 
        }
        return s;
    }
}