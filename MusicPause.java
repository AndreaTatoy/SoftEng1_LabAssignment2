public class MusicPause implements Command{
    private MusicPlayer player;

    public MusicPause(MusicPlayer player){
        this.player = player;
    }

    @Override
    public void execute(){
        player.pause();
    }
}
