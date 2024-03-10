package utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class ReusableMethods {

    public static void koordinatTiklama(int x,int y, int wait) throws InterruptedException {
        TouchAction action=new TouchAction<>(Driver.getAndroidDriver());
        action.press(PointOption.point(x,y)).release().perform();
        Thread.sleep(wait);
    }

    public static void ekranYukariKaydirma(int x,int y,int z, int wait) throws InterruptedException {
        TouchAction action=new TouchAction<>(Driver.getAndroidDriver());
        action.press(PointOption.point(x,y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(wait)))
                .moveTo(PointOption.point(x,z))
                .release().perform();
        Thread.sleep(wait);
    }

    public static void scrollScreen(int x,int y,int z,int wait, int sleep) throws InterruptedException {
        TouchAction action=new TouchAction<>(Driver.getAndroidDriver());
        action.press(PointOption.point(x,y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(wait)))
                .moveTo(PointOption.point(x,z))
                .release().perform();
        Thread.sleep(sleep);
    }

 }

