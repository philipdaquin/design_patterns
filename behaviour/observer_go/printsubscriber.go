package main

import ("fmt")

type PrintSubscriber struct {}

func (self PrintSubscriber) Update(k, v string) {
	fmt.Printf("key: %s - value: %s", k, v)
}