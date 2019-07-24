import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler {
    private Object target;
    public Object newProxyInstance(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }
    @Override
    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable{
        Object ret = null;
        try{
            ret = method.invoke(target,args);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ret;
    }

}
