package zoho;

import java.util.*;

/**
 * BinTOHex
 */
public class BinTOHex {
    static void createMap(HashMap<String, Character> um) {
        um.put("0000", '0');
        um.put("0001", '1');
        um.put("0010", '2');
        um.put("0011", '3');
        um.put("0100", '4');
        um.put("0101", '5');
        um.put("0110", '6');
        um.put("0111", '7');
        um.put("1000", '8');
        um.put("1001", '9');
        um.put("1010", 'A');
        um.put("1011", 'B');
        um.put("1100", 'C');
        um.put("1101", 'D');
        um.put("1110", 'E');
        um.put("1111", 'F');
    }

    static String convertBinToHex(String bin) {
        int l = bin.length();
        int t = bin.indexOf('.');
        System.out.println(l);
        System.out.println(t);
        int len_left = t != -1 ? t : l;
        System.out.println(len_left);
        for (int i = 1; i <= (4 - len_left % 4) % 4; i++) {
            bin = '0' + bin;
        }
        System.out.println(bin);

        if (t != -1) {
            int len_right = l - len_left - 1;
            System.out.println(len_right);
            for (int i = 1; i <= (4 - len_right % 4) % 4; i++) {
                bin = bin + '0';
            }
        }

        System.out.println(bin);

        HashMap<String, Character> bin_map = new HashMap<>();
        createMap(bin_map);
        int i = 0;
        String hex = "";

        while (true) {
            hex += bin_map.get(bin.substring(i, i + 4));
            i += 4;

            if (i == bin.length()) {
                break;
            }

            if (bin.charAt(i) == '.') {
                hex += '.';
                i++;
            }
        }

        return hex;
    }

    public static void main(String[] args) {
        String bin = "1111001010010100001.010110110011011";
        System.out.println(convertBinToHex(bin));
    }
}
// public class BinTOHex {
// public static char switchcase(String ch) {
// switch (ch) {
// case "0001":
// return '1';
// case "0010":
// return '2';
// case "0011":
// return '3';
// case "0100":
// return '4';
// case "0101":
// return '5';
// case "0110":
// return '6';
// case "0111":
// return '7';
// case "1000":
// return '8';
// case "1001":
// return '9';
// case "1010":
// return 'A';
// case "1011":
// return 'B';
// case "1100":
// return 'C';
// case "1101":
// return 'D';
// case "1110":
// return 'E';
// case "1111":
// return 'F';
// case ".":
// return '.';
// default:
// System.out.println("enter the correct Binary value...");
// break;

// }
// return '0';
// }

// public static void main(String[] args) {
// String bin = "1111001010010100001.010110110011011"; //794A1.5B36 794A1D9B

// int i = bin.length() - 1;
// StringBuilder sb = new StringBuilder();
// StringBuilder newsb = new StringBuilder();
// while (i >= 0) {
// if (bin.charAt(i) == '.') {
// newsb.append('.');
// }

// if (sb.length() == 4) {
// newsb.append((switchcase(sb.reverse().toString())));
// sb.setLength(0);
// }
// sb.append(bin.charAt(i));
// i--;
// }

// int rem = bin.length() % 4;
// String str = "";
// for (int j = 0; j < rem; j++) {
// if (bin.charAt(j) == '.') {
// newsb.append('.');
// } else {
// str += bin.charAt(j);
// }
// }
// // System.out.println(str);

// int num = Integer.parseInt(str);
// // int num = 101;
// int dec = 0, power = 0;
// while (num != 0) {
// int r = num % 10;
// dec += r * Math.pow(2, power);
// num /= 10;
// power++;
// }

// char db = (char) (dec + '0');
// newsb.append(db);

// System.out.println(newsb.reverse());
// }

// }
