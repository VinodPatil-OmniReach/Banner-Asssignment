public class VerticalBanner extends Banner{

    VerticalBanner(){
        super(766, 136, "title", "alt", "#", "");
        //this.setParams(766, 136, "_", "alt", "#", "");
    }

    VerticalBanner(String imageUrl, String imageSource){
        super(136, 766, "title", "alt", imageUrl, imageSource);
        //this.setParams(136, 766, "_", "alt", imageUrl, imageSource);
    }

    VerticalBanner(int height, int width, String imageTitle, String imageAlt, String imageUrl, String imageSource){
        super(height, width, imageTitle, imageAlt, imageUrl, imageSource);
        //this.setParams(height, width, imageTitle, imageAlt, imageUrl, imageSource);
    }


}
