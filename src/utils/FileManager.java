package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class FileManager {
    
    public static String getExtendPart(String path) {
        return path.substring(path.lastIndexOf("."), path.length());
    }
    
    public static String chooseFile() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            return fileChooser.getSelectedFile().getAbsolutePath();
        return null;
    }
    
    public static void writeTxt(String text, String path) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        printWriter.print(text);

        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();
    }
        
    public static void writeDocx(String text, String path) throws Exception {
        XWPFDocument document = new XWPFDocument();
        XWPFParagraph paragraph1 = document.createParagraph();
        XWPFRun run = paragraph1.createRun();
        run.setText(text);

        FileOutputStream out = new FileOutputStream(path, false);
        document.write(out);
        document.close();
        out.close();
    }
    
    public static String scanTxt(String path) throws IOException {
        Scanner fileScanner = new Scanner(new File(path));
        String text = "";
        
        boolean flag = false;
        while (fileScanner.hasNextLine()) {
            String curLine = fileScanner.nextLine();
            if (flag)
                text += "\n" + curLine;
            else text += curLine;
            flag = true;
        }
        
        return text;
    }
    
    public static String scanDocx(String path) throws Exception {
        FileInputStream fileScanner = new FileInputStream(path);
        XWPFDocument document = new XWPFDocument(OPCPackage.open(fileScanner));
        List<XWPFParagraph> paragraphList = document.getParagraphs();
        
        String text = "";
        boolean flag = false;
        for (XWPFParagraph paragraph : paragraphList) {
            if (flag) {
                text += "\n" + paragraph.getText();
            }
            else {
                text += paragraph.getText();
                flag = true;
            }
        }
        fileScanner.close();
        
        return text;
    }
}
