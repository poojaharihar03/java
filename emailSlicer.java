public class emailSlicer {
    public static void main(String args[]){
        String str="programmer@gmail.com";//find substring b4 and aftr @
        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        String domain=str.substring(i+1, str.length());
        System.out.println("Username= "+uname);
        System.out.println("Domain= "+domain);
        System.out.println((domain.startsWith("gmail")));
    }
    
}
