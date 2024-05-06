public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded;

    public InheritanceSortedIntList() {
        super();
        totalAdded = 0;
    }

    @Override
    public boolean add(int value) {
        boolean added = super.add(value);
        if (added) {
            totalAdded++;
        }
        return added;
    }

    @Override
    public boolean addAll(IntegerList list) {
        boolean added = super.addAll(list);
        if (added) {
            totalAdded += list.size();
        }
        return added;
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}
