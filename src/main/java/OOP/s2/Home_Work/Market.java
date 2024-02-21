package OOP.s2.Home_Work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market implements MarketBehavior, QueueBehavior {
    private List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + ", добро пожаловать в магазин");
        queue.add(actor);
//        takeInQueue(actor);
    }

    @Override
    public void actorsInMarket() {
        for (Actor s : marketQueue) {
            System.out.println(s.getName());
        }
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        boolean bool = false;
        for (Actor s : marketQueue) {
            if (s.getName().equals(actor.getName())) {
                System.out.println(actor.getName() + " встал в очередь");
                marketQueue.remove(actor);
                queue.add(actor);
                bool = true;
            }
        }
        if (!bool)
            System.out.println("Покупатель с таким именем не найден!");
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                releasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }

    @Override
    public void cancelOrder(Actor actor) {
        marketQueue.remove(actor);
        for (Actor s : marketQueue) {
            System.out.println(s.getName());
        }
    }
}