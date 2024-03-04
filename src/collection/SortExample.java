package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {


    public static class Emp implements  Comparable<Emp>{  // for using comparable we implements Comparable
        int id;
        String name;
        int phNo;

        @Override
        public String toString() {
            return "Emp{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", phNo=" + phNo +
                    '}';
        }

        @Override
        public int compareTo(Emp o) {// and override the compareTo method
            return this.id-o.id;
        }


        public Emp(int id, String name, int phNo) {
            this.id = id;
            this.name = name;
            this.phNo = phNo;
        }


    }


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(54);
        list.add(44);
        list.add(24);
        list.add(14);
        list.add(74);

        Collections.sort(list);


        // comparator and comparable is used to sort the list or array on basis of any condition


        ArrayList<Emp> emplist= new ArrayList<>();

        emplist.add(new Emp(2,"yogesh pandey",324567));

        emplist.add(new Emp(6,"Dheeraj Singh",324567));

        emplist.add(new Emp(1,"Vidir pandey",324567));

        emplist.add(new Emp(5,"yogesy",324567));
        emplist.add(new Emp(5,"yogesy",324567));

   Collections.sort(emplist);
        // comparable

        System.out.println(emplist.get(0));
        System.out.println(emplist.get(2));
        System.out.println(emplist.get(3));
        System.out.println(emplist.get(1));


    }
}
