package pro.sky;

public class Main {

    public static void main(String[] args) {
	    // Task 1. Client OS and mobile applications
        // I choose boolean variable type for clientOS to avoid additional checking
        // for wrong values, like int clientOS = 1; we need to check if clientOS == 0,
        // clientOS == 1, or other value (error!). Boolean type have not such vulnerability :)
        boolean clientOS = true; // true = Android, false = iOS
        if(clientOS){
            System.out.println("Установите версию приложения для Android по ссылке! Ой! " +
                    "У нас нет приложения для Android! :(");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // Task 2. Client OS, mobile device age and mobile applications

        clientOS = false; // Let it be iOS :)
        // Well, this is not so good decision to represent years by int type, but this is for
        // educational purposes only. Normally we should use Java class java.util.Date :)
        int clientDeviceYear = 2077; // Hey, Cyberpunk!
        boolean before2015OrNot = clientDeviceYear < 2015;

        if(clientOS){
            if(before2015OrNot) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке. " +
                        "Ой! А у нас и облегченной версии приложения для Android нет!");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке! Ой! " +
                        "У нас нет приложения для Android! :(");
            }
        } else {
            if(before2015OrNot){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        // Task 3. Leap year or not
        int year = 2077; // Hey, Choomba!
        boolean isFourHundredth = (year % 400) == 0, isHundredth = (year % 100) == 0,
            isFourth = (year % 4) == 0;

        if(isFourHundredth) {
            System.out.println(year + " год является високосным");
        } else if(isHundredth) {
            System.out.println(year + " год не является високосным");
        } else if(isFourth) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Task 4. Urgent bank card delivery

        float deliveryDistance = 91.5f; // Delivery distance is a float type variable!
        int deliveryDays = 1;

        if(deliveryDistance < 0f){
            System.out.println("Ошибка! Расстояние до клиента не может быть отрицательным!");
            return;
        } else if(deliveryDistance > 20.0f && deliveryDistance <= 60.0f) {
            deliveryDays++;
        } else if(deliveryDistance > 60.0f && deliveryDistance <= 100.0f) {
            deliveryDays += 2;
        } else {
            System.out.println("Приносим извинения за неудобства, мы не доставляем карты клиентам, " +
                    "живущим дальше, чем 100 км. от офиса банка");
            return;
        }
        System.out.println("На доставку вашей карты потребуется дней: " + deliveryDays +
                "\nСпасибо, что воспользовались услугами нашего банка");

        // Task 5. Switch operator & four seasons

        int monthNumber = 12;

        switch(monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима! Крестьянин торжествуя на дровнях обновляет путь...");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна, весна! как воздух чист!\n" +
                        "Как ясен небосклон!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето красное, будь со мной!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Унылая пора! Очей очарованье! Приятна мне твоя прощальная краса");
                break;
            default:
                System.out.println("Ошибка в переменной monthNumber! Смотри внимательно " +
                        "что пишешь, писатель! :)");
                return;
        }
    }
}
