package ru.netology.javaqa.javaqamvn.servises;
public class CalcService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {

            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
               // money = money / 3;

            } else {
                money = money + income - expenses;
               // money = money - expenses;
            }
        }
        return count;
    }

}

