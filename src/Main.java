public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        //задача 1
        System.out.println("\nЗадача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
    }
    public static void task2() {
        //задача 2
        System.out.println("\nЗадача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpper);
    }
    public static void task3() {
        //задача 3
        System.out.println("\nЗадача 2");
        String fullName = "Иванов Семён Семёнович";
        String fullNameChanged = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameChanged);
    }
}