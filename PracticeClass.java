import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class PracticeClass {

    int studentSize = 26;
    ArrayList<String> filledClass = new ArrayList<String>();
    

    public PracticeClass(){

    }

    public void assignStudentsClass(){
        String[] course = {"tech", "bio","music"};
        System.out.println(Arrays.toString(course));
        Random rand = new Random();
        
        for(int i = 1; i <= studentSize; i++){
            int randNum = rand.nextInt(3);
            filledClass.add(course[randNum]);
        }
        
    }

    public String turnArrayListIntoString(){
        //going to use String buffer to convert arraylist elements into strings
        StringBuffer strBuff = new StringBuffer();
        
        filledClass.forEach((el) -> {
            strBuff.append(el);
            strBuff.append(", ");
        });
       
       return strBuff.toString();
    }



    public static void main(String[] arg){
        PracticeClass cohort1 = new PracticeClass();
        cohort1.assignStudentsClass();
        System.out.println(cohort1.turnArrayListIntoString());
        System.out.println("done");
     
    }
}