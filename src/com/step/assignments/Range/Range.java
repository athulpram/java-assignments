package com.step.assignments.Range;

import java.util.ArrayList;

public interface Range<T> {
    ArrayList<T> getAll();
    boolean contains(T value);
}
