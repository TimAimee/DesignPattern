package com.pattern.structure.pbridge.abstraction;

import com.pattern.structure.pbridge.implementor.FileExploreImp;

/**
 * Created by timaimee on 2017/4/27.
 */
public abstract class FileExploreAbstraction {
    protected FileExploreImp implementor;

    public void setImplementor(FileExploreImp implementor) {
        this.implementor = implementor;
    }

    public abstract void exploreFile();
}
