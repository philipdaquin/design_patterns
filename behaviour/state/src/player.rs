use crate::state::State;


pub struct Track { 
    pub title: &'static str, 
    pub duration: i32, 
    cursor: u32
}

impl Track {
    fn new(title: &'static str, duration: i32) -> Self { 
        Self { 
            title, 
            duration,
            cursor: 0
        }
    }
}

pub struct AudioPlayer { 
    playlist: Vec<Track>,
    current_track: usize,
    volume: u8
}

impl Default for AudioPlayer { 
    fn default() -> Self {
        Self { 
            playlist: vec![
                Track::new("Track 1", 10),
                Track::new("Track 2", 10),
                Track::new("Track 3", 10),
                Track::new("Track 4", 10),
                Track::new("Track 5", 10)
            ],
            current_track: 0,
            volume: 25
        }
    }
}


impl AudioPlayer { 
    pub fn next_track(&mut self) { 
        self.current_track = (self.current_track + 1) % self.playlist.len();
    }
    pub fn current_track(&mut self) -> &mut AudioPlayer { 
        self.playlist[self.current_track];
    }
    pub fn play(&mut self) { 
        self.current_track().cursor = 10;
    }
    pub fn pause(&mut self) { 
        self.current_track = 0;
    }
}