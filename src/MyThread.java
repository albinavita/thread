public class MyThread extends Thread{
    private int[] arrays;
    private int min;
    private int max;

    public MyThread(int[]arrays) {
        this.arrays = arrays;
    }
    public void run(){
        max = arrays[0];
        min = arrays[0];
        for (int i = 0; i < arrays.length; i++){
            if (min < arrays[i]) min = arrays[i];
            if (max > arrays[i]) max = arrays[i];
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
