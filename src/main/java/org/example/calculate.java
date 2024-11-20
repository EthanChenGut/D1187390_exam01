package org.example;

public class calculate {
    public calculate() {
    }

    public static int calculateprice(int day, int member, int s, int ticket) throws Exception {
        int total = 0;

        switch (s) {
            case 1: // 季後賽
                total = (member == 1) ? 800 : 1000;
                break;

            case 0: // 無季後賽
                if (ticket == 0) {
                    total = switch (day) {
                        case 1 -> // 平日
                                (member == 1) ? 480 : 600;
                        case 0 -> // 假日
                                (member == 1) ? 400 : 500;
                        default -> total;
                    };
                } else if (ticket == 1) {
                    total = 250;
                }
                break;
        }

        return total;
    }
}
