package p1ArrayList;

import java.util.*;

public class ArrayListDemo {
    //1find duplicate
    public static void findduplicate(ArrayList<Integer>list){
        HashSet<Integer> seen =new HashSet<>();
        HashSet<Integer> duplicates= new HashSet<>();

        for(Integer n :list) {
            if(!seen.add(n)){
                duplicates.add(n);
            }
        }
        System.out.println(duplicates);
    }
    //2 Remove Duplicates:
    public static void removeDuplicates(ArrayList<Integer>list){
        LinkedHashSet<Integer> set =new LinkedHashSet<>(list);
        System.out.println(set);

    }
    //3. Find the Intersection of Two Lists:
    public static ArrayList<Integer> findIntersection(List<Integer>list1,List<Integer>list2){
        HashSet<Integer> set = new HashSet<>(list1);
        ArrayList<Integer> intersection = new ArrayList<>();

        for (Integer n :list2){
            if(set.contains(n)){
                intersection.add(n);
                set.remove(n);
            }
        }
        return intersection;
    }
//    4. Find the Union of Two Lists:
    public static HashSet<Integer> findUnion(List<Integer>list1,List<Integer>list2){
        HashSet<Integer> set =new HashSet<>(list1);
        set.addAll(list2);
        return set;
    }
//    5. Reverse an ArrayList:
    public static void reversArray(ArrayList<Integer> list){
        int left =0;
        int rigth = list.size()-1;

        while (left<=rigth){
            Integer temp =list.get(left);
            list.set(left, list.get(rigth));
            list.set(rigth,temp);
            left++;
            rigth--;
        }
    }
    public static void rotate(ArrayList<Integer> list,int k){

    }
    public static void sort(ArrayList<Integer> list){
        int n = list.size();

        for(int i =0;i<n-1;i++){
            for(int j =0; j<n-1-i; j++){
                if(list.get(j)>list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);

                }
            }
        }
    }
    public static int findlarg(ArrayList<Integer> list){
        int n = list.size();
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(max <list.get(i)){
                max =list.get(i);
            }
        }return max;
    }
    public static int findmin(ArrayList<Integer> list){
        int n = list.size();
        int min = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(min >list.get(i)){
                min =list.get(i);
            }
        }return min;
    }
    public static boolean palindrome(ArrayList<Integer> list){
        int l =0;
        int r = list.size()-1;
        while (l<r){
            if(!list.get(l).equals(list.get(r))){
                return false;
            }
            l++;
            r--;
        }return true;
    }
    public static void firstNonRepeated(ArrayList<Integer>list){
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i:list){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()==1){
                System.out.println("non repeted : "+e.getKey());
            }
        }

    }
    //find count
    public static void findCount(ArrayList<Integer>list){

        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i :list){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list  =new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);list.add(3);

        findduplicate(list);

        removeDuplicates(list);
        List<Integer> l1 =  Arrays.asList(5,3,5,1,2,34,100,43);
        List<Integer> l2 =  Arrays.asList(5,23,5,232,34,10,4);
        System.out.println(findIntersection(l1,l2));

        System.out.println(findUnion(l1,l2));

//5
        ArrayList<Integer> list4  =new ArrayList();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(7);
        list4.add(4);
        list4.add(1);
        list4.add(2);
        list4.add(3);
        reversArray(list4);
        System.out.println(list4);

        //6
        rotate(list4,3);

        //7
        sort(list4);
        System.out.println(list4);

        //8
        System.out.println(findlarg(list4));
        System.out.println(findmin(list4));
        //9
        ArrayList<Integer> list5  =new ArrayList();
        list5.add(1);
        list5.add(2);
        list5.add(3);
        list5.add(5);
        list5.add(3);
        list5.add(2);
        list5.add(1);
        System.out.println(palindrome(list5));
        //10

        firstNonRepeated(list5);
//        11
        findCount(list5);


    }
}
