package OOP.s2.Home_Work;

public interface QueueBehavior {
    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();

    void cancelOrder(Actor actor);
}