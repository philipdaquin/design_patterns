
trait Shape { 
    fn move_(&self, x: usize, y: usize);
    fn draw(&self);
    fn accept(&self, visitor: &Box<dyn Visitor>);
}
/**
 * The visitor design pattern is used to represent an operation to be 
 * performed on the elements of an object structure.
 *  
 * - One of the motivations for using the visitor pattern is to avoid violating the open / closed 
 *   principle, which states that software entities should be open for extension 
 *   but closed for modification 
 * 
 * - Enables us to add new operations to existing object structures without modifying those structrues. It is one 
 *   way to follow the open / closed principled 
 *    
 *      Open and Closed Principled 
 *      - You should be able to add new functionality to a software entity by adding new code, but should not need to change 
 *         existing code in that entity 
 *      
 * 
 * In the Visitor pattern, an object traverses na object structure and performs some 
 * operation on each element in the struct 
 */
trait Visitor { 
    fn visit(&self, element: Box<dyn Shape>);
}


struct ConcreteElement;

impl Visitor for ConcreteElement {
    fn visit(&self, element: Box<dyn Shape>) {
        todo!()
    }
}

impl Shape for ConcreteElement {
    fn move_(&self, x: usize, y: usize) {
        todo!()
    }

    fn draw(&self) {
        todo!()
    }

    fn accept(&self, visitor: &Box<dyn Visitor>) {
        todo!()
    }
}

struct ObjectStructure { 
    element: Vec<ConcreteElement>
}

/**
 * Use the Visitor when you need to perform an operation on all elements of a complex object struct 
 */
impl ObjectStructure { 
    fn add_element(&mut self, element: ConcreteElement) { 
        self.element.push(element);
    }
    fn accept(&self, visitor: &Box<dyn Visitor>) { 
        for element in &self.element { 
            element.accept(visitor)
        }
    }
}
