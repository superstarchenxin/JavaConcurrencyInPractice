# JavaCocurrencyInPractice
## 背景
通过学习《Java并发编程实战》，希望能够收获：  
1.**建立知识体系，更加深入理解JAVA的高效并发理论；**    
2.**理论结合实践，不断练习，用学到的知识解决实际项目的问题；**    
3.**建立一个业余时间的学习平台，方便大家交流切磋；**

## 两个概念
当我们讨论线程问题时，其实关注的是两个概念：可见性与原子性。

### 可见性
可见性就是对于AB两个线程共同操作了一个变量V，设计中A先修改了变量V；那么，A对V的修改对B是否可见。

### 原子性
原子性就是保证操作是原子的，所有中间状态都不会被其他线程访问到。

## 多线程问题
### 安全性问题
在前面我们提到了，如果多线程环境下不满足可见性和原子性，就会发生线程不安全，那到底什么是线程安全呢？在书中这么定义：

```
当多个线程访问某个类时，不管运行时环境采用何种调度方式或者这些线程将如何交替执行，并且在主调代码中不需要任何额外的同步或协调，这个类都能表现出正确的行为，那么就称这个类是线程安全的。
```

线程的安全性是指“永远不发生糟糕的事情”

### 活跃性问题
 线程的活跃性就是指“某件正确的事情最终会发生”。

### 性能问题
性能问题就是指“某件正确的事情最终会发生，应该尽快发生”。

## 实战部分
1. [Java Task Execution 任务的执行](src/main/java/multithread/task/executor)
2. [Java Task Cancel and Close 任务的取消与关闭](src/main/java/multithread/task/close)
3. [Java Lock 锁](src/main/java/multithread/lock)
4. [Java Pool 线程池](src/main/java/multithread/pool)
5. [Java Concurrent Tools Class 并发工具类+自定义同步工具（非阻塞算法等）](src/main/java/multithread/tools/)