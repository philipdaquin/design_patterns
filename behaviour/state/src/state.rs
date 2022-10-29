use crate::player::AudioPlayer;


pub struct StoppedState;
pub struct ReadyState;
pub struct PlayingState;


pub trait State { 
    fn play(self: Box<Self>, player: &mut AudioPlayer) -> Box<dyn State>;
    fn publish(self: Box<Self>, player: &mut AudioPlayer) ->Box<dyn State>;
    fn stop(&self, player: &mut AudioPlayer);
}