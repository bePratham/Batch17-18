package CustomArrayList;

import java.util.Arrays;

public class CustomArrayListGen<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    public int size = 0;
    public CustomArrayListGen(){
        this.data =new Object[DEFAULT_SIZE];
    }
    public void add(T d){
        if(isFull()) resize();
        data[size++] = d;
    }
    private void resize() {
        Object []temp = new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]= data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }
    public Object remove(){
        Object remove = data[--size];
        return remove;
    }
    public void set(int index,Object value){
        data[index]= value;
    }
    @Override
    public String toString(){
        return Arrays.toString(data)+"";
    }
}
