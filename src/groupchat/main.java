
package groupchat;


public class main extends Thread{
    
    @Override
    public void run(){
        Server.initiateSocket();
    }

    public static void main(String[] args) {
        main t = new main();
        t.start();
        System.out.println("Main Returned");
        
        IdandPassword idandPasswords = new IdandPassword();

        Loginpage loginPage = new Loginpage(idandPasswords.getLoginInfo());

    }
}
