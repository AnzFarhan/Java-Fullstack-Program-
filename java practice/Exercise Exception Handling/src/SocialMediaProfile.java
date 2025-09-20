import java.lang.AutoCloseable;

public class SocialMediaProfile implements AutoCloseable {

    public String username;
    public int age;
    public String bio;

    @Override
    public void close() throws Exception {

    }

    public void createProfile(String username, int age, String bio) throws IllegalArgumentException, IndexOutOfBoundsException{

        if(username == null || username.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid empty username! Please enter your name");
        }

        if(age < 13 || age > 120){
            throw new IllegalArgumentException("Invalid! Age must 13 between 120");
        }

        if(bio.length() > 160){
            throw new IndexOutOfBoundsException("Bio should be less than 160 characters");
        }

    }

}
