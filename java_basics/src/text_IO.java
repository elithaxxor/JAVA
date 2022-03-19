import java.io.*;

/* to write to text files  */
public class text_IO {
    public static void main(String[] args) throws IOException {
        String[] names = {"shallow", "pedantic", "measeals"};
        try{
            System.out.println("to write to text files");
            //[OBJECTS]
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")); // pass absolute path to render to specific dir
            writer.write("this is a string written to output.txt");
            writer.write("\n this is the second line posted to output.txt");

            for (String name : names){
                writer.write("\n" + name);
            }
            writer.close();


        }catch(IOException e){
                e.printStackTrace();
            }
       try{
           BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
           System.out.println(reader.readLine());

           // to read all lines in text (null == EOF)
           String line;
           while ((line = reader.readLine())!=null){
               System.out.println(line);
           }
           reader.close();
       }catch(IOException e){
           e.printStackTrace();
       }
    }
}
