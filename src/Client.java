public class Client {
    public static void main(String []args){
        //fruit f = new AppleProxy(new Apple());
        LogHandler logHandler = new LogHandler();
        fruit a = (fruit)logHandler.newProxyInstance(new Apple());
        a.eat();
    }
}
