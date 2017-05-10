package com.pattern.structure.pcomposite;

import com.pattern.structure.pcomposite.abstracts.Company;
import com.pattern.structure.pcomposite.concrete.ConcreteCompany;
import com.pattern.structure.pcomposite.concrete.HRDepartMent;
import com.pattern.structure.pcomposite.concrete.ITDepartMent;

/**
 * [Type-Structure] Composite Pattern
 * Created by timaimee on 2017/5/9.
 */
public class ClientComposite {
    public static void main(String args[]) {
        Company root = new ConcreteCompany();
        root.setName("北京总公司");
        root.add(new HRDepartMent("总公司人力资源部"));
        root.add(new ITDepartMent("总公司财务部"));
        Company shandongCom = new ConcreteCompany("山东分公司");
        shandongCom.add(new HRDepartMent("山东分公司人力资源部"));
        shandongCom.add(new ITDepartMent("山东分公司技术部"));
        Company zaozhuangCom = new ConcreteCompany("枣庄办事处");
        zaozhuangCom.add(new ITDepartMent("枣庄办事处财务部"));
        zaozhuangCom.add(new HRDepartMent("枣庄办事处人力资源部"));
        Company jinanCom = new ConcreteCompany("济南办事处");
        jinanCom.add(new ITDepartMent("济南办事处财务部"));
        jinanCom.add(new HRDepartMent("济南办事处人力资源部"));
        shandongCom.add(jinanCom);
        shandongCom.add(zaozhuangCom);
        Company huadongCom = new ConcreteCompany("上海华东分公司");
        huadongCom.add(new HRDepartMent("上海华东分公司人力资源部"));
        huadongCom.add(new ITDepartMent("上海华东分公司技术部"));
        Company hangzhouCom = new ConcreteCompany("杭州办事处");
        hangzhouCom.add(new ITDepartMent("杭州办事处财务部"));
        hangzhouCom.add(new HRDepartMent("杭州办事处人力资源部"));
        Company nanjingCom = new ConcreteCompany("南京办事处");
        nanjingCom.add(new ITDepartMent("南京办事处财务部"));
        nanjingCom.add(new HRDepartMent("南京办事处人力资源部"));
        huadongCom.add(hangzhouCom);
        huadongCom.add(nanjingCom);
        root.add(shandongCom);
        root.add(huadongCom);
        root.display(0);
    }
}
