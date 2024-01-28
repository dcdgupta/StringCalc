import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddNumbers {

private int totalValue;
private int acceptInput;

    public String getRawinput() {
        return Rawinput;
    }

    public void setRawinput(String rawinput) {
        Rawinput = rawinput;
    }

    private String Rawinput;

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public int getAcceptInput() {
        return acceptInput;
    }

    public void setAcceptInput(int acceptInput) {
        this.acceptInput = acceptInput;
    }

public int  AddValue() {
      return totalValue + acceptInput ;
}

public void Checknulldata() {
    System.out.println("Enetring checking if data changed");
    if (Rawinput.isEmpty() ) {
         this.setAcceptInput(0);
    }else
    {
        this.setAcceptInput(Integer.valueOf(Rawinput));
    }
}


    public static void main(String[] args) throws IOException {


        AddNumbers addNumbers = new AddNumbers();
        int totfn = 0;
        for (int ktr = 0 ; ktr<10 ; ktr++) {
            System.out.println("Enter Number");
            InputStreamReader inp = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(inp);
            String inputValue = br.readLine();
            addNumbers.setRawinput(inputValue);
            addNumbers.Checknulldata();
            System.out.println(addNumbers.getAcceptInput());


            totfn = addNumbers.AddValue();
            addNumbers.setTotalValue(totfn);
            System.out.println("Hello world!");
            System.out.println(addNumbers.getTotalValue());
        }
    }
}