package helpers;

import java.io.File;




public class Utilities {

    // Get absolute path
    public static String getPathUpload() {
        String path = "";
        File file = new File("");
        String absolutePathOfFirstFile = file.getAbsolutePath();
        path = absolutePathOfFirstFile.replaceAll("/", "//");
        return path;
    }
}
