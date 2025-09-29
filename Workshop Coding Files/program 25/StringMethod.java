class StringMethod
{
    public static void main(String[] args) {
        String str = "Biswajit";
        String str1 = "is at NIET";
        
        // Basic string methods
        System.out.println("Length: " + str.length());
        System.out.println("First character: " + str.charAt(0));
        System.out.println("Concatenation with space: " + str + " " + str1);
        System.out.println("Concat method: " + str.concat(str1));
        
        // Splitting str into characters
        String[] S = str.split("");
        System.out.println("\nSplitting string into characters:");
        for(int i = 0; i < S.length; i++) {
            System.out.println(S[i]);
        }
    }
}