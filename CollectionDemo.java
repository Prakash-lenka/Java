import java.util.*;
import java.util.stream.Stream;


public class CollectionDemo {
    
    public static void main(String[] args) {
        
        // List<Integer> arr = new ArrayList<>();
        // List<Integer> nums = Arrays.asList(1,2,3,6,3,2);
        // arr.add(3);arr.add(2);arr.add(35);arr.add(12);arr.add(9);
        // System.out.println(arr);

        // Comparator<Integer> comInt = (i,j)-> i<j?1:-1;
        // Collections.sort(arr,comInt);
        // System.out.println(arr);
        // Collections.sort(nums,comInt);
        // System.out.println(nums);
        // Collections.reverse(nums);
        // System.out.println(nums);
        // nums.forEach(n->System.out.println(n));

        // List<String> strs = new ArrayList<>();
        // strs.add("prakash");strs.add("manju");strs.add("bdfd");strs.add("dkfjd");
        // System.out.println(strs);

        // Comparator<String> comStr1 = (i,j)-> i.length()>j.length()?1:-1;
        // Comparator<String> comStr2 = (i,j)-> i.charAt(1)>j.charAt(1)?1:-1;
        // Collections.sort(strs,comStr2);
        // System.out.println(strs);

        // List<Integer> nums = Arrays.asList(1,1,2,3,4,5,8,4,8,6,7,8,9);
        // nums.forEach(n->System.out.print(n+" "));
        // System.out.println();

        // Stream<Integer> s1 = nums.stream();
        // s1.forEach(n->System.out.print(n+" "));
        // System.out.println();

        // Stream<Integer> s2 = nums.stream().distinct();
        // s2.forEach(n->System.out.print(n+" "));
        // System.out.println();

        // long s3 = nums.stream().count();
        // System.out.println(s3);

        // Stream<Integer> s4 = nums.stream().filter(n->n%2==0);
        // s4.forEach(n-> System.out.print(n+" "));
        // System.out.println();

        // Stream<Integer> s5 = nums.stream().map(n->n*2);
        // s5.forEach(n->System.out.print(n+" "));
        // System.out.println();

        // int s6 = nums.stream().reduce(0,(c,e)->c+e);
        // System.out.println(s6);

        // List<Integer> nums = new ArrayList<>(10000);
        // Random ran = new Random();
        // for(int i = 0;i<10000;i++){
        //     nums.add(ran.nextInt(1000));
        // }

        // long t1 = System.currentTimeMillis();
        // int sum1 = nums.stream().mapToInt(i->i).sum();
        // System.out.println(System.currentTimeMillis()-t1);

        // long t2 = System.currentTimeMillis();
        // int sum2 = nums.parallelStream().mapToInt(i->i).sum();
        // System.out.println(System.currentTimeMillis()-t2);
        // System.out.println(sum1+" "+sum2);

        // List<Integer> nums = Arrays.asList(1,2,3,4,5);
        // nums.forEach(System.out::println);//method reference(we just have to mention the method name and the class it belongs to.)
        // // Example:
        // class Addi{
        //     public int a;
            
        //     public Addi(int a){
        //         this.a = a+2;
                
        //     }
        //     public static void add(int i){
        //         i+=2;
        //         System.out.print(i+" ");
        //     }

        //     @Override
        //     public String toString(){
        //         return "a: "+this.a;
        //     }
        // }

        // nums.forEach(Addi::add);

        // List<Addi> adds = new ArrayList<>();

        // Addi a = new Addi(2);
        // System.out.println(a);

        // adds = nums.stream().map(Addi::new).toList();// constructor reference.
        // System.out.println(adds);




        

    }
}
