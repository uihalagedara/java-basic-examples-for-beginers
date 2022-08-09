class StringEx {
    public static void main(String args[]) {
        String str0 = "We are studying object oriented programming";
        String str = "0123456789ABCDEFGHIJKLMNo";

        System.out.println("The string is: " + str);
        System.out.println("Length of this string is: " + str.length());
        System.out.println("The character at position 5 is : " + str.charAt(5));
        System.out.println("The substring from 7 to 15 is : " + str.substring(7, 15));
        System.out.println("The index of character o is : " + str.indexOf('o'));
        System.out.println(" \"object\" is : " + str0.indexOf("object"));
        System.out.println("The string in Upper case : " + str.toUpperCase());
    }
}