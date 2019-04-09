import java.util.*;

public class Main {
    public static void main(String[] args) {
        //первая задача

        List<String> arr1 = new ArrayList<>();
        arr1.add("Word");
        arr1.add("Place");
        arr1.add("Bird");
        arr1.add("Sleep");
        arr1.add("Word");
        arr1.add("Cat");
        arr1.add("Dog");
        arr1.add("Mom");
        arr1.add("Sleep");
        arr1.add("Rose");
        arr1.add("Cat");
        arr1.add("Make");
        arr1.add("Cat");

        Set<String> arr2 = new HashSet<>();

        for (String s:arr1) {
            arr2.add(s);
        }
        System.out.println(arr1);
        System.out.println("Список уникальных слов :");
        System.out.println(arr2);

        Map<String, Integer> arrcount = new HashMap<>();

        for (String s:arr2) {
            arrcount.put(s,0);
        }

        for (String s:arr1) {
            if (arrcount.containsKey(s)){
                arrcount.put(s,arrcount.get(s)+1);
            }
        }
        System.out.println("Сколько раз встречается каждое слово :");
        System.out.println(arrcount);

        // вторая задача

        Phone dict = new Phone();
        dict.add("Smith","78945612");
        dict.add("Johnson","123458765");
        dict.add("Williams","456123154");
        dict.add("Moore","789465421");
        dict.add("Harris","15321654687");
        dict.add("Harris","46457987654");
        dict.get("Harris");
        dict.get("Smith");
        dict.get("2131");
    }
}
