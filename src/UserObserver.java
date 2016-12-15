/**
 * Created by xuweijie on 2016/9/20.
 */
public class UserObserver implements Observer,ShowData {

    private BuyFlowerSystem buyFlowerSystem;
    private String newflower;
    private String price;
    private Data_Bean data_bean;

    public UserObserver() {
    }

    public UserObserver(BuyFlowerSystem buyFlowerSystem, String name,String pwd,String email) {
        this.buyFlowerSystem = buyFlowerSystem;
        data_bean=new Data_Bean(name,pwd,email,this);
        buyFlowerSystem.registerObserver(data_bean);
    }

    public void removeobserver(){
        buyFlowerSystem.removeObserver(data_bean);
    }

    @Override
    public void update(String newflower, String price) {
        this.newflower=newflower;
        this.price=price;
        display();
    }

    @Override
    public void display() {
        System.out.println("有新商品上架啦！快来瞧一瞧吧！");
        System.out.println("商品："+newflower+" 价格："+price);
    }


}
