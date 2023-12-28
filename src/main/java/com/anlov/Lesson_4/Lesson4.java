package com.anlov.Lesson_4;

public class Lesson4 {
    public static void main(String[] args) {
    Employee bob = new Employee("Abaskal Anu Davai", "junior", "aba@gmail.com", "+375 33 111 11 11", 1000.43, 25);
    bob.displayInfo();
    Employee diks = new Employee();
    diks.displayInfo();
    Employee[] empArray = new Employee[5];
    empArray[0] = bob;
    empArray[1] = new Employee("Antoni Anton Antonovich", "Python middle+", "antonov75@rambler.com", "+375 29 722 00 00", 2034, 27);
    empArray[2] = diks;
    empArray[3] = new Employee("Golovin Vladimir Vladimirovich", "Java mentor", "golova2@mail.ru", "+375 29 001 00 23", 1030.54, 21);
    empArray[4] = new Employee("Batler Max", "hacker", "unknown@rambler.com", "???", 9999.99, 37);
    }
}

