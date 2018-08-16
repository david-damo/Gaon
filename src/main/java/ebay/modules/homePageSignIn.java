package ebay.modules;

import ebay.pages.HomePageEbay;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Sanjeev on 3/26/2018.
 */
public class homePageSignIn {
    public static void Execute(WebDriver driver) throws Exception{
        HomePageEbay.callSignInPageOrPopup.click();
    }
    public static void loginInput(WebDriver driver) throws Exception{
        //HomePageEbay.userId.sendKeys("sanjeev.jha77@gmail.com");

        JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
        myExecutor.executeScript("arguments[0].value='sanjeev.jha77@gmail.com';", HomePageEbay.userId);

        HomePageEbay.pass.sendKeys("Jpmc@123");
    }
    public static void loginInputUncheck(WebDriver driver) throws Exception{
        Thread.sleep(3000);
        if(!HomePageEbay.uncheckSignin.isSelected()){
            HomePageEbay.uncheckSignin.click();
        }
    }
    public static void loginInputSubmit(WebDriver driver) throws Exception{
        HomePageEbay.loginInputSubmit.click();
    }
    public static void chkMyLink(WebDriver driver) throws Exception{
        int i=0;
        Finder f;
        Region currentRe=new Screen(0);
        System.out.println(currentRe.getX());
        System.out.println(currentRe.getY());
        System.out.println(currentRe.getW());
        System.out.println(currentRe.getH());
        ///////////////To be deleted
        Screen screen=new Screen();
        Pattern pa1=new Pattern("C:/Amy/flashAuto/ratesust/images/All.png");
        String img=screen.capture().save("C:/Amy/flashAuto/ratesust/images", "image");
        //Match m=find("");


        //End of deletion
        try{
            takePictureOfError("snapTest");
            System.out.println("Checking...");
            f=new Finder("/images/myLink.png");
            //Finder ff= new Finder("path/to/image", new Region(0, 0,4, 4));
            System.out.println("matching the image...");
            f.findAll("/images/myLink.png");
            System.out.println("matching image found...");
            //f.find("C:\\chrome3.png", 0.95);
            while(f.hasNext()) {

                System.out.println("found");
                Match m = f.next();
                f.destroy();
                i++;
                System.out.println("abc "+i);
            }
        }catch (Exception e){System.out.println("Not found...");}

    }
    //////////////////////////
    public static void takePictureOfError(String Name) throws IOException, AWTException {
        new File("Errors").mkdir();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        Rectangle screenRect = new Rectangle(screenSize);
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(screenRect);
        //utilsLogger.info(ImageIO.write(image, "png", new File("//"  + Name)));
        ImageIO.write(image, "png", new File("Errors/"  + Name));
    }
}
