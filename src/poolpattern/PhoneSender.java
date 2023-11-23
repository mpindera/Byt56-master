package poolpattern;

import java.util.Random;

public class PhoneSender extends Thread {
    public PhoneSender(int phoneNum) {
        super(String.format("T-%03d", phoneNum));
    }

    @Override
    public void run() {
        try {
            Telephone client = TelephonePoolManager.borrowClient();
            System.out.println("Thread ["+Thread.currentThread().getName()+"] borrowed  PhoneNum with Phone Number: ["+client.getPhoneNum()+"]");
            Thread.sleep(new Random().nextInt(10)*1000);
            TelephonePoolManager.returnClient(client);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
