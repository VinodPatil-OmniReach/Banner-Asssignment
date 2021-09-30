import java.io.FileWriter;
import java.util.List;

public class CreateFile {

    public void saveToFile(List<Banner> bannerList, String fileName){
        String s = "";
        for (Banner i:bannerList){
            s += this.getStringData(i);
            s += "</br></br>";
        }
        this.writeToFile(s, fileName);
    }

    public void saveToFile(Banner b, String fileName){
        String s = this.getStringData(b);
        this.writeToFile(s, fileName);
    }

    public String getStringData(Banner b){

        String s = "";
        s += "Image Title : "+b.getImageTitle()+"</br>";
        s += "Image Alt : "+b.getImageAlt()+"</br>";
        s += "Image Height : "+b.getHeight()+"</br>";
        s += "Image Width : "+b.getWidth()+"</br>";
        s += "Redirection Link : "+b.getImageUrl()+"</br>";
        s += "Image Source : "+b.getImageSource()+"</br>";

        return s;
    }

    public void writeToFile(String data, String fileName){
        fileName = "./views/"+fileName;
        try{
            FileWriter writer = new FileWriter(fileName);
            writer.write(data);
            writer.close();
            System.out.println("Data Written To file Successfully");
        }
        catch (Exception e){
            System.out.println("Exception occured while writing data to file : ");
            e.printStackTrace();
        }
    }
}
