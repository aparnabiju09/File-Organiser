import java.io.File;

public class Main {

    public static void main(String[] args) {
        String folderPath = "testfiles";
;  // Replace with test or simulated path
        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path.");
            return;
        }

        File[] files = folder.listFiles();
        if (files == null) {
            System.out.println("Folder is empty or not accessible.");
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                String ext = getFileExtension(file.getName());
                File subDir = new File(folderPath + "/" + ext.toUpperCase() + "Files");
                if (!subDir.exists()) subDir.mkdir();

                File dest = new File(subDir.getPath() + "/" + file.getName());
                boolean success = file.renameTo(dest);
                System.out.println((success ? "Moved:" : "Failed:") + " " + file.getName());
            }
        }

        System.out.println("File organization complete.");
    }

    private static String getFileExtension(String name) {
        int dotIndex = name.lastIndexOf('.');
        return (dotIndex > 0) ? name.substring(dotIndex + 1) : "Others";
    }
}
