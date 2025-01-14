/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package week2.exercise1;

/**
 *
 * @author FPT
 */
 public enum Operations {
        ADD("+"),
        MINUS("-"),
        MULTIPLY("*"),
        DIVIDE("/"),
        POWER("^"),
        EQUALS("=");
        private String symbol;

        private Operations() {
        }

        private Operations(String symbol) {
            this.symbol = symbol;
        }

        public String getsymbol() {
            return symbol;
        }

        public static Operations checkoperation(String symbol) {
            for (Operations p : Operations.values()) {
                if (p.symbol.equals(symbol)) {
                    return p;
                }
            }
            return null;
        }

    }
