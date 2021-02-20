import java.util.Date;
import java.util.List;

public class TimeCheck {
    public int addCheckTime(List list, int amountOfElements){
        Date start = new Date();
        for(int i = 0; i < amountOfElements; i++){
            list.add(i);
        }
        Date finish = new Date();
        return (int) (finish.getTime() - start.getTime());
    }

    public int getCheckTime(List list, int amountOfElements){
        Date start = new Date();
        for(int i = 0; i < amountOfElements; i++){
            int x = (int)list.get(i);
        }
        Date finish = new Date();
        return (int) (finish.getTime() - start.getTime());
    }

    public int deleteCheckTime(List list, int amountOfElements){
        Date start = new Date();
        for(int i = amountOfElements - 1; i >= 0; i--){
            list.remove(i);
        }
        Date finish = new Date();
        return (int) (finish.getTime() - start.getTime());
    }
}