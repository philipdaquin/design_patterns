package main 

type Cache interface { 
	Put(k, v string)
	Get(k string) string
	Subscribe(subscriber Subscriber) bool
}

type KeyValueStore struct {
	Store   	map[string]string
	Subscribers []Subscriber
}

func (self KeyValueStore) Put(k, v string) { 
	self.Store[k] = k

	for _, subscriber := range self.Subscribers {
		subscriber.Update(k, v)
	}

}

func (self KeyValueStore) Get(k string) string { 
	return self.Store[k]
}



func (self KeyValueStore) Subscribe(subscriber ConcreteSubscriber) bool { 
	self.Subscribers = append(self.Subscribers, )
	return true
}