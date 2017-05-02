package com.pattern.behavior.piterate.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timaimee on 2017/5/2.
 */
public class ConcreteIterate implements Iterate {
    List<Object> mData = new ArrayList<>();
    private int position = 0;

    public ConcreteIterate(List<Object> data) {
        this.mData = data;
    }

    @Override
    public Object first() {
        System.out.println("first item");
        if (isEmpty()) {
            return null;
        } else {
            return mData.get(0);
        }
    }

    @Override
    public Object next() {
        position++;
        if (!isEmpty() && mData.size() > position) {
            return mData.get(position);
        } else {
            return null;
        }

    }

    @Override
    public boolean isDone() {
        if (isEmpty()) {
            return true;
        }
        return position >= mData.size() ? true : false;
    }

    @Override
    public Object currentItem() {
        if (isEmpty() || mData.size() <= position) {
            return null;
        } else {
            return mData.get(position);
        }
    }

    public boolean isEmpty() {
        if (null == mData || mData.isEmpty() || mData.size() <= 0) {
            return true;
        } else {
            return false;

        }
    }
}
