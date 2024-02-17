package Lessons.lesson_22.home_work.task_5;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Task task1 = new Task("Сделать домашку", "Посмотреть видеозапись и написать проект ");
        Task task2 = new Task("Подготовиться к экзамену", "Подготовиться к файналу по КомпМат");

        Epic epic1 = new Epic("Идти на работу", "участие во встрече");
        Epic epic2 = new Epic("Разработка проекта", "Разработка проекта");
        Task subTask1 = new Task("Забронировать отель", "забронировать отель");
        Task subTask2 = new Task("Купить билеты", "купить билеты");
        Task subTask3 = new Task("Найти ресурсы", "найти ресурсы");


        epic1.addSubTask(subTask1);
        epic1.addSubTask(subTask2);
        epic2.addSubTask(subTask3);



        taskManager.createTask(task1);
        taskManager.createTask(task2);
        taskManager.createTask(epic1);
        taskManager.createTask(epic2);

        System.out.println("Список задач:");
        for (Task task : taskManager.getTasks()) {
            System.out.println(task.getId() + ": " + task.getTitle() + " - " + task.getDescription() + " - " + task.getStatus());
        }

        task1.setStatus(Status.IN_PROGRESS);
        subTask1.setStatus(Status.DONE);
        subTask2.setStatus(Status.IN_PROGRESS);
        subTask3.setStatus(Status.DONE);
        taskManager.updateTask(task1);
        taskManager.updateTask(subTask1);
        taskManager.updateTask(subTask2);
        taskManager.updateTask(subTask3);

        System.out.println("\nПосле изменения статусов:");
        for (Task task : taskManager.getTasks()) {
            System.out.println(task.getId() + ": " + task.getTitle() + " - " + task.getDescription() + " - " + task.getStatus());
        }

        taskManager.deleteTaskById(task1.getId());
        taskManager.deleteTaskById(epic2.getId());

        System.out.println("\nПосле удаления задач и эпика:");
        for (Task task : taskManager.getTasks()) {
            System.out.println(task.getId() + ": " + task.getTitle() + " - " +  task.getDescription() + " - " + task.getStatus());
        }
    }
}
