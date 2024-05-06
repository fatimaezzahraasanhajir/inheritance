public interface IntegerList {
    boolean add(int value);
    boolean addAll(IntegerList list);
    int get(int index);
    boolean remove(int value);
    boolean removeAll(IntegerList list);
    int size();
}
