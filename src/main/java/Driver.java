import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;

import java.io.*;

public class Driver {

    public static void main(String[] args) throws IOException {
        File htmlSource = new File("./html/input2.html");
        File pdfDest = new File("./pdf/output.pdf");
        // pdfHTML specific code
        ConverterProperties converterProperties = new ConverterProperties();
        HtmlConverter.convertToPdf(new FileInputStream(htmlSource),
                new FileOutputStream(pdfDest), converterProperties);
    }
}
