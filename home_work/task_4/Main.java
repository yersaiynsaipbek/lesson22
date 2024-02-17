package Lessons.lesson_22.home_work.task_4;

public class Main {
    public static void main(String[] args) {
        Category electronics = new Category("Electronics");

        Product phone = new Product("iPhone 15", 600000, electronics);
        Product laptop = new Product("MacBook pro", 900000, electronics);
        Product tablet = new Product("iPad pro", 400000, electronics);

        electronics.addProduct(phone);
        electronics.addProduct(laptop);
        electronics.addProduct(tablet);

        Product mostExpensiveProduct = electronics.findExpensiveProduct();

        if (mostExpensiveProduct != null){
            System.out.println("Самый дорогой продукт: " + mostExpensiveProduct.getName());
            System.out.println("Цена: " + mostExpensiveProduct.getPrice());
        }else{
            System.out.println("Категория пустой");
        }
    }
}
