package Code_Workouts.JavaWorkouts.GoogleKMS;
import java.io.*;
import java.util.Properties;
import java.util.Scanner;

//Created decryption process for GoogleKMS using commandLine through Java
public class CommandLineDecryptionGoogleKMS {

        public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in);

            String encryptedFile,decryptedFile,keyring,key,location,project;
            System.out.println("Google KMS : File Encryption \nEnter the project name:");
            project = scan.nextLine();
            System.out.println("Enter the location");
            location = scan.nextLine();
            System.out.println("Enter the Keyring");
            keyring = scan.nextLine();
            System.out.println("Enter the key");
            key = scan.nextLine();
            System.out.println("Enter the path of the file to decrypt");
            encryptedFile = scan.nextLine();
            System.out.println("Suggest a name for the decrypted file");
            decryptedFile = scan.nextLine();

            String cmd = "cd \"C:\\Users\\raj mohan\\AppData\\Local\\Google\\Cloud SDK\" && gcloud kms decrypt --project "+project+" --location "+location+" --keyring "+keyring+" --key "+key+" --ciphertext-file "+encryptedFile+" --plaintext-file C:\\Users\\raj\" \"mohan\\Desktop\\"+decryptedFile+".txt";

            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", cmd);
            Process process = builder.start();
            process.waitFor();
            System.out.println("The file is decrypted and saved in desktop");

            // ----------------------------

            System.out.println("Here are the decrypted information from the file");
            File file = new File("C:\\Users\\raj mohan\\Desktop\\"+decryptedFile+".txt");
            getCredentials(file);

    }
    public static void getCredentials(File file){
        try (InputStream input = new FileInputStream(file)) {

            Properties prop = new Properties();

            prop.load(input);

            prop.keySet().forEach(x -> System.out.println(x+" has "+prop.get(x)));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}

// Output:
/*
        Google KMS : File Encryption
        Enter the project name:
        secretsmanagement-staging
        Enter the location
        global
        Enter the Keyring
        anywhereworks
        Enter the key
        anywhereworks-default
        Enter the path of the file to decrypt
        D:/staging.properties.encrypted
        Suggest a name for the decrypted file
        DecryptFileOne
        The file is decrypted and saved in desktop
        Here are the decrypted information from the file
        FULLSTORAGE_SIGNKEY has nKjnKjnjJbkjBkjBkjBKmoojhjgiu
        FULLAUTH_DEVCONSOLE_APIKEY has hHbJBIBHBHBJBKJBkijzvVJzkjKJbzKJkJkjB
        FULLSTORAGE_API_KEY has okjokjnjJJbkJbkJBJBkJbkJBkjbkJBkjjbbj
        FULLAUTH_APP_ID has KJNkjNKjKjkjbijbijoyuuvuyvIJbij
        FULLAUTH_CLIENT_ID has JkjbkjbkKJbkjbkjbkjknij
        FULLAUTH_CLIENT_SECRET has nkjhbJBIKJBkJBkjKhIHbkJBkJnLKNoIubuyfyt67
*/
