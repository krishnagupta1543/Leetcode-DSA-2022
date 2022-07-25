public class FirstUpperCase{
    public static char firstUppercase(String s, int i){
        if(i == s.length()) return ' ';
        char c = s.charAt(i);
        if('A'<= c && c<='Z') return c;
        else{
            return firstUppercase(s, i+1);
        }
    }
    public static void main(String[] args) {
        String s = "krshnaA";
        System.out.println(firstUppercase(s, 0));
    }
}
