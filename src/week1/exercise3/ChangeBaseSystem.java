/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.exercise3;

/**
 *
 * @author FPT
 */
public class ChangeBaseSystem {

    private String input;

    public ChangeBaseSystem() {
    }

    public ChangeBaseSystem(String input) {
        if (input == null) {
            System.out.println("Can not be null");
        }
        this.input = input;
    }

    public String dectobi() {
        StringBuilder binary = new StringBuilder();

        int num = Integer.parseInt(input);
        if (num == 0) {
            return "0";
        }
        while (num > 0) {
            int r = num % 2;
            binary.append(r);
            num /= 2;
        }
        return binary.reverse().toString();
    }

    public String dectohex() {
        StringBuilder hex = new StringBuilder();
        int num = Integer.parseInt(input);
        while (num > 0) {
            int r = num % 16;
            if (r < 10) {
                hex.append((char) ('0' + r));
            } else {
                hex.append((char) ('A' + (r - 10)));
            }
            num /= 16;
        }

        return hex.reverse().toString();
    }

    public int bitodec() {
        int length = input.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            char a = input.charAt(length - 1 - i);
            if (a == '1') {
                result += Math.pow(2, i);
            } else if (a != '0') {
                throw new IllegalArgumentException("Binary only accept 1 and 0");
            }
        }

        return result;
    }

    public String bittohex() {

        while (input.length() % 4 != 0) {
            input = "0" + input;
        }
        StringBuilder hex = new StringBuilder();

        for (int i = 0; i < input.length(); i += 4) {
            String group = input.substring(i, i + 4);
            ChangeBaseSystem c = new ChangeBaseSystem(group);
            int decimal = c.bitodec();
            String heximal = dectohex();

            if (decimal < 10) {
                hex.append((char) ('0' + decimal));
            } else {
                hex.append((char) ('A' + (decimal - 10)));
            }
        }

        return hex.toString();
    }

    public int hextodec() {
        int length = input.length();
        int result = 0;

        for (int i = 0; i < length; i++) {
            char c = input.toUpperCase().charAt(length - 1 - i);
            int value;

            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                value = 10 + (c - 'A');
            } else {
                throw new IllegalArgumentException("Hexa only accepts 0-F");
            }
            result += value * Math.pow(16, i);
        }
        return result;
    }

    public String hextobi() {
        StringBuilder binary = new StringBuilder();
        int dec_temp = this.hextodec();
        ChangeBaseSystem baseSystem = new ChangeBaseSystem(String.valueOf(dec_temp));
        String result = baseSystem.dectobi();
        return result;
    }

}
