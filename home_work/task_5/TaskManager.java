package Lessons.lesson_22.home_work.task_5;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
       tasks = new ArrayList<>();
    }

    public ArrayList<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public void deleteAllTasks(){
        tasks.clear();
    }

    public Task getTaskById(int id){
        for (Task task: tasks) {
            if(task.getId() == id){
                return task;
            }
        }
        return null;
    }

    public void createTask(Task task){
        tasks.add(task);
    }

    public void updateTask(Task task){
        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).getId() == task.getId()){
                tasks.set(i, task);
                break;
            }

        }
    }

    public void deleteTaskById(int id){
        Task taskRemove = null;
        for (Task task: tasks) {
            if(task.getId() == id){
                taskRemove = task;
                break;
            }
        }
        if(taskRemove !=null){
            tasks.remove(taskRemove);
        }
    }

    public ArrayList<Task> getSubTaskOfEpic(Epic epic){
        ArrayList<Task> subTask = new ArrayList<>();
        for (Task task: tasks) {
            if(task instanceof Epic){
                Epic currenEpic = (Epic) task;
                if(currenEpic.getId() == epic.getId()){
                    subTask.addAll(currenEpic.getSubTask());
                }
            }
        }
        return subTask;
    }


}
