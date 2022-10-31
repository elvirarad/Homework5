import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            // Задача 1
            // мы не знаем, iOS или Android клиент использует.
            //Объявите переменную clientOS, которая равна 0 или 1. (0 — iOS, 1 — Android)
            //При отработке программы в консоли должно выдаваться сообщение об установке соответствующего приложения.
            //«Установите версию приложения для iOS/Android   по ссылке».

            System.out.println("Условный оператор ч.2");
            System.out.println("Решение задачи № 1");

            Scanner in = new Scanner(System.in);
            System.out.print("Укажите какой операционной системой Вы пользуетесь? Если iOS - напишите 0, если Android - 1 : ");
            int clientOS = in.nextInt();
            switch (clientOS) {
                case 0:
                    System.out.println ("Установите версию приложения для iOS по ссылке ...");
                    break;
                case 1:
                    System.out.println ("Установите версию приложения для Android по ссылке ...");
                    break;
                default:
                    System.out.println ("Вы ввели неверную цифру");
            }
            //in.close();
            System.out.println(" ");

            // Задача 2
            //два условий — ОС телефона (iOS или Android) и ГОДА производства.
            //Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии.
            //Например, для iOS: «Установите облегченную версию приложения для iOS по ссылке».
            //для Android так: «Установите облегченную версию приложения для Android по ссылке».
            //При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение об установке приложения.
            //Для обозначения года создания используйте переменную clientDeviceYear, где необходимо указать 2015 год.
            System.out.println("Решение задачи № 2");

            System.out.print("Укажите год выпуска Вашего телефона в формате XXXX :");
            int clientDeviceYear = in.nextInt();
            System.out.print("Укажите какой операционной системой Вы пользуетесь? Если iOS - напишите 0, если Android - 1 : ");
            clientOS = in.nextInt();
            boolean deviceAfter2015 = clientDeviceYear >= 2015;

            switch (clientOS) {
                case 0: {
                    if (deviceAfter2015) {
                        System.out.println ("Установите версию приложения для iOS по ссылке ...");
                        break;
                    }
                    else
                        System.out.println ("Установите облегченную версию приложения для iOS по ссылке» ...");
                    break;
                }
                case 1:
                    if (deviceAfter2015) {
                        System.out.println ("Установите версию приложения для Android  по ссылке ...");
                        break;
                    } else
                        System.out.println ("Установите облегченную версию приложения для Android  по ссылке» ...");
                    break;
                default:
                    System.out.println ("Вы ввели неверную цифру");
            }
            //in.close();
            System.out.println(" ");

            // Задача 3
            //определить, является ли год високосным или нет.
            //Переменную года - year, в которую можно подставить значение интересующего нас года. Например, 2021.
            //выводить соответствующее сообщение: « …. год является/ не является високосным».
            //справка: високосным - каждый четвертый год, но не является каждый сотый.
            //Также високосным является каждый четырехсотый год.
            System.out.println("Решение задачи № 3");
            System.out.print("Узнаем, является ли высокосным год. Укажите год в формате XXXX :");
            int year = in.nextInt();
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " год является високосным");
            } else if (year % 400 == 0){
                System.out.println(year + " год является високосным");
            } else
                System.out.println(year + " год не является високосным");


            System.out.println(" ");
            // Задача 4
            //доставка банковских карт на дом с четкой датой доставки. Чтобы известить клиента о том,
            // когда будет доставлена его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
            //Правила доставки:
            //Доставка в пределах 20 км занимает сутки.
            //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
            //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
            //То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
            //Вывести сообщение в консоль: "Потребуется дней: " + срок доставки
            //Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
            System.out.println("Решение задачи № 4");
            System.out.print("Укажите расстояние до клиента в км. :");
            int deliveryDistance = in.nextInt();
            int tameDelivery;
            if (deliveryDistance < 20){
                tameDelivery = 1;
            } else if (deliveryDistance < 60) {
                tameDelivery = 2;
            } else if (deliveryDistance < 100) {
                tameDelivery = 3;
            } else tameDelivery = 4;
            System.out.println(" ");
          if (tameDelivery == 4){
                System.out.print("Для доставки клиенту на расстоянии более 100 км невозможна");
            } else System.out.print("Для доставки клиенту на расстоянии " + deliveryDistance + "км. потребуется " + tameDelivery + " дней.");
          System.out.println(" ");

            // Задача 5
            //определить по номеру месяца в году, к какому сезону этот месяц принадлежит. Например, 1 месяц (он же январь) принадлежит к сезону зима.
            //Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
            //Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
            System.out.println("Решение задачи № 5");
            System.out.print("Укажите немер месяца в году :");
            int monthNumber = in.nextInt();
            switch (monthNumber){
                case 1:
                    System.out.println ("сезон - ЗИМА");
                    break;
                case 2:
                    System.out.println ("сезон - ЗИМА");
                    break;
                case 3:
                    System.out.println ("сезон - ВЕСНА");
                    break;
                case 4:
                    System.out.println ("сезон - ВЕСНА");
                    break;
                case 5:
                    System.out.println ("сезон - ВЕСНА");
                    break;
                case 6:
                    System.out.println ("сезон - ЛЕТО");
                    break;
                case 7:
                    System.out.println ("сезон - ЛЕТО");
                    break;
                case 8:
                    System.out.println ("сезон - ЛЕТО");
                    break;
                case 9:
                    System.out.println ("сезон - ОСЕНЬ");
                    break;
                case 10:
                    System.out.println ("сезон - ОСЕНЬ");
                    break;
                case 11:
                    System.out.println ("сезон - ЗИМА");
                    break;
                default:
                    System.out.println ("введена неверная цифра");
                    break;
            }
            in.close();
        }
}
