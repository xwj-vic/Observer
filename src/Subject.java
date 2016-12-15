/**
 * Created by xuweijie on 2016/9/20.
 */
public interface Subject {

    public void registerObserver(Data_Bean data_bean );
    public void removeObserver(Data_Bean data_bean );
    public void notifyObserver();
}


