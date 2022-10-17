mod creator;
mod html_button;
mod windows_button;
mod init;

fn main() {
    println!("Hello, world!");

    let dialog = init::configure();
    dialog.render();
    dialog.refresh();
}
