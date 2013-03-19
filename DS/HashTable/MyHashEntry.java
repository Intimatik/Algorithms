package ru.javabean.hashtable;

public class MyHashEntry {
    private int key;
    private int value;

    MyHashEntry(int key, int value) {
      this.key = key;
      this.value = value;
    }

    public int getValue() {
      return value;
    }
    public int getKey() {
      return key;
    }
}