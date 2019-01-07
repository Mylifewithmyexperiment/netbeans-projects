

public class Kanpur {
    public static void main(String[] args) {
        String s = "KANPUR";
        int len = s.length();
        String reverse="";
        for(int i=0;i<len;i++){
            reverse=s.charAt(i)+reverse;	
	}
        System.out.println("Reverse String is "+reverse);
    
        for (int i = 0; i < len; i++) {
            
            for (int k = 0; k <=i; k++) {
                System.out.print(reverse.charAt(k));
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}
