package patternStrategy;

 class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }
    @Override
    public void display() {
        System.out.println("Im model duck");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
