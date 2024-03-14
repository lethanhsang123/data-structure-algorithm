package data_structures.arrays;

public interface HighOperation <T>{
    int insert(T value);
    boolean find(T value);
    int delete(T value);
    int size();
    void printf();
}
