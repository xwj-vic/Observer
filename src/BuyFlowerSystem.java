import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;

/**
 * Created by xuweijie on 2016/9/20.
 */
public class BuyFlowerSystem implements Subject {
    private ArrayList<Data_Bean> observers;
    private String newflower;
    private String price;

    public BuyFlowerSystem() {
        observers=new ArrayList<>();
    }


    @Override
    public void registerObserver(Data_Bean data_bean) {
        observers.add(data_bean);
        System.out.println("注册成功！");
        System.out.println("尊敬的 "+data_bean.getEmail()+"用户："+"欢迎您成为我们的最伟大的客户！");
    }

    @Override
    public void removeObserver(Data_Bean data_bean) {
        int i=observers.indexOf(data_bean);
        if(i>=0){
            observers.remove(i);
            System.out.println("已经取消注册！");
        }else{
            System.out.println("您还未注册，不可进行此操作！");
        }
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            Observer observer=observers.get(i).getObserver();
            observer.update(newflower,price);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(String newflower,String price){
        this.newflower=newflower;
        this.price=price;
        measurementsChanged();
    }
}
