public class ViewerApp {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light();
        Command lightOn = new LightOn(livingRoomLight);
        Command lightOff = new LightOff(livingRoomLight);

        MusicPlayer musicPlayer = new MusicPlayer();
        Command musicOn = new MusicPlay(musicPlayer);
        Command musicOff = new MusicPause(musicPlayer);
    
        remoteControl.setCommand(lightOn);
        remoteControl.clickButton();

        remoteControl.setCommand(lightOff);
        remoteControl.clickButton();

        remoteControl.setCommand(musicOn);
        remoteControl.clickButton();

        remoteControl.setCommand(musicOff);
        remoteControl.clickButton();
    }
}
