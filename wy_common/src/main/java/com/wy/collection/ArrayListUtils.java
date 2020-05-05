package com.wy.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @描述
 * @创建人 wangyue
 * @创建时间2019/9/39:53
 * java集合接口：iterator--collection-list（set、queue）
 *     和iterator并列的有map接口
 *   list是有序可重复的；set是无序且唯一；queue是先进先出
 *   list常用实现类：ArrayList(基于动态数组实现，查询快，增删改慢）、LinkedList（基于双向列表、查询慢，增删改快）、vector（线程安全的，效率比较低）
 *   map的实现类：hashmap（基于数组+列表；1.8以后，改成数组+列表+红黑树（完全平衡的二叉树）、hashtable（线程安全，效率低）、treemap（基于红黑树的有序map集合）
 *   set 常用实现类：hashset、treeset；（set底层是map，只是取了map的key);map是key、value存储；set只存储key
 *
 *   ArrayList 在第一次赋值时开辟空间；默认开辟长度为10的空间（创建一个长度为10的数组Object[] elementData）；添加时，默认给从数组的下标为0的位置开始
 *   添加；添加有两个方法，默认添加到最后，可以根据下标进行添加；当list长度大于10时，就会进行扩容，扩容到1.5倍；
 *   扩容时，会根据新的长度创建一个新的数组；然后把就的数组的值copy到新数组里边； Arrays.copyOf；
 *   所以，arraylist的优化就是尽量减少扩容；如果提前能预知长度，在new 时，可以直接传入长度；
 *
 *   LinkedList底层主要包含：size大小；first（从前向后的单向列表）；last（从后向前的单向列表）
 *   fist和last都是一个node（节点）对象；node对象包含：E（传入的value）；和next（本身），prev（本身）；
 *   所有的集合，默认都是第一次添加值时，才开辟空间；给里边添加值时，首先把这个值组装成一个node对象；
 *   如果是第一次添加：比如添加1；node对象，E=1，next和value都是空； first=当前node对象；last也等于当前node对象；
 *   如果再添加1个值2；先创建node对象，E=2，next和value都是空； 调用first.setNext方法；把创建的node对象作为参数，给了first的next属性；
 *   调用创建的node对象的setnext方法，把last作为参数，set到node里边；然后直接把创建的node节点赋给last
 *
 *   平衡ArrayList和LinkedList直接的数据结构：hash槽结构（数组+列表）
 *   HashMap底层由数组table,节点Node<K,V>+单向列表组成；
 *   数组的初始默认长度是16；当一个k、v进来时，根据k可以得到hash值，然后把k、v、hash组成一个node节点；用hash对16求模，余几，就把这个node放到对应的hash槽；
 *   列表长度大于8时，会转换为红黑树；
 *   当值大于12个时，数组会进行扩容，扩容到原理的2倍；
 *
 */
public class ArrayListUtils {


    public void say() {
        System.out.println("123");
    }

    public static void main(String[] args) {
        /*List<String> list = new ArrayList<String>(100);
        list.add("1");
        list.add("1");
        list.add("1");*/
       /* List<String> list=new LinkedList<String>();
        list.add("1");
        list.add("1");*/
        Map<String,String> map = new HashMap<String,String>();
        map.put("1","12");
        map.put("2","12");
        map.put("3","12");
        map.put("4","12");
        map.put("5","12");
    }


}
