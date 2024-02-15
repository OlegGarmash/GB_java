package OOP.s2.task01;

public interface QueueBehavior {
    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();

}
