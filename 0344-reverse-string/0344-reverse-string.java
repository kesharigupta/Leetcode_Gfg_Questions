class Solution {
    public void reverseString(char[] s) {
        int first =0;
        int last = (int)s.length-1;
        while(first < last){
            char temp;
            temp = s[last];
            s[last] = s[first];
            s[first] = temp;
            first++; 
            last--;
        } 
    }
    public static void main(String arge[]){
        char [] s = {'h','e','l','l','o'};
        Solution sol = new Solution();
        sol.reverseString(s);
        for(int i = 0; i<s.length ; i++){
            System.out.println(s[i]);
        }
    }
}