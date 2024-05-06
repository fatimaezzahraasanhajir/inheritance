public class DelegationSortedIntList implements IntegerList {
    private SortedIntList sortedIntList;
    private int totalAdded;

    public DelegationSortedIntList() {
        sortedIntList = new SortedIntList();
        totalAdded = 0;
    }

    @Override
    public boolean add(int value) {
        boolean added = sortedIntList.add(value);
        if (added) {
            totalAdded++;
        }
        return added;
    }

    @Override
    public boolean addAll(IntegerList list) {
        boolean added = sortedIntList.addAll(list);
        if (added) {
            totalAdded += list.size();
        }
        return added;
    }

    @Override
    public int get(int index) {
        return sortedIntList.get(index);
    }

    @Override
    public boolean remove(int value) {
        return sortedIntList.remove(value);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return sortedIntList.removeAll(list);
    }

    @Override
    public int size() {
        return sortedIntList.size();
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}
