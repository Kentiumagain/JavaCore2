import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone {
    Map <String, List<String>> phonedict = new HashMap();

    public void add(String sname, String phone){
        List<String> phones = phonedict.get(sname);
        if (phones == null){
            phones = new ArrayList<>();
            phonedict.put(sname,phones);
        }
        phones.add(phone);
    }
    public void get(String sname){
        if (phonedict.containsKey(sname)){
            System.out.printf("Для фамилии %s найдены номера:%n",sname);
            System.out.println(phonedict.get(sname));
        }
        else{
            System.out.println("Такой фамилии в списке нет.");
        }
    }
}
