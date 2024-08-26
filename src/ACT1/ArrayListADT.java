package ACT1;

public class ArrayListADT<T> {
    private T[] array; //this is where the actual items are stored
    private int size; //tracks of how many items are currently in the list
    private int capacity; //how much space is currently available in the array

    // Constructor initializes the array with a default capacity
    @SuppressWarnings("unchecked")
    public ArrayListADT() {
        this.capacity = 4;  
        this.array = (T[]) new Object[capacity];  
        this.size = 0;  
    }

    // Adds an element to the end of the array
    // If the array is full, it resizes to double the current capacity
    public void add(T element) {
        if (size == capacity) {
            resize(capacity * 2);  
        }
        array[size++] = element;  
    }

    // Inserts an element at a specific index, shifting subsequent elements to the right
    // Resizes the array if needed
    public void insert(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (size == capacity) {
            resize(capacity * 2);  
        }
       
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;  
        size++; 
    }

    // Removes an element at a specific index, shifting subsequent elements to the left
    // If the array becomes too sparse, it resizes to half the current capacity
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T removedElement = array[index];  
        
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;  
        if (size > 0 && size == capacity / 4) {
            resize(capacity / 2);
        }
        return removedElement; 
    }

    // Retrieves the element at a specific index
    // Throws an exception if the index is out of bounds
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];  
    }

    
    public int size() {
        return size;
    }

   
    public boolean isEmpty() {
        return size == 0;
    }

    // Resizes the array to a new capacity
    // Copies the existing elements to a new array with the updated capacity
    @SuppressWarnings("unchecked")
    private void resize(int newCapacity) {
        T[] newArray = (T[]) new Object[newCapacity];  
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i]; 
        }
        array = newArray;  
        capacity = newCapacity;  
    }
}