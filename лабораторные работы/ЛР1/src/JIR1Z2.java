public class JIR1Z2
{
    public static void main(String[] args)
    {
        String s = "анна";
        reverse(s);
        palindrom(s);
        String k = "мана";
        reverse(k);
        palindrom(k);
    }
    public static String reverse(String s){
        String slovo = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            slovo += s.charAt(i);
            System.out.println(slovo);
        }
        return slovo;
    }
    public static Boolean palindrom(String s) {
        if (s.equals(reverse(s))) {
            System.out.println("Слово является палиндромом");
        } else {
            System.out.println("Слово не является палиндромом");
        }
        return s.equals(reverse(s));
    }
}
