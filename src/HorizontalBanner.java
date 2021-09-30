public class HorizontalBanner extends Banner{

    HorizontalBanner(){
        super(136, 766, "title", "alt", "#", "");
        //this.setParams(136, 766, "_", "alt", "#", "");
    }

    HorizontalBanner(String imageUrl, String imageSource){
        super(136, 766, "title", "alt", imageUrl, imageSource);
        //this.setParams(136, 766, "_", "alt", imageUrl, imageSource);
    }

    HorizontalBanner(int height, int width, String imageTitle, String imageAlt, String imageUrl, String imageSource){
        super(height, width, imageTitle, imageAlt, imageUrl, imageSource);
        //this.setParams(height, width, imageTitle, imageAlt, imageUrl, imageSource);
    }

}
