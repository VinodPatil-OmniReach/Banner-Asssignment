public abstract class Banner {

    protected String imageUrl;
    protected String imageSource;
    protected int height;
    protected int width;
    protected String imageTitle;
    protected String imageAlt;

    Banner(int height, int width, String imageTitle, String imageAlt, String imageUrl, String imageSource){
        this.setImageTitle(imageTitle);
        this.setImageAlt(imageAlt);
        this.setImageUrl(imageUrl);
        this.setImageSource(imageSource);
        this.setHeight(height);
        this.setWidth(width);
    }

    /*
    Setter methods
     */
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    public void setImageSource(String imageSource){
        this.imageSource = imageSource;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setImageTitle(String imageTitle){
        this.imageTitle = imageTitle;
    }

    public void setImageAlt(String imageAlt){
        this.imageAlt = imageAlt;
    }

    /*
    Getter methods
     */
    public int getHeight(){
        return this.height;
    }

    public int getWidth(){
        return this.width;
    }

    public String getImageUrl(){
        return this.imageUrl;
    }

    public String getImageSource(){
        return this.imageSource;
    }

    public String getImageTitle(){
        return this.imageTitle;
    }

    public String getImageAlt(){
        return this.imageAlt;
    }

    /*protected void setParams(int height, int width, String title, String alt, String imageUrl, String imageSource){
        this.setHeight(height);
        this.setWidth(width);
        this.setImageAlt(alt);
        this.setImageTitle(title);
        this.setImageSource(imageSource);
        this.setImageUrl(imageUrl);
    }*/

}
