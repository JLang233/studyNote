## 集合 Collection

接口 Collection 表示集合，一组对象

![img](../img/java-coll.png)

### ArrayList

数组实现的一个有序的列表，具备数组的优缺点：

- 支持快速随机访问
- 插入元素较慢

数组列表：

    List<String> list = new ArrayList<>();

一些方法：
list.add(E e) 向尾部添加元素
list.add(int index,E e) 将指定元素插入指定位置
list.addAll() 按照指定 collection 的迭代器所返回的元素顺序，将该 collection 中的所有元素添加到此列表的尾部。
clone() 返回此 ArrayList 实例的浅表副本。
get(int index) 返回此列表中指定位置上的元素。

数组转成 list，但这是个山寨版，支持查询操作，不支持修改操作

    List list = Arrays.asList("aaa","bbb","ccc");

### LinkedList

    List<String> list = new LinkedListList<>();

双向链表实现的一个有序的列表，又实现了 Queue，又是一个队列或者栈

### HashSet

无序的不可重复的

    Set<String> set = new HashSet<>();

add() 如果此 set 中尚未包含指定元素，则添加指定元素。
Iterator<E> iterator() 返回对此 set 中元素进行迭代的迭代器。

### 一些操作方法

在类中重写 toString(),可以按你想要的方式输出

```java
public String toString() {
        return id + "\t"+name+"\t"+age+"\n";
    }
```

在类中重写 equals(),(可以通过编译器生成)，可以自定义判断方法。

```java
@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
```
在类中重写compareTo，可以实现自定义比较大小。此时调用Collections.sort将会使用这个作为判断依据。
// 需要继承Comparable<>接口

```java
    @Override
    public int compareTo(Hero o) {
        return this.blood - o.blood;
    }
```

通过Collections.sort实现自定义排序

    Collections.sort(list,(x,y) -> {return y.getAge() - x.getAge();});

### 迭代器

```java
Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
```


### 背包问题

### 红黑二叉树
