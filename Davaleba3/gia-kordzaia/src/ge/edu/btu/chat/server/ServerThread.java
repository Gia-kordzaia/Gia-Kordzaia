package ge.edu.btu.chat.server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class ServerThread extends Thread{


    private Socket client;
    private  int clientID;
    private boolean running = true;

    public ServerThread(Socket client, int clientID) {
        this.client = client;
        this.clientID = clientID;
    }

    @Override
    public void run() {
        System.out.println("დავაკშირებული კლიენტის: ID - " + clientID + " : მისამართი - " + client.getInetAddress().getHostName());

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(Socket.getOutputStream());

        try {

            System.out.println("მიმდინარეობს მონაცემების წაკითხვა ...");
            ObjectInputStream objectInputStream = new ObjectInputStream(client.getInputStream());
            String str = (String) objectInputStream.readObject();
            if (str == "მითხარი ეროვნული ვალუტის კურსი") {
                objectOutputStream.writeObject(3.3021);
            }
            else if ( str == "მაჩვენე ფილიალები") {
                objectOutputStream.writeObject("ი.ჭავჭავაძის გამზ., ვაჟა ფშაველას გამზ., გურამიშვილის გამზ");
            }
            else if ( str == "ნახვამდის") {
                objectOutputStream.writeObject("დასრულებულია");
            } else {
                objectOutputStream.writeObject("სამწუხაროდ ამ კითხვაზე პასუხი არ მაქვს ");
            }

        } catch (Exception e) {
            System.out.println("მოხდა შეცდომა : " + e);
        }
    }



}