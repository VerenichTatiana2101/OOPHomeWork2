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

    boolean getIsMakeOrder(){
        return isMadeOrder;
    }

    boolean getIsTakeOrder(){
        return isTookOrder;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}
