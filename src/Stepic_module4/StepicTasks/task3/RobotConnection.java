package Stepic_module4.StepicTasks.task3;

public interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);
    @Override
    void close();
}
