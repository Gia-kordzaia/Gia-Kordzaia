package ge.edu.btu;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.Scanner;

class Thread1 extends Thread{
    @Override
    public void run() {
        while (true){
            File directory=new File("C:\\Users\\giako\\Desktop\\BTU_DOCUMENT");
            int fileCount= Objects.requireNonNull(directory.list()).length;
            System.out.println(fileCount);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Thread2 extends Thread {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while (true) {
            System.out.println("შეიყვანეთ საძიებო სიტყვა : ");
            String find = scanner.nextLine();
            File location = new File("C:\\Users\\giako\\Desktop\\BTU_DOCUMENT");
            FilenameFilter contains = (directory, filename) -> filename.contains(find);
            File[] files = location.listFiles(contains);
            assert files != null;
            for (File f : files) {
                System.out.println("მოიძებნა "+f.getName());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
}