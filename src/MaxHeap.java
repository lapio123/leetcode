import java.util.ArrayList;

import static java.util.Collections.swap;

public class MaxHeap {
    private ArrayList<Integer> data;

    public MaxHeap(int capacity) {
        this.data = new ArrayList<>(capacity);
    }

    public int size()
    {
        return data.size();
    }

    public int parent(int index)
    {
        return (index-1)/2;
    }

    public int leftChild(int index)
    {
        return (index*2+1);
    }

    public int rightChild(int index)
    {
        return (index*2+2);
    }

    public void add(int i)
    {
        this.data.add(i);
        siftUp(data.size()-1);
    }
    public void siftUp(int index)
    {
        while(index>0&&  this.data.get(parent(index))<this.data.get(index)  )
        {
            swap(this.data,parent(index),index);
            index=parent(index);
        }
    }
    public void printHeap()
    {
        for (int i=0;i<this.data.size();i++)
        {
            System.out.println(i+" : "+this.data.get(i));
        }
    }

}
