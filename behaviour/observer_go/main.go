package main

func main() { 

	store := KeyValueStore{}

	store.Put("123", "asdas")

	f := store.Get("123")
	println("Hello world! %s", f)
}