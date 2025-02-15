package template_method.good;

import java.io.File;

public class ImageCVReportGeneration extends CVReportGeneration {

    @Override
    public Data extractData(File file) {
        System.out.println(" File Extracting data from: Img");
        return null;
    }

}
