package com.pattern.structure.pbridge.implementor;

/**
 * Created by timaimee on 2017/4/27.
 */
public class MySqlFileExplore implements FileExploreImp {
    @Override
    public String readContent() {
        System.out.println("read content from mysql");
        return "mysql";
    }
}
