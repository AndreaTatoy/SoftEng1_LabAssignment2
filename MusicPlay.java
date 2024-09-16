public class MusicPlay implements Command {
    private MusicPlayer player;
    
    public MusicPlay(MusicPlayer player){
        this.player = player;
    }

    @Override
    public void execute(){
        player.play();
    }
}
