package com.pattern.structure.pbridge.abstraction;

/**
 * Created by timaimee on 2017/4/27.
 */
public class XmlFileExplore extends FileExploreAbstraction {
    @Override
    public void exploreFile() {
        String fileContent = implementor.readContent();
        System.out.println(fileContent + " explore xml");
    }
}
