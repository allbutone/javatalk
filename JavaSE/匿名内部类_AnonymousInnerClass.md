#匿名内部类
常见的接口使用方式如下：
```java
class Demo5 {
    public static void main(String[] args) {
        test(new DaoImpl());
    }

    public static void test(Dao dao){
        d.add();
    }
}

interface Dao {
    void add();
}

class DaoImpl implements Dao {
    public void add(){
        System.out.println("这是方法实现");
    }
}
```
但我如果只想一次性使用 DaoImpl，那么可以使用 java 提供的“匿名内部类”，如下：
```java
class Demo5 {
    public static void main(String[] args) {
        // test(new DaoImpl());
        test(new Dao(){//在使用的时候一并实现
            public void add(){
                System.out.println("这是方法实现");
            }
        });
    }

    public static void test(Dao dao){
        d.add();
    }
}

interface Dao {
    void add();
}
```
其实匿名内部类就是一种语法层面的写法简化，所谓匿名就是你并不知道 Dao 的具体实现叫什么，但你却能够使用 Dao 的实现

##适用场景
如果你想一次性使用某个接口/抽象类，而且这个接口/抽象类内的方法声明并不多（一两个）
那么你可以使用“匿名内部类”来简化代码