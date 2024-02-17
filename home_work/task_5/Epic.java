package Lessons.lesson_22.home_work.task_5;

import java.util.ArrayList;

public class Epic extends Task{
    private ArrayList<Task> subTasks;

    public Epic(String title, String description) {
        super(title, description);
        this.subTasks = new ArrayList<>();
    }

    public ArrayList<Task> getSubTask() {
        return subTasks;
    }

    public void addSubTask(Task subTask){
        subTasks.add(subTask);
    }

    public void setStatus(Status status){
        super.setStatus(status);
        if(status == Status.DONE){
            for (Task subTask : subTasks){
                if(subTask.getStatus() != Status.DONE){
                    return;
                }
            }
            super.setStatus(Status.DONE);
        }
    }


}
