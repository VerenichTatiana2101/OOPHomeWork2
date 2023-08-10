/*
Класс нарушает принцип единственной ответственности. 
Класс должен иметь только одну причину для изменения. 
В данном случае класс имеет три поля и два логических флага, которые не связаны друг с другом. 
Лучше разделить их на разные классы, которые имеют свои собственные обязанности. 
Таким образом, если одна обязанность изменится, это не повлияет на другие обязанности.

Принцип открытости / закрытости, принцип подстановки не нарушается. 
Не использовали наследование или полиморфизм.

Принцип разделения интерфейса не нарушается. Не использовали интерфейсы в классе.

Принцип инверсии зависимости не нарушается, не использовали зависимости. 
 */

public abstract class Actor implements ActorBehaviour {
    private String name;
    private boolean isMadeOrder;
    private boolean isTookOrder;

    public Actor(String name, boolean isMadeOrder, boolean isTookOrder) {
        this.name = name;
        this.isMadeOrder = isMadeOrder;
        this.isTookOrder = isTookOrder;
    }

    String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor: name=" + name + ", makeOrder=" + isMadeOrder + ", takeOrder=" + isTookOrder;
    }

}
