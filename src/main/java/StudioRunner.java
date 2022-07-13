import CameraPackage.Camera;
import CameraPackage.CameraFactory;

public class StudioRunner {
    public static void main(String[] args) {
        CameraFactory camFactory = new CameraFactory();
        Camera canonFilm = camFactory.makeCamera(CameraFactory.CameraManufacturer.CANON_FILM);
        Photographer me = new Photographer(canonFilm);
        me.takePhotograph();
    }
}
