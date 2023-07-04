public class CustomArraylist<T> {
    private Object[] data;
    private int size;
    private int DEFAULT_SIZE = 10;

    CustomArraylist() {
        data = new Object[DEFAULT_SIZE];
        size = 0;
    }

    public void add(T value) {
        if (size == data.length) {
            this.resize();
        }

        this.data[this.size++] = value;

    }

    public T get(int index) {
        if (index >= this.size) {
            System.err.println("Out of index access");
        }
        return (T) this.data[index];
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String ans = "";

        for (int i = 0; i < size; i++) {
            ans = ans + this.data[i] + ", ";
        }

        return ans;
    }

    public int size() {
        return this.size;
    }

    public int maxLen() {
        return this.data.length;
    }

    private void resize() {
        Object[] temp = new Object[2 * this.size];

        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }

        this.data = temp;
    }
}
