package directoryLister;

import directoryLister.GUI;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JFileChooser;

/**
 *
 * @author Christopher Myung <Chris.Myung@gmail.com>
 */
public class DirectoryLister {


    private GUI gui;


    private String basePath;


    public DirectoryLister(GUI gui) {
        this.gui = gui;
    }


    public void selectDirectory() {
        gui.resetGUI();

        basePath = gui.getAbsoluteDirectoryPath();

        gui.setAddressLabelText(basePath);

        showDirectoryContents(basePath);
    }

    public void showDirectoryContents(String basePath) {

        File docFolder = new File(basePath);

        enumerateDirectory(docFolder);
    }
    private void enumerateDirectory(File f) {

        try {
            File[] files = f.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    gui.updateListing(file.getCanonicalPath(), "", "Folder", 
                            formattedDateString(file.lastModified()));
                    enumerateDirectory(file);
                } else {
                    gui.updateListing(file.getAbsolutePath(), getSizeString(file.length()),
                            "File", formattedDateString(file.lastModified()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String getSizeString(long size) {
        long kbSize = size / 1024;

        return "" + kbSize + " KB";
    }

    private String formattedDateString(long time) {
        Date d = new Date(time);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aaa");

        return sdf.format(d);
    }
}
