public class AppleProxy implements fruit {
    fruit f;
    public AppleProxy(fruit f){
        this.f = f;
    }
    @Override
    public void eat(){
        f.eat();
    }
}
