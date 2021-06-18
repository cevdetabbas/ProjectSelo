import java.io.FileInputStream;
import java.util.Properties;

public class ConfReader
{
    private static Properties properties =new Properties();
    static
    {
        try
        {
        FileInputStream fileInputStream = new FileInputStream("conf.properties");
        properties.load(fileInputStream);
        fileInputStream.close();
        }catch (Exception e){}


    }
    public static String getProperty(String a)
    {
        return properties.getProperty(a);
    }
}
