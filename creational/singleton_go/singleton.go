package main

import (
	"fmt"
	"sync"
)

type Singleton struct { 
	data string 
}

// mutex is used to ensure that only one goroutine can execute the code 
var lock = &sync.Mutex{}
var instance *Singleton


// If the lock was not released in the defer statement, 
// and the function returns before the lock is released,
// other goroutines that are waiting for the lock will be blocked 
// indefinitely and the whole system will be in a deadlock state.
func getInstance() *Singleton { 
	if instance == nil { 
		// Acquire the lock 
		lock.Lock()

		// Release the lock even if the function returns a nil
		// `defer` allows you to schedule a function call to be executed 
		// after the surrounding function return s
		defer lock.Unlock()

		if instance == nil  {
			fmt.Println("Creating instance now")

			instance = &Singleton{}
		}
	}
	fmt.Println("Current instance")

	return instance
}
