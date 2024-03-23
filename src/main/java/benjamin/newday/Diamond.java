package benjamin.newday;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        String firstArg = args.length > 0 ? args[0] : "";
        try (Scanner scanner = new Scanner(System.in)) {
            while (firstArg.isEmpty() || !Character.isLetter(firstArg.charAt(0))) {
                System.out.print("Enter a character: ");
                firstArg = scanner.next();
            }
        }
        char c = firstArg.toUpperCase().charAt(0);
        System.out.println(drawDiamond(c));
    }

    public static String drawDiamond(char c) {
        if (c < 'A' || c > 'Z') {
            throw new IllegalArgumentException("Invalid character");
        }
        StringBuilder sb = new StringBuilder();
        int size = c - 'A' + 1; //get the size from 'A'
        //create square, side is size x2 minus as there is a center
        for (int i = 1; i < size * 2; i++) {
            for (int j = 1; j < size * 2; j++) {
                //find the abs value of i, j
                int absI = Math.abs(i - size);
                int absJ = Math.abs(j - size);
                //if i+j is not the length from center, then print the space, else print the char
                if (absI + absJ != size - 1) {
                    sb.append(' ');
                } else {
                    sb.append((char) ('A' + (size - absI - 1)));
                }
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}