# File-Organiser
A Java console application that organizes files in a folder into subfolders based on their file types using Java's File I/O
# Java File Organizer

This is a simple Java console application that organizes files in a directory by their extensions. It scans a folder and automatically moves files into subfolders based on their file types (e.g., `.txt`, `.pdf`, `.jpg`).

## 🧰 Features
- Scans a given folder for files
- Detects each file's extension
- Automatically creates subfolders (e.g., `TXTFiles`, `PDFFiles`, `JPGFiles`)
- Moves files into their respective folders
- Uses basic Java `File` and `IO` operations

## 📁 Example

**Before:**
testfiles/
├── notes.txt
├── resume.pdf
├── image.jpg

**After running the program:**
testfiles/
├── TXTFiles/notes.txt
├── PDFFiles/resume.pdf
├── JPGFiles/image.jpg
