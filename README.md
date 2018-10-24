

# 设计模式

## 什么是[设计模式][1]
    
    软件设计模式又称设计模式，是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结。
    使用设计模式是为了提高代码的可重用性、为了让代码更容易被他人理解、为了提高保证代码的稳定性。
    它最早是由GoF(Gang of Four)四人帮提出来的，他们汲取了建筑设计领域里的思想，合力提练出来属于软件开发行业的一套软件设计模式，
    此套模式经过了多年行业内的实践，堪称经典，是成为高级程序员必练的技能之一。
    

## 为什么要学习设计模式

    设计模式更像是内功心法，它是一套固定的口决，但是并不是背会了口诀就可以浪迹天涯。  
    
    要真正掌握它还是要在实际的项目中多写代码，
    可能你并没有系统地学习过设计模式，但是在项目中为了方便代码的维护和拓展，你肯定或多或少都会使用了设计模式，只是你不知道而已;  
    
    那为什么还是学习设计模式呢，学习设计模式的意义又在哪里?自己好好写代码不就行了吗?    
    
    学习设计模式并不是让我们死板的套用，可以拓展我们的视野，可以在实际业务模型下，合理的组织和解耦我们的代码，
    可以真正的实现对修改封闭对扩展开放的效果，可以方便程序员在更高层次之间的沟通。
    
## [6大设计原则][28]

    设计模式多种多样，我们可能听过一些常用的设计模式，比如单例模式，适配器模式，观察者模式等等;
    然而却很少有人知道，设计模式是在遵循软件的6大设计原则的基础上提练出来的；
    6大设计原则过于简单，也过于抽象，同时在某个设计模式中可能在遵循某一原则的同时又违背了另一个原则;
    此处只是简单的说明一下6大设计原则，另外6大设计原则可简单的记为SOLID&迪米特法则
    
* 单一设计原则(Single Responsibility Principle, SRP)  

    ：即一个类只负责一个功能领域中的相应职责，或者可以定义为：就一个类而言，应该只有一个引起它变化的原因。  


* 开闭原则(Open-Closed Principle, OCP)

    ：一个软件实体应当对扩展开放，对修改关闭。即软件实体应尽量在不修改原有代码的情况下进行扩展。


* 里氏替换原则(Liskov Substitution Principle, LSP)

    ：所有引用基类（父类）的地方必须能透明地使用其子类的对象。


* 接口隔离原则(Interface  Segregation Principle, ISP)

    ：使用多个专门的接口，而不使用单一的总接口，即客户端不应该依赖那些它不需要的接口
 

* 依赖倒置原则(Dependency Inversion  Principle, DIP)

    ：抽象不应该依赖于细节，细节应当依赖于抽象。换言之，要针对接口编程，而不是针对实现编程。    
    

* 迪米特法则(Law of  Demeter, LoD)  

    ：也称最少知道原则,一个软件实体应当尽可能少地与其他实体发生相互作用    




## 23种设计模式

    根据设计模式的参考书 Design Patterns - Elements of Reusable Object-Oriented Software
    译名：(设计模式 - 可复用的面向对象软件元素)中所提到的设计模式,一共分为3大类，23种。

-------

| [1.创建型(Creational,5种)][2]|  [2.结构型(Structural,7种)][3]|  [3.行为型(Behavioral,11种)][4]
---- | --- | ---
| - [单例模式(pSingle)][5]| - [适配器模式(pAdapater)][10] | - [命令模式(pCommand)][11]
| - [工厂模式(pFactory)][6]| - [桥接模式(pBridge)][13]| - [策略模式(pStrategy)][12]
| - [抽象工厂(pAbsFactory)][7]| - [装饰模式(pDecorator)][14]| - [迭代器式(pIterate)][15]
| - [建设模式(pBuilder)][8]|  - [组合模式(pComposite)][17]| - [模板模式(pTemplate)][16]
| - [原型模式(pPrototype)][9]| - [门面模式(pFacade)][18]| - [责任链模式(pResponse)][21]
|                             | - [享元模式(pflyweight)][19]|- [观察者模式(pObserver)][22]  
|                             | - [代理模式(pProxy)][20]| - [状态模式(pState)][23] 
|                             |   | - [备忘录模式(pMemento)][24] 
|                             | | - [中介者模式(pMediator)][25] 
|                             | | - [访问者模式(pVisitor)][26] 
|                             | | - [解释器模式(pInterpreter)][27] 


[1]:http://www.runoob.com/design-pattern/design-pattern-intro.html
[2]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/creat
[3]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/behavior
[4]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/structure
[5]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/creat/psingle
[6]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/creat/pfactory
[7]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/creat/pfactoryabstracter
[8]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/creat/pbuilder
[9]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/creat/pprototy
[10]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/structure/padapter
[11]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/behavior/pcommand
[12]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/behavior/pstrategy
[13]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/structure/pbridge
[14]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/structure/pdecorator
[15]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/behavior/piterate
[16]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/behavior/ptemplate
[17]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/structure/pcomposite
[18]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/structure/pfacade
[19]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/structure/pflyweight
[20]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/structure/pproxy
[21]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/behavior/presponsibility
[22]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/behavior/pobserver
[23]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/behavior/pstate
[24]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/behavior/pmemento
[25]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/behavior/pmediator
[26]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/behavior/pvisitor
[27]:https://github.com/TimAimee/Pattern/tree/master/src/main/java/com/pattern/behavior/pinterpreter
[28]:https://www.jianshu.com/p/807bc228dbc2

 
