use std::{cell::RefCell, rc::Rc};

use manager::Originator;

use crate::{sample::OriginatorA, manager::{UndoManager, Memento}};

/**
 * 
 * Memento Design Pattern 
 *  - Provides the ability to restore an object to its previous state
 *    (undo via rollback).
 *  - The originator is the object that knows how to save itself and create memento objecs
 *  - The memento object stores the internal state of the originator 
 *  - The caretaker is an object that is responsible for the memento's safekeeping and it can be used to 
 *    to restore the originator to a previous state by providing the memento to the originator
 */

mod sample;
mod manager;
fn main() {


    let mut originator = OriginatorA { state: "Initial state".to_string() };
    let mut originator1 = OriginatorA { state: "StateA".to_string() };
    let mut originator2 = OriginatorA { state: "StateB".to_string() };
    let mut originator3 = OriginatorA { state: "StateC".to_string() };
    let mut undo_manager1 = UndoManager::new(&mut originator);
    
    // Save new states 
    undo_manager1.save_state(&mut originator1);
    undo_manager1.save_state(&mut originator2);
    undo_manager1.save_state(&mut originator3);
    println!("CURRENT STATES {:#?}", undo_manager1.caretakers);


    // Print a snapshpt of the current state


    undo_manager1.undo();
    // println!("UNDO {:#?}", undo_manager1.caretakers);

    undo_manager1.undo();
    // println!("{:#?}", undo_manager1.caretakers);

    undo_manager1.undo();
    // println!("{:#?}", undo_manager1.caretakers);

    undo_manager1.undo();

}
