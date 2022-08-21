import com.collection.Read;
import com.collection.ShowDetails;

public class Main {
    public static void main(String[] args) {

        while (true){
            Read read = new Read();
            switch (read.readInput()){
                case 0:
                    return;
                case 1:
                    read.readValue();
                    break;
                case 2:
                    new ShowDetails().print();
                    break;
                default:
                    System.out.println("Enter valid input!!");
                    break;
            }
        }

    }
}