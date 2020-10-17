import java.util.*;

public class Assignment5 {
    static class Data{
        int id;
        String name;

        public Data(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    static class SortbyId implements Comparator<Data>{
        public int compare(Data a, Data b){
            return a.id-b.id;
        }
    }
    public static void main(String[] args) {
        Data d1=new Data(4,"abc");
        Data d2=new Data(10,"ab2");
        Data d3=new Data(5,"abc3");
        Data d4=new Data(6,"abc5");
        List<Data> data= new ArrayList<Data>();
        data.add(d1);data.add(d2);data.add(d3);data.add(d4);
       for(int i=0;i<data.size();i++){
           Collections.sort(data,new SortbyId());
       }
        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i).id+" "+data.get(i).name);
        }

    }


}

