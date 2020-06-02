import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

class data{
        String name;
        int age;
        String address;

    public data(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "data{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
public class ReadFile {
    public static void main(String[] args) throws Exception {
        File file= new File("C:\\Users\\kartik\\Desktop\\psp.txt");
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String str=bufferedReader.readLine();
        Map<String,data> map=new HashMap<String, data>();
        while (str!=null){
            String arr[]=str.split(", ");
            StringBuffer address=new StringBuffer();
            for(int i=2;i<arr.length;i++){
                address.append(arr[i]);
                address.append(" ");
            }
            map.put(arr[0],new data(arr[0],Integer.parseInt(arr[1]),address.toString()));
            //str=bufferedReader.readLine();
        }

        System.out.println(map);
        //        StringBuffer stringBuffer=new StringBuffer();
//        String string;

//        while((string=bufferedReader.readLine())!=null){
////            System.out.println(string);
//            stringBuffer.append(string);
//            stringBuffer.append("\n");
//        }
//        file.delete();
//        System.out.println(stringBuffer.toString());
    }
}