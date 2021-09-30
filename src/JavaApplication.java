import java.util.ArrayList;
import java.util.List;

public class JavaApplication {

    public static void main(String args[]){

        CreateFile c = new CreateFile();
        List<Banner> bl  = new ArrayList<Banner>();

        /*
        First Page banner
         */
        Banner h1 = new HorizontalBanner("/url11", "/source11");
        Banner h2 = new HorizontalBanner(120, 766, "horizontal title", "horizontal alt","/url12", "/source12");

        bl.add(h1);
        bl.add(h2);

        c.saveToFile(bl, "Page1.html");

        /*
        Second Page banner
         */
        Banner v1 = new VerticalBanner("/url21", "/source21");
        Banner v2 = new VerticalBanner(800, 300, "Vimage", "vimage","/url22", "source22");

        bl.clear();
        bl.add(v1);
        bl.add(v2);

        c.saveToFile(bl, "Page2.html");

        /*
        Third Page banner
         */
        Banner h3 = new HorizontalBanner();
        Banner v3 = new VerticalBanner();

        bl.clear();
        bl.add(h3);
        bl.add(v3);

        c.saveToFile(bl, "Page3.html");

    }
}
