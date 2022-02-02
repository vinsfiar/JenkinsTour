public class Main {
    public static void main(String[] args) {
        char c = '3';

        Character tt = c;

        int ci = c - '0';
        System.out.println(tt.charValue());
        System.out.println(Character.getNumericValue(tt));

        String str = "0123";
        String str2 = "0123";

        for(char cs: str.toCharArray()){
            System.out.printf("cs = %d, 2*cs = %d\n",(int)(cs - '0'), (int)(cs - '0')*2);
        }
    }
}
