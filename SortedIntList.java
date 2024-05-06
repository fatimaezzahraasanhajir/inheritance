import java.util.ArrayList;
import java.util.List;

public class SortedIntList implements IntegerList {
    private List<Integer> list;

    public SortedIntList() {
        list = new ArrayList<>();
    }

    @Override
    public boolean add(int value) {
        
        int index = 0;
        while (index < list.size() && list.get(index) < value) {
            index++;
        }
        list.add(index, value);
        return true;
    }

    @Override
    public boolean addAll(IntegerList otherList) {
    
        for (int i = 0; i < otherList.size(); i++) {
            add(otherList.get(i));
        }
        return true;
    }

    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public boolean remove(int value) {
        return list.remove(Integer.valueOf(value));
    }

    @Override
    public boolean removeAll(IntegerList otherList) {
        boolean modified = false;
        for (int i = 0; i < otherList.size(); i++) {
            modified |= remove(otherList.get(i));
        }
        return modified;
    }

    @Override
    public int size() {
        return list.size();
    }
}
