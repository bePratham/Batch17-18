package CustomArrayList;

import java.util.Arrays;

public class CustomArrayList {
    private String [] data;
    private static int DEFAULT_SIZE = 10;
    public int size = 0;
    public CustomArrayList(){
        this.data =new String[DEFAULT_SIZE];
    }
    public void add(String num){
        if(isFull()) resize();
        data[size++] = num;
    }
    private void resize() {
        String []temp = new String[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]= data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }
    public String remove(){
        String remove = data[--size];
        return remove;
    }
    @Override
    public String toString(){
        return Arrays.toString(data)+"";
    }
}
