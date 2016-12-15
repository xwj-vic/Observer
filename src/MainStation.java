/**
 * Created by xuweijie on 2016/9/20.
 */

//观察者模式
public class MainStation {
    public static void main(String[] args){
        BuyFlowerSystem buyFlowerSystem=new BuyFlowerSystem();
        UserObserver userObserver=new UserObserver(buyFlowerSystem,"刘德华","liudehua","541535798@qq.com");
        buyFlowerSystem.setMeasurements("康乃馨","50元/支");
        userObserver.removeobserver();
    }
}
