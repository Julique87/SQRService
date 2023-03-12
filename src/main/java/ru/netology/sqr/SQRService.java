package ru.netology.sqr;

public class SQRService {

    int count = 0;

    public int calcSqrtRange(int upperValue, int underValue) {

        for (int i = 10; i <= 99; i++) {

            if ((i * i >= upperValue) && (i * i <= underValue)) {
                count++;
            }
        }
        return count;
    }
}
