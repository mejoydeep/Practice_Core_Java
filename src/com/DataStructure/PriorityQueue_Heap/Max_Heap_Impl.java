package com.DataStructure.PriorityQueue_Heap;

public class Max_Heap_Impl {

    public int[] array;
    public int capacity;
    public int count;
    public int heap_type;

    public Max_Heap_Impl(int capacity, int heap_type) {
        this.capacity = capacity;
        this.heap_type = heap_type;
        this.count = 0;
        this.array = new int[capacity];
    }

    public int Parent(int i){
        if (i <=0 || i >= this.capacity){
            return -1 ;
        }
        return (i-1)/2;
    }

    public int LeftNode (int i){
        int left= 2*i +1;
        if (left>this.count){
            return -1;
        }
        return left;
    }

    public int RightNode (int i){
        int right= 2*i +2;
        if (right >this.count){
            return -1;
        }
        return right;
    }

/*
    Maximum element in a max-heap
*/
    public int GetMaximum(){

        if (this.count==0){
            return -1;
        }
        return this.array[0];
    }

/*
    Heapifying from top to bottom
*/
    public void ProcolateDown( int i){
        int l,r,max;
        l=LeftNode(i);
        r=RightNode(i);

        if (l != -1 && this.array[l]> this.array[i]){
            max=l;
        }
        else max=i;
        if (r !=-1 && this.array[r] >this.array[max]){
            max=r;
        }

        if (max !=i){
            int temp= this.array[i];
            this.array[i]=this.array[max];
            this.array[max]=temp;
            ProcolateDown(max);
        }
    }

/*
     Inserting an element into the heap
*/

    public void Insert( int data){
        int i;
        if (this.count ==this.capacity){
             ResizeHeap();
        }
        this.count++;
        i=this.count-1;
        if (i !=0){
            while (i >=0 && data> this.array[(i-1)/2]){
                this.array[i] = this.array[(i-1)/2];
                i=(i-1)/2;
            }
        }
        this.array[i]=data;
    }

/*
    Resizing the array
*/
    public void ResizeHeap(){
        int[] array_old= new int[this.capacity];
        System.arraycopy(this.array,0,array_old,0,this.count);
        this.array=new int[this.capacity *2];

        for (int i=0;i<this.capacity;i++){
            this.array[i]=array_old[i];
        }
        this.capacity*=2;
        array_old=null;
    }

/*
    Printing the HEAP
*/
    public void printHeap(){

        for (int i=0; i<this.count;i++){
            System.out.print(this.array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Max_Heap_Impl obj1=new Max_Heap_Impl(2,1);

        obj1.Insert(31);
        obj1.Insert(10);
        obj1.Insert(16);
        obj1.Insert(9);
        obj1.Insert(8);
        obj1.Insert(14);
        obj1.Insert(12);
        obj1.Insert(3);
        obj1.Insert(2);
        obj1.Insert(5);
        obj1.Insert(7);

        obj1.printHeap();

        obj1.array[1]=1;
        System.out.println("After changing the element");
        obj1.printHeap();

        obj1.ProcolateDown(1);
        System.out.println("After heapifying :");
        obj1.printHeap();

        System.out.println("Maximum element in the heap :" +obj1.GetMaximum());



    }

}
