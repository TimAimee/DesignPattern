package com.pattern.creat.pbuilder;

import com.pattern.creat.pbuilder.normal.NormalDirector;
import com.pattern.creat.pbuilder.bean.PersonBean;
import com.pattern.creat.pbuilder.complex.ComplexDirector;
import com.pattern.creat.pbuilder.normal.concrete.BuilderLucy;
import com.pattern.creat.pbuilder.normal.concrete.BuilderTimAimee;

/**
 * [Type-Create] Builder Pattern
 *
 * Created by timaimee on 2017/4/17.
 */
public class ClientBuilder {
    public static void main(String args[]) {

        //one object,a variety of combinations
        ComplexDirector complexDirector0 = new ComplexDirector();
        PersonBean personBean0 = complexDirector0.creatPerson().setAge(18).setName("timaimee").bulider();
        System.out.println("Complex Builder:" + personBean0.toString());

        //A set of combinations, a variety of forms,[example xml,json,dom.]
        NormalDirector concretePerson0 = new NormalDirector();
        concretePerson0.setPersonBuilder(new BuilderTimAimee());
        concretePerson0.creatPerson();
        PersonBean person0 = concretePerson0.getPerson();
        System.out.println("Normal Builder 0:" + person0);

        NormalDirector concretePerson1 = new NormalDirector();
        concretePerson1.setPersonBuilder(new BuilderLucy());
        concretePerson1.creatPerson();
        PersonBean person1 = concretePerson1.getPerson();
        System.out.println("Normal Builder 1:" + person1);
    }
}
