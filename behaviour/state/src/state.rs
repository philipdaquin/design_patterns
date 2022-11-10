use crate::player::AudioPlayer;


pub struct StoppedState;
pub struct PausedState;
pub struct PlayingState;


pub trait State { 
    fn play(self: Box<Self>, player: &mut AudioPlayer) -> Box<dyn State>;
    fn stop(self: Box<Self>, player: &mut AudioPlayer) ->Box<dyn State>;
    fn render(&self, player: &mut AudioPlayer );
}

impl State for StoppedState {
    fn play(self: Box<Self>, player: &mut AudioPlayer) -> Box<dyn State> {
        player.play();

        return Box::new(PlayingState)
    }


    fn stop(self: Box<Self>, player: &mut AudioPlayer) -> Box<dyn State> {
        // change no state
        self
    }

    fn render(&self, player: &mut AudioPlayer) {
        
    }
}

impl State for PlayingState {
    /**
     * HEllo {@code }
     */
    fn play(self: Box<Self>, player: &mut AudioPlayer) -> Box<dyn State> {
        player.pause();
        return Box::new(StoppedState)
    }
    fn stop(self: Box<Self>, player: &mut AudioPlayer) -> Box<dyn State> {
        // change no state
        self
    }
    fn render(&self, player: &mut AudioPlayer) {
        self;
    }
}

impl State for PausedState {
    fn play(self: Box<Self>, player: &mut AudioPlayer) -> Box<dyn State> {
        player.pause();

        return Box::new(PlayingState)
    }

    fn stop(self: Box<Self>, player: &mut AudioPlayer) ->Box<dyn State> {
        player.pause();
        player.rewind();
        
        return Box::new(StoppedState)
    }

    fn render(&self, player: &mut AudioPlayer ) {
        todo!()
    }
}