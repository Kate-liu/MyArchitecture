package main

//import (
//	"container/list"
//	"fmt"
//)
//
////接⼝，关于树的遍历操作都在这⾥
//type tree interface {
//	do()
//}
//
////树的中间节点
//type node struct {
//	*list.List //（匿名）组合即继承，node拥有了list的特性
//	name       string
//}
//
////树的叶⼦
//type leaf struct {
//	name string
//}
//
//func (n node) do() {                             //定义即实现,node实现了tree接⼝
//	for e := n.Front(); e != nil; e = e.Next() { //node拥有了list的特性
//		e.Value.(tree).do()
//	}
//	fmt.Println(n.name + " node do something.")  // 写下面是深度优先遍历
//}
//func (n node) addSub(sub tree) {
//	n.PushBack(sub)
//}
//func (l leaf) do() { //定义即实现，leaf实现了tree接⼝
//	fmt.Println(l.name + " leaf do something.")
//}
//
//func main() {
//	//定义树的节点
//	n1 := node{list.New(), "n1"}
//	n2 := node{list.New(), "n2"}
//	l1 := leaf{"l1"}
//	l2 := leaf{"l2"}
//	//构造树的结构
//	n2.addSub(l2)
//	n1.addSub(n2)
//	n1.addSub(l1)
//	//遍历树
//	n1.do()
//}
