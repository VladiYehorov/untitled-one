public class New {
    public static void main(String[] args) {
        //Вася получает зарплату в 5.6 евро в час. Он работает 12 часов в день,
        // у него нет выходных, кроме 31 декабря. Он работает 364 дня в году.
        //Сколько часов отработает Вася за год и сколько он заработает денег.
 double moneyinHourVasja = 5.6;
 int moneyHoureDay = 12;
 int daysYeare = 364;
        System.out.println("ЗП Васи за год");
        System.out.println(moneyinHourVasja * moneyHoureDay *daysYeare);
        System.out.println(daysYeare * moneyHoureDay);
        double cashFromWork = moneyinHourVasja * moneyHoureDay * (daysYeare - 14);
        System.out.println(cashFromWork);
        double vacationMoney = moneyinHourVasja * moneyHoureDay *14 / 2;
        System.out.println(vacationMoney);
        System.out.println(cashFromWork + vacationMoney);


//Ему дали отпуск в течение двух недель, он оплачивается в 50% от зп, пересчитайте зарплату за год




    }
}
