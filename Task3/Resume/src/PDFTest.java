import com.itextpdf.text.Document;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.IOException;
public class PDFTest {
    public void createPdf(String name) throws IOException {
        try (PDDocument document = new PDDocument()) {
            PDPage blankPage = new PDPage();
            document.addPage( blankPage );
            document.save(name);
        }
        Document doc = new Document();
    }

public class Main {
    public static void main(String[] args) {


    }
}

}