
/** 
 *      The Composite Design Pattern 
 *      Is a structural design pattern that allows complex objects to be composed 
 *      of simpler objects in a hierachichal structure 
 * 
 *      The composite objects can be treated uniformly with the simpler objects 
 */
trait Component<T> where T: Fn() + Send + 'static { 
    fn render(&self);
    fn add_child(&mut self, child: T);
}

struct TextNode { 
    text: String
}

impl<T> Component<T> for TextNode where T: Fn() + Send + 'static   {
    fn render(&self) {
        println!("{{self.text:?}}")
    }

    fn add_child(&mut self, child: T)  {
        println!("Adding child to textnode ")
    }
}

struct Container<T: Fn() + Send + 'static>  { 
    children: Vec<T>
}

impl<T> Component<T> for Container<T> where T: Fn() + Send + 'static {
    fn render(&self) {
        for child in self.children.iter() { 
            child()
        }
    }
    fn add_child(&mut self, child: T){
        self.children.push(child)
    }
}